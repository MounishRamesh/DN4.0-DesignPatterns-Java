public class Main {
    public static void main(String[] args) {

        MyLogger log1 = MyLogger.getLogger();
        MyLogger log2 = MyLogger.getLogger();

        log1.writeLog("User logged in.");
        log2.writeLog("User updated profile.");

        // Check if both are same instance
        if (log1 == log2) {
            System.out.println("Same instance used. Singleton is working properly.");
        } else {
            System.out.println("Different instances found. Singleton failed.");
        }
    }
}
