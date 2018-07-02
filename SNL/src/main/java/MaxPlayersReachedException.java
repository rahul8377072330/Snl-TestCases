
public class MaxPlayersReachedException extends Exception{
    
    public MaxPlayersReachedException(Integer players){
        super("The board already has maximum allowed Player: " + players);
    }
}