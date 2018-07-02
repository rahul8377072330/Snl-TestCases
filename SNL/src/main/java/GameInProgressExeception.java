
public class GameInProgressExeception extends Exception{
    
    public GameInProgressExeception(){
        super("New player cannot join since the game has started");
    }
}