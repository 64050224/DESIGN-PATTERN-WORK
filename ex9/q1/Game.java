public abstract class Game {
    public final void play(){
        initializeGame();
        playingGame();
        ShowResult();
    }
    protected abstract void initializeGame();
    protected abstract void playingGame();
    protected abstract void ShowResult();
}
