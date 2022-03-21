package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

	DailyTasks obj1 = new DailyTasks();
	
	@Test
	public void test() {
		
		assertTrue("Result:", obj1.checkPresence("Surendra", "rendr"));
		assertFalse("Result:", obj1.checkPresence("Surendra", "Bankar"));
	}

}
