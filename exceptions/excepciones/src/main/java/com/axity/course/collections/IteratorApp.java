package com.axity.course.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorApp {

	public static void main(String[] args) {
		Collection<Integer> collection = Arrays.asList(1, 2, 3, 4, 5, 6);

		Iterator<Integer> it = collection.iterator();

		while (it.hasNext()) {
			Integer value = it.next();
			System.out.println(value);
		}
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

		List<Integer> listSync = Collections. synchronizedList(list);
		for (Integer i : listSync) {
			System.out.println(i);
		}

	}
}
