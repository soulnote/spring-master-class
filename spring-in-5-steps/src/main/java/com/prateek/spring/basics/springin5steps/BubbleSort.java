package com.prateek.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithms{
	public int[]sort(int[]arr){
		return arr;
	}
}
