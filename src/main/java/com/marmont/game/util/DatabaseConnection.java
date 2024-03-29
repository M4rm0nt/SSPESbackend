package com.marmont.game.util;

import com.marmont.game.config.AppConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final AppConfig CONFIG = AppConfig.getInstance();

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CONFIG.getDbUrl(), CONFIG.getDbUser(), CONFIG.getDbPassword());
    }
}