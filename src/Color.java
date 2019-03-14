public enum Color
{
    RED(255 , 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255), YELLOW(255, 255, 0),
    MAGENTA(255, 0, 255), CYAN(0, 255, 255);
    private int r;
    private int g;
    private int b;
    
    private Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }
    
    public int getR() {
        return this.r;
    }
    public int getB() {
        return this.b;
    }
    public int getG() {
        return this.g;
    }
}
