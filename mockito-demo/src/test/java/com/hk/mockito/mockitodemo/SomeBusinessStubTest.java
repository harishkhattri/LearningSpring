package com.hk.mockito.mockitodemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeBusinessStubTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(25, result);
	}
}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] { 25, 7, 16 };
	}

}
