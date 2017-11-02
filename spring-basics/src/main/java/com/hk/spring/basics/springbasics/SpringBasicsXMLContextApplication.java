package com.hk.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hk.spring.basics.springbasics.xml.XmlPersonDAO;

public class SpringBasicsXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsXMLContextApplication.class);

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {

			LOGGER.info("Beans loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

			XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{}", xmlPersonDAO);
			LOGGER.info("{}", xmlPersonDAO.getXmlJDBCConnection());
		}
	}
}
