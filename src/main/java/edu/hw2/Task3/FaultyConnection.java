package edu.hw2.Task3;

public class FaultyConnection implements Connection {

    double CONNECNION_FAIL_PROP;

    public FaultyConnection() {
    }

    @Override
    public void execute(String command) {
        if (Math.random() < CONNECNION_FAIL_PROP) {
            throw new ConnectionException();
        }
    }
}
