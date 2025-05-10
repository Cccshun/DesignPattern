package com.sysu.responsibiliatyChain;

import lombok.Setter;

@Setter
public abstract class AbstractLogger {
    public static final Integer INFO = 3;
    public static final Integer DEBUG = 2;
    public static final Integer ERROR = 1;

    protected Integer level;
    private AbstractLogger nextLogger;

    public void logMessage(Integer level, String message) {
        if (level <= this.level) {
            write(message);
//            return; do not pass to the next handler
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract protected void write(String message);
}
