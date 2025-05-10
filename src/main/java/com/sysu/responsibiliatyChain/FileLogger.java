package com.sysu.responsibiliatyChain;

public class FileLogger extends AbstractLogger {

    public FileLogger(Integer level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.printf("File::Logger: %s\n", message);
    }
}
