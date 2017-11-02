package com.hk.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ComponentDAO {

	@Autowired
	ComponentJDBCConnection componentJdbcConnection;

	public ComponentJDBCConnection getComponentJDBCConnection() {
		return componentJdbcConnection;
	}

	public void setComponentJDBCConnection(ComponentJDBCConnection componentJdbcConnection) {
		this.componentJdbcConnection = componentJdbcConnection;
	}
}
