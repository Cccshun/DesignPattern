package com.sysu.responsibiliatyChain;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(Integer level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.printf("Error Console::Logger: %s\n", message);
    }
}
