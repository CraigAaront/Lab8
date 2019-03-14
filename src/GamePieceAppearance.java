
public class GamePieceAppearance
{
    private Color color;
    private Shape shape;
    
    public GamePieceAppearance(Color color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }
    
    public Shape getShape() {
        return this.shape;
    }
    public Color getColor() {
        return this.color;
    }
}
