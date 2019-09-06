package com.hp.devops.demoapp.something;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * check reports in case of failures in BeforeClass
 */
public class MyTest_beforeClassFailedNPETest {



	@Test
	public void passed1() {
		Assert.assertNotNull("aaa");
	}

	@Test
	public void passed2() {
		Assert.assertNotNull("aaa");
	}

	@Test
	public void failed_Assertion() {
		Assert.assertNotNull(null);
	}

	@Test
	public void failed_NullPointerException() {
		String s = null;
		System.out.println(s.length());
	}
}
