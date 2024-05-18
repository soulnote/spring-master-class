package com.prateek.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeofreAfterTest {

	@BeforeAll
	static void beforeAll() {
		System.out.println("before all ");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each");
	}
	
	@Test
	void test1() {
		System.out.println("test1");
	}
	@Test
	void test2() {
		System.out.println("test3");
	}
	@Test
	void test3() {
		System.out.println("test3");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After each \n");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("after all ");
	}

}
