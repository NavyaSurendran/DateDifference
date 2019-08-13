package com.innovia;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.inovia.Date;
import com.inovia.IDateUtil;
import com.inovia.IDateUtilImpl;

public class IDateUtilImplTest {

	private transient IDateUtil shop;
	
	@Test
	public void diffTest() {
		Date d1 = new Date(14, 8, 2019);
		Date d2 = new Date(18, 8, 2019);
		shop = new IDateUtilImpl();
		int days = shop.diff(d1, d2);
		assertEquals(days, 4);
	}
	
	@Test
	public void diffTest2() {
		Date d1 = new Date(14, 8, 2019);
		Date d2 = new Date(18, 12, 2019);
		shop = new IDateUtilImpl();
		int days = shop.diff(d1, d2);
		assertEquals(days, 126);
	}
	
	@Test
	public void diffTest3() {
		Date d1 = new Date(14, 2, 2019);
		Date d2 = new Date(18, 12, 2019);
		shop = new IDateUtilImpl();
		int days = shop.diff(d1, d2);
		assertEquals(days, 307);
	}
	
	@Test
	public void diffTest4() {
		Date d1 = new Date(10, 1, 1991);
		Date d2 = new Date(14, 8, 2019);
		shop = new IDateUtilImpl();
		int days = shop.diff(d1, d2);
		assertEquals(days, 122863);
	}
	
	@Test
	public void diffTest5() {
		Date d1 = new Date(18, 8, 2019);
		Date d2 = new Date(14, 8, 2019);
		shop = new IDateUtilImpl();
		int days = shop.diff(d1, d2);
		assertEquals(days, -4);
	}
}
