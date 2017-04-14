package com.hikari.test;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class TestHikariDatesource {

	public static void main(String[] args) {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName("org.postgresql.Driver");
		hikariConfig.setJdbcUrl("jdbc:postgresql://192.168.0.223:15432/test");
		hikariConfig.setUsername("gpadmin");
		hikariConfig.setPassword("gpadmin@.123");
		hikariConfig.setAutoCommit(true);
		hikariConfig.setConnectionTimeout(30000);
		hikariConfig.setIdleTimeout(600000);
		hikariConfig.setMaxLifetime(1800000);
		hikariConfig.setMaximumPoolSize(10);
		
		new HikariDataSource(hikariConfig);
		System.out.println(true);
	}

}
