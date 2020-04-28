package com.hp.devops.demoapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class megaTest {


	@Test
	public void sum_test_A() {
		assertEquals(3, Calcs.sum(1,5));
	}

	@Test
	public void sub_test_A() {
		assertEquals(4, Calcs.sub(5, 1));
	}

	@Test
	public void sub_test_B() {
		assertEquals(2, Calcs.sub(-1, -3));
	}

	@Test
	public void sub_test_C() {
		assertEquals(3, Calcs.sub(10, 7));
	}

	@Test
	public void eq_test_A() {
		assertTrue(Calcs.equal(1, 1));
	}

	@Test
	public void eq_test_B() {
		assertTrue(Calcs.equal(-1, -1));
	}

	@Test
	public void neq_test_A() {
		assertTrue(Calcs.nonEqual(0, 1));
	}

  @Test
	public void neq_test_B() {
		assertTrue(Calcs.nonEqual(-1, 0));
	}

	@Test
	public void neq_test_C_BrokenTest() {
		assertTrue(Calcs.nonEqual(5, 5));
	}

	@Test
	public void always_true_A() {assertTrue(Calcs.alwaysTrue());}

	@Test
	public void always_false_A() {assertTrue(Calcs.alwaysTrue());}

  @Test
	public void sum_test_A1() {
		assertEquals(3, Calcs.sum(1,5));
	}

	@Test
	public void sub_test_A1() {
		assertEquals(4, Calcs.sub(5, 1));
	}

	@Test
	public void sub_test_B1() {
		assertEquals(2, Calcs.sub(-1, -3));
	}

	@Test
	public void sub_test_C1() {
		assertEquals(3, Calcs.sub(10, 7));
	}

	@Test
	public void eq_test_A1() {
		assertTrue(Calcs.equal(1, 1));
	}

	@Test
	public void eq_test_B1() {
		assertTrue(Calcs.equal(-1, -1));
	}

	@Test
	public void neq_test_A1() {
		assertTrue(Calcs.nonEqual(0, 1));
	}

  @Test
	public void neq_test_B1() {
		assertTrue(Calcs.nonEqual(-1, 0));
	}

	@Test
	public void neq_test_C_BrokenTest1() {
		assertTrue(Calcs.nonEqual(5, 5));
	}

	@Test
	public void always_true_A1() {assertTrue(Calcs.alwaysTrue());}

	@Test
	public void always_false_A1() {assertTrue(Calcs.alwaysTrue());}


  @Test
	public void sum_test_A2() {
		assertEquals(3, Calcs.sum(1,5));
	}

	@Test
	public void sub_test_A2() {
		assertEquals(4, Calcs.sub(5, 1));
	}

	@Test
	public void sub_test_B2() {
		assertEquals(2, Calcs.sub(-1, -3));
	}

	@Test
	public void sub_test_C2() {
		assertEquals(3, Calcs.sub(10, 7));
	}

	@Test
	public void eq_test_A2() {
		assertTrue(Calcs.equal(1, 1));
	}

	@Test
	public void eq_test_B2() {
		assertTrue(Calcs.equal(-1, -1));
	}

	@Test
	public void neq_test_A2() {
		assertTrue(Calcs.nonEqual(0, 1));
	}

  @Test
	public void neq_test_B2() {
		assertTrue(Calcs.nonEqual(-1, 0));
	}

	@Test
	public void neq_test_C_BrokenTest2() {
		assertTrue(Calcs.nonEqual(5, 5));
	}

	@Test
	public void always_true_A2() {assertTrue(Calcs.alwaysTrue());}

	@Test
	public void always_false_A2() {assertTrue(Calcs.alwaysTrue());}


  @Test
	public void sum_test_A3() {
		assertEquals(3, Calcs.sum(1,5));
	}

	@Test
	public void sub_test_A3() {
		assertEquals(4, Calcs.sub(5, 1));
	}

	@Test
	public void sub_test_B3() {
		assertEquals(2, Calcs.sub(-1, -3));
	}

	@Test
	public void sub_test_C3() {
		assertEquals(3, Calcs.sub(10, 7));
	}

	@Test
	public void eq_test_A3() {
		assertTrue(Calcs.equal(1, 1));
	}

	@Test
	public void eq_test_B3() {
		assertTrue(Calcs.equal(-1, -1));
	}

	@Test
	public void neq_test_A3() {
		assertTrue(Calcs.nonEqual(0, 1));
	}

  @Test
	public void neq_test_B3() {
		assertTrue(Calcs.nonEqual(-1, 0));
	}

	@Test
	public void neq_test_C_BrokenTest3() {
		assertTrue(Calcs.nonEqual(5, 5));
	}

	@Test
	public void always_true_A3() {assertTrue(Calcs.alwaysTrue());}

	@Test
	public void always_false_A3() {assertTrue(Calcs.alwaysTrue());}


  @Test
	public void sum_test_A4() {
		assertEquals(3, Calcs.sum(1,5));
	}

	@Test
	public void sub_test_A4() {
		assertEquals(4, Calcs.sub(5, 1));
	}

	@Test
	public void sub_test_B4() {
		assertEquals(2, Calcs.sub(-1, -3));
	}

	@Test
	public void sub_test_C4() {
		assertEquals(3, Calcs.sub(10, 7));
	}

	@Test
	public void eq_test_A4() {
		assertTrue(Calcs.equal(1, 1));
	}

	@Test
	public void eq_test_B4() {
		assertTrue(Calcs.equal(-1, -1));
	}

	@Test
	public void neq_test_A4() {
		assertTrue(Calcs.nonEqual(0, 1));
	}

  @Test
	public void neq_test_B4() {
		assertTrue(Calcs.nonEqual(-1, 0));
	}

	@Test
	public void neq_test_C_BrokenTest4() {
		assertTrue(Calcs.nonEqual(5, 5));
	}

	@Test
	public void always_true_A4() {assertTrue(Calcs.alwaysTrue());}

	@Test
	public void always_false_A4() {assertTrue(Calcs.alwaysTrue());}

}
