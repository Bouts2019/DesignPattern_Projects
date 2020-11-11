package com.martini.demo01;

/**
 * @author martini at 2020/11/11 9:10
 */
public class ChainOfResponsibilityDemo01 {
    public static void main(String[] args) {
        AbstractLogger chain = getChainOfLoggers();

        System.out.println("========= INFO ==========");
        chain.logMessage(AbstractLogger.INFO, "This is a log message.");

        System.out.println("========= DEBUG ==========");
        chain.logMessage(AbstractLogger.DEBUG, "This is a log message.");

        System.out.println("========= ERROR ==========");
        chain.logMessage(AbstractLogger.ERROR, "This is a log message.");
    }

    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
