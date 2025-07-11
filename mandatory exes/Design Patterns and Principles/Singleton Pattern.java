public class Logger {
    //instances for logger
    private static Logger instance;

    //  Private constructor 
    private Logger() {
        System.out.println("Logger instance created.");
    }
//get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); /
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
// Main.java
public class Singleton Pattern {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("First log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message.");

        // Check if both logger references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same. Singleton confirmed!");
        } else {
            System.out.println("Logger instances are different. Singleton failed!");
        }
    }
}
