package common;

@FunctionalInterface
public interface BuFunction<T, U, S, V, R> {
	R add(T t, U u, S s, V v);
}
