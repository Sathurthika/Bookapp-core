package com.sathurthika.bookapp.util;

import org.junit.Test;

public class ConnectionUtilTest {

	@Test
	public void testDataSource() {
		System.out.println(ConnectionUtil.dataSource());
	}

	@Test
	public void testGetJdbcTemplate() {
		System.out.println(ConnectionUtil.getJdbcTemplate());
	}

}
