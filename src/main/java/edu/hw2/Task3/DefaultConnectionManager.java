package edu.hw2.Task3;

public class DefaultConnectionManager implements ConnectionManager {

    private double MANAGERFAILPROP;

    @Override
    public Connection getConnection() {
        return Math.random() < MANAGERFAILPROP ? new StableConnection() : new FaultyConnection();
    }
}
