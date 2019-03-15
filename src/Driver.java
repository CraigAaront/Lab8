
public class Driver
{
    public static void main(String[] args) {
    BoardGame game = new BoardGame();
    game.addPlayer("Joe", GamePiece.RED_RACER,Location.BALLROOM);
    game.addPlayer("John", GamePiece.BLUE_RACER, Location.HALL);
    
    String returnedName = game.getPlayerWithGamePiece(GamePiece.RED_RACER);
    System.out.println(returnedName);
    
    }
}
