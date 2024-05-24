package Generics;

public class Pair <V , S>{
    private V first;
    private S second;

    public Pair(V first, S second){
        this.first = first;
        this.second = second;
    }

    public V getFirst() {
        return first;
    }

    public void setFirst(V first) {
        this.first = first;
//        this.first += 5;
    }

    public static <T, X> T doSomething(T temp){
        return temp;
    }

    public <Z> V doAnother(Z temp){
        return this.first;
    }
}


