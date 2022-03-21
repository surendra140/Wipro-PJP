package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

	@Test
	public void test() {
		DailyTasks obj1 = new DailyTasks();
		String output_f1 = obj1.doStringConcat("Surendra", "Bankar");
		assertEquals("Surendra Bankar",output_f1);
	}

}
