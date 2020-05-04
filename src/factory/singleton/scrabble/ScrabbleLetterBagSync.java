package factory.singleton.scrabble;

public class ScrabbleLetterBagSync extends AbstractScrabbleLetterBag {

    private static ScrabbleLetterBagSync instance = null;

    private ScrabbleLetterBagSync() {
        try {
            // Simulate a long-running constructor, maybe a network or database call?
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException ex) {
        }

        initTiles();

        System.out.println("ScrabbleLetterBagSync created");
        System.out.println(this);
    }

    public static ScrabbleLetterBagSync getInstance() {
        // Double-checked locking
        if (instance == null) {
            synchronized (ScrabbleLetterBagClassic.class) {
                if (instance == null) {
                    instance = new ScrabbleLetterBagSync();
                }
            }
        }

        return instance;
    }
}
