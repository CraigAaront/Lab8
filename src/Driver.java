import java.util.ArrayList;

public class Driver
{
    public static void main(String[] args) {
    BoardGame game = new BoardGame();
    game.addPlayer("Joe", GamePiece.RED_RACER,Location.BALLROOM);
    game.addPlayer("Anthony", GamePiece.BLUE_RACER, Location.HALL);
    
    GamePiece returnedPiece = game.getPlayerGamePiece("Anthony");
    System.out.println(returnedPiece);
    
    String returnedName = game.getPlayerWithGamePiece(GamePiece.BLUE_RACER);
    System.out.println(returnedName);
    
    game.movePlayer("Joe", Location.HALL);
    
    ArrayList<String> returnedLocations = game.getPlayersAtLocation(Location.HALL);
    System.out.println(returnedLocations.toString());
    
    Location returnedLocation = game.getPlayersLocation("Joe");
    System.out.println(returnedLocation);
    
    ArrayList<GamePiece> returnedPieces = game.getGamePiecesAtLocation(Location.HALL);
    System.out.println(returnedPieces.toString());
    
    String[] playerNames = new String[2];
    playerNames[0] = "Joe";
    playerNames[1] = "Anthony";
    Location[] locations = new Location[2];
    locations[0] = Location.BALLROOM;
    locations[1] = Location.HALL;
    String[] returnedTwoMove = new String[2];
    returnedTwoMove = game.moveTwoPlayers(playerNames, locations);
    System.out.println(returnedTwoMove[0].toString() + " " + returnedTwoMove[1].toString());
        
    }
}
