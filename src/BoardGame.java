import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame 
{
    protected LinkedHashMap<String, GamePiece> playerPieces;
    protected LinkedHashMap<String, Location> playerLocations;
    
    public BoardGame() {
        playerPieces = new LinkedHashMap<String, GamePiece>();
        playerLocations = new LinkedHashMap<String, Location>();
    }
    
    public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
        if (playerPieces.containsKey(playerName)|| playerPieces.containsValue(gamePiece)) {
            return false;
        }
        else {
            playerPieces.put(playerName, gamePiece);
            playerLocations.put(playerName, initialLocation);
            return true;
        }
    }
    public GamePiece getPlayerGamePiece(String playerName) {
        return playerPieces.get(playerName);
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
        if (GamePiece.movesFirst(playerPieces.get(name1), playerPieces.get(name2)).equals(playerPieces.get(name1))) {
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
    public Location getPlayersLocation(String player) {
        return playerLocations.get(player);
    }
    public ArrayList<String> getPlayersAtLocation(Location loc){
        ArrayList<String> result = new ArrayList<String>();
        for (String name: playerLocations.keySet()) {
            if(playerLocations.get(name).equals(loc)) {
                result.add(name);
            }
        }
        return result;
    }
    public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
        ArrayList<GamePiece> result = new ArrayList<GamePiece>();
        for (String key: playerLocations.keySet()) {
            if(playerLocations.get(key).equals(loc)) {
                result.add(playerPieces.get(key));
            }
        }        
        return result;
    }
    public Set<String> getPlayers(){
        return playerPieces.keySet();
    }
    public Set<Location> getPlayerLocations(){
        return new HashSet<Location>(playerLocations.values());
    }
    public Set<GamePiece> getPlayerPieces(){
        return new HashSet<GamePiece>(playerPieces.values());
    }    
}
