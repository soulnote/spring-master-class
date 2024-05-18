package com.prateek.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	
	List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");
	
	@Test
	void test() {
		boolean test = todos.contains("AWS");
		assertEquals(true, test);
		assertEquals(3, todos.size());

	}

}
