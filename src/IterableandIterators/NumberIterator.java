package IterableandIterators;

import java.util.Iterator;

// Iterator will only iterate over numbers which are divisible by 5
public class NumberIterator implements Iterator<Integer> {

    int index;
    Numbers num;

    NumberIterator(Numbers num){
        index = 0;
        this.num = num;
    }
    // check if next data is available or not
    @Override
    public boolean hasNext() {
        while(index < num.numbers.size()){
            if(num.numbers.get(index) % 5 == 0){
                break;
            }
            index++;
        }
        return index != num.numbers.size();
    }

    // returns the next element
    @Override
    public Integer next() {

        return num.numbers.get(index++);
    }
}
