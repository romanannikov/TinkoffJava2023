package edu.hw2.Task3;

public class FaultyConnection implements Connection {

    private static final double CONNECNION_FAIL_PROP = 0.5;

    public FaultyConnection() {
    }

    @Override
    public void execute(String command) {
        if (Math.random() < CONNECNION_FAIL_PROP) {
            throw new ConnectionException();
        }
    }
}
