package bepicky.common.data;

public interface DataTransformer<T> {

    <O> O transform(T data, Class<O> type);
}
