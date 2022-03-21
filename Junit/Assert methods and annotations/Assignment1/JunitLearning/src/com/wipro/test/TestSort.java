package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

	@Test
	public void test() {
		int[] resArr = {14,12,16,18};
    	int[] expArr = {12,14,16,18};
	
		DailyTasks obj1 = new DailyTasks();
		int[] output_f2 = obj1.sortValues(resArr);
		assertArrayEquals(expArr, output_f2);
    }
}


