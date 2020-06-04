package bcit.ca.comp1451.assignment01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DateTest {
	
	private Date date;

	@BeforeEach
	void setUp() throws Exception {
		date = new Date(1,4,2019);
	}

	@AfterEach
	void tearDown() throws Exception {
		date = null;
	}

	@Test
	public void testDayPositive() {
		date = new Date( 10 , 11 , 2018);
		assertEquals(10, date.getDay());
	}
	
	@Test
	public void testDayNegative() {
		date = new Date( -1 , 11 , 2018);
		assertEquals(1, date.getDay());
	}
	
	@Test
	public void testDayNegativeAboveLimit() {
		date = new Date( 32 , 11 , 2018);
		assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMonthPositive() {
		date = new Date( 12 , 11 , 2018);
		assertEquals(11, date.getMonth());
	}
	
	@Test
	public void testMonthNegativeAboveLimit() {
		date = new Date( 12 , 13 , 2018);
		assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testMonthNegative() {
		date = new Date( 12 , -12 , 2018);
		assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testYearPositive() {
		date = new Date( 13 , 11 , 2018);
		assertEquals(2018, date.getYear());
	}
	
	@Test
	public void testYearNegative() {
		date = new Date( 13 , 11 , -1991);
		assertEquals(1900, date.getYear());
	}
	
	@Test
	public void testYearNegativeBelowBoundry() {
		date = new Date( 13 , 11 , 1800);
		assertEquals(1900, date.getYear());
	}
	
	@Test
	public void testYearNegativeAboveBoundry() {
		date = new Date( 13 , 11 , 2021);
		assertEquals(1900, date.getYear());
	}

}
