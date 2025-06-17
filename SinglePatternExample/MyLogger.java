// Custom Logger class using Singleton Pattern
public class MyLogger {

    // Single instance
    private static MyLogger onlyInstance = null;

    // Private constructor prevents external instantiation
    private MyLogger() {
        System.out.println("Logger system started.");
    }

    // Method to get the single instance
    public static MyLogger getLogger() {
        if (onlyInstance == null) {
            onlyInstance = new MyLogger();
        }
        return onlyInstance;
    }

    // Method to print logs
    public void writeLog(String logMessage) {
        System.out.println("Log -> " + logMessage);
    }
}
