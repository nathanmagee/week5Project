package week05;

public class App {
    public static void main(String[] args) {

        String word = "TESTING";
        String word2 = "CHECK";

        AsteriskLogger thing = new AsteriskLogger();

        thing.log(word);
        thing.log(word2);
        
        thing.error(word);
        thing.error(word2);

        SpacedLogger thing2 = new SpacedLogger();

        thing2.log(word);
        thing2.log(word2);

        thing2.error(word);
        thing2.error(word2);


    }
}
