package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {

	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		growArray();
		items[size] = item;
		size++;

		return true;

	}

	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (size == items.length) {
			growArray();
		}

		// needs to loop to shift elements
		for (int i = size ; i > index; i--) {
			items[i] = items[i - 1];
		}
		items[index] = item;
		size++;
		return true;

	}

	private void growArray() {
		if (size == items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}
	}

	@Override
	public int getSize() {

		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {

		return (T) items[index];

	}

	public T remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		@SuppressWarnings("unchecked")
		T removedItem = (T) items[index];
		for (int i = index; i < size - 1; i++) {
			items[i] = items[i + 1];
		}
		items[size - 1] = null;
		size--;
		return removedItem;

	}

}
