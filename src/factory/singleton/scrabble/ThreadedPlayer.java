package factory.singleton.scrabble;

public class ThreadedPlayer extends Thread {

    private String playerName;

    public ThreadedPlayer(String playerName) {
        this.playerName = playerName;
    }

    public void drawTile() {
        start();
    }

    @Override
    public void run() {
        ScrabbleLetterBagClassic tileBag = ScrabbleLetterBagClassic.getInstance();
//        ScrabbleLetterBagEarly tileBag = ScrabbleLetterBagEarly.getInstance();
//        ScrabbleLetterBagEnum tileBag = ScrabbleLetterBagEnum.INSTANCE;
        String tile = tileBag.drawTile();
        System.out.println(playerName + " drew letter: " + tile);
        System.out.println(tileBag.toString());
    }
}
