package com.hp.devops.demoapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class megaTest2 {


	@Test
	public void sum_test_A() {
		assertEquals(3, Calcs.sum(1,5));
	}
}
