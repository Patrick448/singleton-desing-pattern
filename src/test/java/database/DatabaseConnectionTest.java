package database;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {

    @Test
    void deveRetornarURL() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.setDatabaseUrl("localhost");
        assertEquals("localhost", DatabaseConnection.getInstance().getDatabaseUrl());
    }

    @Test
    void deveRetornarSenha() {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
        databaseConnection.setDatabasePassword("123456");
        assertEquals("123456", DatabaseConnection.getInstance().getDatabasePassword());
    }
}