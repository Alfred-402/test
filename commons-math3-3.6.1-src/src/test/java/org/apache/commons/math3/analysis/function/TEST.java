package org.apache.commons.math3.analysis.function;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TEST {
	private Abs A;

	@Before
	public void setUp() throws Exception {
		A =new Abs();
	}

	@Test
	public void test() {
		
		double x=A.value(-3.2);
		System.out.println("expected:3.2");
		System.out.println("Actual:"+A.value(x));
		assertEquals(3.2,x,0);
		//fail("Not yet implemented");
	}
}
