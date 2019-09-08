package com.anders.jenkins;

import org.junit.Test;

import junit.framework.Assert;

public class UtilsTest {

	@Test
	public void test() {
		Assert.assertEquals("192.168.1.1", Utils.getAddress());
	}
	
	@Test
	public void test1() {
		Assert.assertEquals("anders", Utils.getHostName());
	}

}
