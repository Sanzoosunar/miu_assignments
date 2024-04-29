package lesson10.exercise;

public class GenericIsFake <T>{
    private T t;

    public GenericIsFake(T t) { this.t = t; }

    public GenericIsFake<T> copy() {
        return new GenericIsFake<>(t);
    }

    public T t() { return t; }
}
