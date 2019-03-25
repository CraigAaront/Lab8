import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class ClassTest
{
    @Test
    public void BoardGameTest() {
        BoardGame game = new BoardGame();
        
        Assert.assertEquals("Addplayer doesn't work correctly", true, game.addPlayer("joe", GamePiece.RED_RACER, Location.BALLROOM));
        Assert.assertEquals("addplayer fails", false, game.addPlayer("joe", GamePiece.RED_RACER, Location.BALLROOM));
    
        Assert.assertEquals("getplayerGamePiece fails", GamePiece.RED_RACER, game.getPlayerGamePiece("joe"));
        
        Assert.assertEquals("getplayerwithgamepiece fails", "joe", game.getPlayerWithGamePiece(GamePiece.RED_RACER));
        Assert.assertEquals("getplayerwithgamepiece fails", null, game.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
        
        game.movePlayer("joe", Location.KITCHEN);
        Assert.assertEquals("movePlayer incorrect", Location.KITCHEN, game.getPlayersLocation("joe"));
        
        game.addPlayer("anthony", GamePiece.BLUE_RACER, Location.STUDY);
        String[] names = new String[2];
        names[0] = "joe";
        names[1] = "anthony";
        Location[] loc = new Location[2];
        loc[0] = Location.HALL;
        loc[1] = Location.LIBRARY;
        String[] results = new String[2];
        results[0] = "joe";
        results[1] = "anthony";
        Assert.assertEquals("movetwoplayers didnt output correct array", results, game.moveTwoPlayers(names, loc));
        Assert.assertEquals("movetwoplayers didnt move the players", Location.HALL, game.getPlayersLocation("joe"));       
        names[0] = "anthony";
        names[1] = "joe";
        Assert.assertEquals("movetwoplayers didnt output correct array", results, game.moveTwoPlayers(names, loc));
    
        ArrayList<String> locs = new ArrayList<String>();
        locs.add("joe");
        Assert.assertEquals("getPlayersAtLocation doesnt output correct arraylist", locs, game.getPlayersAtLocation(Location.LIBRARY));
        
        ArrayList<GamePiece> gams = new ArrayList<GamePiece>();
        gams.add(GamePiece.RED_RACER);
        Assert.assertEquals("GetgamepieceatLocation doesnt output correct arraylist", gams, game.getGamePiecesAtLocation(Location.LIBRARY));
        
    }  
}