package com.engineersmind.s3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Service
public class DatabaseConnectionService {

    private final DataSource dataSource;

    @Autowired
    public DatabaseConnectionService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean testDatabaseConnection() {
        try (Connection connection = dataSource.getConnection()) {
        	return true; // Connection established successfully
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Connection failed
        }
    }
}
