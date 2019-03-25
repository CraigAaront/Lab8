import org.junit.Assert;
import org.junit.Test;

public class ClassTest
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
}
