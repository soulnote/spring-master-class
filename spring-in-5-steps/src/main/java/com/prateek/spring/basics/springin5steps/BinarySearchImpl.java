package com.prateek.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithms sortAlgorithms;
	
	public BinarySearchImpl(SortAlgorithms sortAlgorithms) {
		super();
		this.sortAlgorithms = sortAlgorithms;
	}

	
	public int binarySearch(int[]arr, int numberToSearchFor) {
		//use sorting methods to sort(bubble, quick sort etc)//this is tight coupled
		
		int []sortedArr = sortAlgorithms.sort(arr);
		System.out.println(sortAlgorithms);
		
		//apply the binary search algorithm
		return 3;// default return to avoid writing the whole code
	}
}
