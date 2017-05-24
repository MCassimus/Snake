public class Food
{
    private int x, y;

    
    public Food()
    {
        x = 0;
        y = 0;
    }
    
    
    public void draw(java.awt.Graphics g, int cellSize)
    {
        java.util.Random r = new java.util.Random();
        g.setColor(new java.awt.Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
    }
    
    
    public void setPositions(int newX, int newY)
    {
        x = newX;
        y = newY;
    }
    
    
    public int getX()
    { return x; }
    
    
    public int getY()
    { return y; }
}
