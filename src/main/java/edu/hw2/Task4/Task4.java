package edu.hw2.Task4;

import org.apache.logging.log4j.LogManager;

public class Task4 {

    private Task4() {
    }

    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();
    private static final int NAMES_INDEX = 2;

    public static CallingInfo callingInfo() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return new CallingInfo(stack[NAMES_INDEX].getClassName(), stack[NAMES_INDEX].getMethodName());
    }
}

