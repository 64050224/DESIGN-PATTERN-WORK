public class App {
    public static void main(String[] args) {
        Game gamePlayer;
        //1
        gamePlayer = new Basketball();
        gamePlayer.play();
        //2
        gamePlayer = new Football();
        gamePlayer.play();
    }
}
