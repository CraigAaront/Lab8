import java.util.LinkedHashMap;

public class BoardGame 
{
    protected LinkedHashMap<String, GamePiece> playerPieces;
    protected LinkedHashMap<String, Location> playerLocations;
    
    public BoardGame() {
        playerPieces = new LinkedHashMap<String, GamePiece>();
        playerLocations = new LinkedHashMap<String, Location>();
    }
    
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
        if (playerPieces.containsKey(playerName) && playerLocations.containsKey(playerName)) {
            return false;
        }
        else {
            playerPieces.put("playerName", gamePiece);
            playerLocations.put("playerName", initialLocation);
            return true;
        }
    }
    
    public GamePiece getPlayerGamePiece(String playerName) {
        return playerPieces.get("playerName");
    }
    
    public 
}
