package com.sysu.responsibiliatyChain;


public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(Integer level) {
        this.level=level;
    }

    @Override
    protected void write(String message) {
        System.out.printf("Standard Console::Logger: %s\n", message);
    }
}
