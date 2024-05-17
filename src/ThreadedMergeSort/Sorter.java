package ThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Task of sorting a particular array
public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService executor;

    Sorter(List<Integer> arrayToSort, ExecutorService executor) {
        this.arrayToSort = arrayToSort;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        // Base condition
        if(arrayToSort.size() == 1) {
            return arrayToSort;
        }

        // Split the array into two
        int mid = arrayToSort.size() / 2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i = 0; i < mid; i++) {
            leftArray.add(arrayToSort.get(i));
        }
        for(int i = mid; i < arrayToSort.size(); i++) {
            rightArray.add(arrayToSort.get(i));
        }

//        ExecutorService es = Executors.newCachedThreadPool();
        Sorter leftSorter =  new Sorter(leftArray , executor);
        Sorter rightSorter = new Sorter(rightArray , executor);

        Future<List<Integer>> leftSortedArrayFuture = executor.submit(leftSorter);
        Future<List<Integer>> rightSortedArrayFuture = executor.submit(rightSorter);

        List<Integer> sortedLeftArray =  leftSortedArrayFuture.get();
        List<Integer> sortedRightArray = rightSortedArrayFuture.get();

        // You have to wait for both of the arrays to get ready
        // merging

        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;

    }
}
