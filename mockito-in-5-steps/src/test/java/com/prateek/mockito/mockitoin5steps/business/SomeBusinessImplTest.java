package com.prateek.mockito.mockitoin5steps.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void findTheGreatestFromAllDatabasicScenerio() {
		DataService dataServiceStub1 = new DataServiceStub1();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub1);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(34, result);
	}
	
	@Test
	void findTheGreatestFromAllDataWithOneValue() {
		DataService dataServiceStub2 = new DataServiceStub2();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub2);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}


class DataServiceStub1 implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24, 23 , 34};
	}
	
}

class DataServiceStub2 implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24};
	}
	
}