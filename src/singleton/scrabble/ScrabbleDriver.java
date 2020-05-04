package singleton.scrabble;

public class ScrabbleDriver {

    public static void main(String[] args) {
        System.out.println("Welcome to Scrabble");

//        System.out.println("Creating players");
//        ScrabblePlayer player1 = new ScrabblePlayer("Charlie");
//        ScrabblePlayer player2 = new ScrabblePlayer("Jayne");
//
//        System.out.println("Players drawing tiles");
//        player1.drawTile();
//        player2.drawTile();
//
//        System.out.println();
//        System.out.println("* * * * * * * * * * * * * * * * *");
//        System.out.println();

        System.out.println("Creating threaded players");
        ThreadedPlayer player3 = new ThreadedPlayer("Stacy");
        ThreadedPlayer player4 = new ThreadedPlayer("Gigi");

        System.out.println("Threaded players drawing tiles");
        player3.drawTile();
        player4.drawTile();

    }
}
