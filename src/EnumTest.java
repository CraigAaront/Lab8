import org.junit.Assert;
import org.junit.Test;

public class EnumTest
{
    @Test
    public void colorTest() {
        Color col = null;
        col = Color.RED;
        Assert.assertEquals("Wrong R value", 255, col.getR());
        Assert.assertEquals("Wrong G value", 0, col.getG());
        Assert.assertEquals("Wrong B value", 0, col.getB());
        
        col = Color.BLUE;
        Assert.assertEquals("Wrong R value", 0, col.getR());
        Assert.assertEquals("Wrong G value", 0, col.getG());
        Assert.assertEquals("Wrong B value", 255, col.getB());
        
        col = Color.GREEN;
        Assert.assertEquals("Wrong R value", 0, col.getR());
        Assert.assertEquals("Wrong G value", 255, col.getG());
        Assert.assertEquals("Wrong B value", 0, col.getB());
        
        col = Color.YELLOW;
        Assert.assertEquals("Wrong R value", 255, col.getR());
        Assert.assertEquals("Wrong G value", 255, col.getG());
        Assert.assertEquals("Wrong B value", 0, col.getB());
        
        col = Color.MAGENTA;
        Assert.assertEquals("Wrong R value", 255, col.getR());
        Assert.assertEquals("Wrong G value", 0, col.getG());
        Assert.assertEquals("Wrong B value", 255, col.getB());
        
        col = Color.CYAN;
        Assert.assertEquals("Wrong R value", 0, col.getR());
        Assert.assertEquals("Wrong G value", 255, col.getG());
        Assert.assertEquals("Wrong B value", 255, col.getB());
    }
    
    @Test
    public void ShapeTest() {
        Shape shap = null;
        shap = Shape.BOOT;
        Assert.assertEquals("Wrong shape toString", "boot", shap.toString());
        
        shap = Shape.THIMBLE;
        Assert.assertEquals("Wrong shape toString", "thimble", shap.toString());
        
        shap = Shape.RACECAR;
        Assert.assertEquals("Wrong shape toString", "racecar", shap.toString());
    }
    
    @Test
    public void LocationTest() {
        Assert.assertEquals("Location enum values incorrect", Location.KITCHEN, Location.valueOf("KITCHEN"));
        Assert.assertEquals("Location enum values incorrect", Location.BALLROOM, Location.valueOf("BALLROOM"));
        Assert.assertEquals("Location enum values incorrect", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
        Assert.assertEquals("Location enum values incorrect", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
        Assert.assertEquals("Location enum values incorrect", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
        Assert.assertEquals("Location enum values incorrect", Location.HALL, Location.valueOf("HALL"));
        Assert.assertEquals("Location enum values incorrect", Location.LIBRARY, Location.valueOf("LIBRARY"));
        Assert.assertEquals("Location enum values incorrect", Location.LOUNGE, Location.valueOf("LOUNGE"));
        Assert.assertEquals("Location enum values incorrect", Location.STUDY, Location.valueOf("STUDY"));
    }
    
    @Test
    public void GamePieceTest() {
        GamePiece piece = null;
        piece = GamePiece.RED_RACER;
        Assert.assertEquals("getColor is incorrect", Color.RED, piece.getColor());
        Assert.assertEquals("getShape is incorrect", Shape.RACECAR, piece.getShape());
        GamePiece piece2 = GamePiece.BLUE_RACER;
        Assert.assertEquals("movesFirst is incorrect", piece, GamePiece.movesFirst(piece, piece2));
        Assert.assertEquals("movesFirst is incorrect", piece, GamePiece.movesFirst(piece2, piece));
        Assert.assertEquals("toString is incorrect", "RED_RACER: a RED racecar with priority 0", piece.toString());
    }
}
