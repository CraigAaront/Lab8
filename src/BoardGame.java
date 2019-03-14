import java.util.LinkedHashMap;

public class BoardGame 
{
    protected LinkedHashMap<String, GamePiece> playerPieces;
    protected LinkedHashMap<String, Location> playerLocations;
    
    public BoardGame() {
        playerPieces = new LinkedHashMap<String, GamePiece>();
        playerLocations = new LinkedHashMap<String, Location>();
    }
    
    
}
