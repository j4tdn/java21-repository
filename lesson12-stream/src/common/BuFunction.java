package common;

public interface BuFunction<T, U, S, V, R> {

	R apply(T t, U u, S s, V v);
}
