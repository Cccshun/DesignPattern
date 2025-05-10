package com.sysu.responsibiliatyChain;

public class ResponsibilityChainDemo {
    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error level information");
        System.out.println(loggerChain);
    }

    public static AbstractLogger getChainOfLogger() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
