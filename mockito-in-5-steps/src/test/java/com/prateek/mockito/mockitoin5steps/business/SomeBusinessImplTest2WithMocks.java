package com.prateek.mockito.mockitoin5steps.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplTest2WithMocks {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;
	
	@Test
	void findTheGreatestFromAllDatabasicScenerio() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {23, 2, 45, 12});
		
		assertEquals(45, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllDataWithOneValue() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {23});
		
		assertEquals(23, businessImpl.findTheGreatestFromAllData());
	}
	
	@Test
	void findTheGreatestFromAllDataWithEmptyArray() {
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}

}




