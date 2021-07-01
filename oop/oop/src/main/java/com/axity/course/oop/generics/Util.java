package com.axity.course.oop.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Util {

	public <T> int count(T[] array, T item) {
		int count = 0;
		for (T t : array) {
			if (item.equals(t)) {
				count++;
			}
		}
		return count;
	}

	public <T extends Number> List<T> fromArray(T[] array) {
		return new ArrayList<>(Arrays.asList(array));
	}
	
	

}
