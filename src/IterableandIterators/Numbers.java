package IterableandIterators;

import java.util.Iterator;
import java.util.List;

public class Numbers implements Iterable<Integer> {
    public List<Integer> numbers;
    public Integer z;

    @Override
    public Iterator<Integer> iterator() {
        return new NumberIterator(this);
    }
}
