package edu.hw2.Task3;

public class FaultyConnection implements Connection {

    double CONNECNIONFAILPROP;

    public FaultyConnection() {
    }

    @Override
    public void execute(String command) {
        if (Math.random() < CONNECNIONFAILPROP) {
            throw new ConnectionException();
        }
    }
}
