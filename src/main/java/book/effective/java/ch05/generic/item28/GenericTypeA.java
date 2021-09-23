package book.effective.java.ch05.generic.item28;

public class GenericTypeA<T> {
    private T t;

    public GenericTypeA(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
