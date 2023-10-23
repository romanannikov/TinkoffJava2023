package edu.hw2.Task3;

public class DefaultConnectionManager implements ConnectionManager {

    private static final double MANAGER_FAIL_PROP = 0.25;

    @Override
    public Connection getConnection() {
        return Math.random() < MANAGER_FAIL_PROP ? new StableConnection() : new FaultyConnection();
    }
}
