package com.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestJunit1 {

	@Test
	public void testSetup() {
	      String str= "I am done with Junit setup";
	      assertEquals("I am done with Junit setup",str);
	}


}
