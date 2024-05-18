package com.prateek.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	private MyMath math = new MyMath();
	
	@Test
	void calculateSum_ThreeMemberArray() {
		//absence of failure is success
		//Test condition or asserts
		assertEquals(6, math.calculateSum(new int[] {1,2,3}));	
	}
	
	@Test
	void calculateSum_ZeroLengthArray() {
		//absence of failure is success
		//Test condition or asserts
		assertEquals(0, math.calculateSum(new int[] {}));	
	}

}
