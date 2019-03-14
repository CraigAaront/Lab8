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
        if (playerPieces.containsKey(playerName)) {
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
    public String getPlayerWithGamePiece(GamePiece gamePiece) {
        for (String name: playerPieces.keySet()) {
            if(playerPieces.get(name).equals(gamePiece)) {
                return name;
            }
        }
        return null;
    }
    public void movePlayer(String playerName, Location newLocation) {
        playerLocations.put(playerName, newLocation);
    }
    public String[] moveTwoPlayers(String[] playerNames, Location[] newLocation) {
        String name1 = playerNames[0];
        String name2 = playerNames[1];
        Location loc1 = newLocation[0];
        Location loc2 = newLocation[1];
        String[] result = new String[2];
        GamePiece piece = null;
        piece.movesFirst(playerPieces.get(name1), playerPieces.get(name2));
        if (piece.equals(playerPieces.get(name1))) {
            result[0] = name1;
            result[1] = name2;
            playerLocations.put(name1, loc1);
            playerLocations.put(name2, loc2);
        }
        else {
            result[0] = name2;
            result[1] = name1;
            playerLocations.put(name2, loc2);
            playerLocations.put(name1, loc1);
        }
        
        return result;
    }
}
