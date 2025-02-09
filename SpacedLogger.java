package week05;

//3b
public class SpacedLogger implements Logger {

    public void log(String message) {
        String result = "";
        for(int i = 0; i < message.length(); i++) {
                result += message.charAt(i);
                result += " ";
        }
        System.out.println(result);
    }


    public void error(String message) {
        String result = "";
        for(int i = 0; i < message.length(); i++) {
                result += message.charAt(i);
                result += " ";
        }
        System.out.println("ERROR: " + result);
    }
}
