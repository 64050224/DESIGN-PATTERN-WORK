public class App {
    public static void main(String[] args) {
        GameStrategy nba = new Basketball();
        GameStrategy fifa = new Football();
        Game gamePlayer = new Game(nba);
        gamePlayer.playGame();
        gamePlayer.changeGame(fifa);
        gamePlayer.playGame();
    }
}
