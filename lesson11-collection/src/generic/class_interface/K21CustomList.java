package generic.class_interface;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class K21CustomList<E> implements K21List<E> {
	
	private static final int DEFAULT_CAPACITY = 5;
	
	private int size;
	private E[] elements;
	
	public K21CustomList() {
		
	}
	
	public K21CustomList(int initialCapacity) {
		
	}

	@Override
	public boolean add(E e) {
		return false;
	}

	@Override
	public boolean add(int index, E e) {
		return false;
	}

	@Override
	public boolean remove(E e) {
		return false;
	}

	@Override
	public boolean remove(int index) {
		return false;
	}

	@Override
	public boolean removeIf(Predicate<E> predicate) {
		return false;
	}

	@Override
	public E get(int index) {
		return null;
	}

	@Override
	public E getOrDefault(int index, E defaultValue) {
		return null;
	}

	@Override
	public void set(int index) {
		
	}

	@Override
	public int size() {
		return 0;
	}

	public int capacity() {
		return 0;
	}

	public void forEach(Consumer<E> consumer) {
		
	}

}
