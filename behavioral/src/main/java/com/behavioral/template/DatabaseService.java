package com.behavioral.template;

public abstract class DatabaseService {

    public abstract void initializeConnection();
    public abstract String executeQuery(String sql);
    public abstract void closeConnection();

    /**
     * Assuming that this method will return a string
     */
    public String runQuery(String sql){
        initializeConnection();
        String result = executeQuery(sql);
        closeConnection();
        return result;
    }
}
