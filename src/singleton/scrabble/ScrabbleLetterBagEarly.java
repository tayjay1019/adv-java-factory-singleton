package singleton.scrabble;

/**
 * Similar to the classic singleton, this version creates
 * its single instance before getInstance() is called.
 *
 * Static fields are initialized the first time the class
 * is loaded into memory. This may be too soon and result
 * in unnecessary delay if the scrabble letter bag isn't
 * actually needed yet.
 */
public class ScrabbleLetterBagEarly extends AbstractScrabbleLetterBag {

    private static ScrabbleLetterBagEarly instance = new ScrabbleLetterBagEarly();

    private ScrabbleLetterBagEarly() {
        try {
            // Simulate a long-running constructor, maybe a network or database call?
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException ex) {
        }

        initTiles();

        System.out.println("ScrabbleLetterBagEarly created");
        System.out.println(this);
    }

    public static ScrabbleLetterBagEarly getInstance() {
        return instance;
    }

}
