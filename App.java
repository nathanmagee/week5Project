package week05;

//6
public class App {
    public static void main(String[] args) {

        //6a
        AsteriskLogger thing = new AsteriskLogger();
        SpacedLogger thing2 = new SpacedLogger();

        //6b
        String word = "TESTING";
        String word2 = "CHECK";

        thing.log(word);
        thing.log(word2);
        
        thing.error(word);
        thing.error(word2);

        thing2.log(word);
        thing2.log(word2);

        thing2.error(word);
        thing2.error(word2);

    }
}
