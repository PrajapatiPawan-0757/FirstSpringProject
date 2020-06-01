package com.trilokala.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource("classpath:db.properties")
public class HibernateConfiguration {

	@Autowired
	Environment env;

	@Bean
	public DataSource getDataSource() {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass(env.getRequiredProperty("driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		dataSource.setJdbcUrl(env.getRequiredProperty("url"));
		dataSource.setUser(env.getRequiredProperty("user"));
		dataSource.setPassword(env.getRequiredProperty("password"));
		return dataSource;
	}

}
