package edu.hw2.Task3;

public class DefaultConnectionManager implements ConnectionManager {

    private double MANAGER_FAIL_PROP;

    @Override
    public Connection getConnection() {
        return Math.random() < MANAGER_FAIL_PROP ? new StableConnection() : new FaultyConnection();
    }
}
