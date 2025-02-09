package week05;

//3a
public class AsteriskLogger implements Logger{

    //4a
    public void log(String message) {
        System.out.println("***" + message + "***");
    }

    //4b
    public void error(String message) {
        System.out.println("**********" + "*".repeat(message.length()) + "***");
        System.out.println("***ERROR: " + message + "***");
        System.out.println("**********" + "*".repeat(message.length()) + "***");
    }


   
}
