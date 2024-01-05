package generic.class_interface;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface K21List<E> {

	boolean add(E e);

	boolean add(int index, E e);

	boolean remove(E e);

	boolean remove(int index);

	boolean removeIf(Predicate<E> predicate);

	E get(int index);

	E getOrDefault(int index, E defaultValue);

	void set(int index, E value);

	int size();

	int capacity();

	void forEach(Consumer<E> consumer);

}
