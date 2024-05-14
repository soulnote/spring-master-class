package com.example.demo;

public class BinarySearchImpl {
	
	private SortAlgorithms sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithms sortAlgorithm){
		super();
		this.sortAlgorithm = sortAlgorithm;
	} 
	
	public int binarySearch(int[]numbers, int numberToSearchFor) {
		
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		
		 
		
		//search the array
		
		return 3;
	}
	

}
