package com.prateek.mockito.mockitoin5steps.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest2WithMocks {

	@Test
	void findTheGreatestFromAllDatabasicScenerio() {
		
		DataService dataServiceMock =  mock(DataService.class);
		
//		dataServiceMock.retrieveAllData() => new int[] {23, 2, 45, 12};//it will give nullpointer exception
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {23, 2, 45, 12});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(45, result);
	}
	


}




