package com.hk.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hk.database.databasedemo.entity.Person;
import com.hk.database.databasedemo.jdbc.PersonJdbcDao;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("User id 10003 -> {}", dao.findById(10003));
		logger.info("User name Durgesh -> {}", dao.findByName("Durgesh"));
		logger.info("User location Pune -> {}", dao.findByLocation("Pune"));
		logger.info("Deleting 10002 -> number of rows deleted - {}", dao.deleteById(10002));
		logger.info("Inserting 10004 -> {}", dao.insert(new Person(10004, "Amit", "Hubli", new Date())));
		logger.info("Updating 10003 -> {}", dao.update(new Person(10003, "Shobhit", "Pune", new Date())));
	}
}
