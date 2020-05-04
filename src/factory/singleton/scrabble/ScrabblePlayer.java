package factory.singleton.scrabble;

public class ScrabblePlayer {
    private String playerName;

    public ScrabblePlayer(String playerName) {
        this.playerName = playerName;
    }

    public void drawTile() {
        // ScrabbleLetterBagClassic tileBag = ScrabbleLetterBagClassic.getInstance();
        //ScrabbleLetterBagEarly tileBag = ScrabbleLetterBagEarly.getInstance();
        ScrabbleLetterBagSync tileBag = ScrabbleLetterBagSync.getInstance();
        String tile = tileBag.drawTile();
        System.out.println(playerName + " drew letter: " + tile);
        System.out.println(tileBag.toString());
    }
}
