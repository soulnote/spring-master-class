package com.prateek.mockito.mockitoin5steps.business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}


	public int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatestValue = Integer.MIN_VALUE;
		for(int i=0;i<data.length;i++) {
			if(data[i]>greatestValue)
				greatestValue = data[i];
		}
		return greatestValue;
	}
}
interface DataService{
	int[] retrieveAllData();
}