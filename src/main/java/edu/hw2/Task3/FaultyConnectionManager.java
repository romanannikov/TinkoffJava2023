package edu.hw2.Task3;

public class FaultyConnectionManager implements ConnectionManager {
    public FaultyConnectionManager() {
    }

    @Override
    public Connection getConnection() {
        return new FaultyConnection();
    }

}
