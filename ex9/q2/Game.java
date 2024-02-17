public class Game {
    GameStrategy gameStrategy;
    public Game(GameStrategy gs){
        changeGame(gs);
    }
    public void changeGame(GameStrategy gs){
        gameStrategy = gs;
    }
    public void playGame(){
        if(gameStrategy == null){
            System.out.println("No game selected");
        }
        gameStrategy.play();
    }
}
