package factory.singleton.scrabble;

/**
 * Implements a scrabble letter bag with the classic singleton
 * mechanism: a private constructor, a private static field,
 * and a public static getInstance() method
 */
public class ScrabbleLetterBagClassic extends AbstractScrabbleLetterBag {

    private static ScrabbleLetterBagClassic instance = null;

    /**
     * This private constructor can only be called from inside
     * this class.
     */
    private ScrabbleLetterBagClassic() {
        try {
            // Simulate a long-running constructor, maybe a network or database call?
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException ex) {
        }

        initTiles();

        System.out.println("ScrabbleLetterBagClassic created ");
        System.out.println(this);
    }

    /**
     * If the static field is null, creates one instance
     * of this class. Returns the singleton instance.
     * @return
     */
    public static ScrabbleLetterBagClassic getInstance() {
        if (instance == null) {
            instance = new ScrabbleLetterBagClassic();
        }

        return instance;
    }
}
