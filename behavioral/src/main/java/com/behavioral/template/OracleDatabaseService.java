package com.behavioral.template;

public class OracleDatabaseService extends DatabaseService {

    private static final String NAME = "ORACLE";

    @Override
    public void initializeConnection() {
        System.out.println(String.format("Initializing connection for %s", NAME));
    }

    @Override
    public String executeQuery(String sql) {
        System.out.println(String.format("Executing query: %s", sql));
        return NAME;
    }

    @Override
    public void closeConnection() {
        System.out.println(String.format("Closing connection for %s", NAME));
    }
}
