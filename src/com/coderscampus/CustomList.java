package com.coderscampus;

public interface CustomList<T> {

	boolean add(T item);

	int getSize();

	T get(int index);
	
	boolean add(int index, T item) throws IndexOutOfBoundsException;

    T remove(int index) throws IndexOutOfBoundsException;
}
