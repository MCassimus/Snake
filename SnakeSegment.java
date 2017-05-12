import java.awt.Graphics;

public class SnakeSegment 
{
    private int x, y, cellSize;
    private SnakeSegment parent;


    public SnakeSegment(SnakeSegment s, int cS) 
    {
        x = s.getX();
        y = s.getY();
        parent = s;
        cellSize = cS;
    }
    
    
    public SnakeSegment()
    {
        parent = null;
    }
    
    
    public void move() 
    {
        x = parent.getX();
        y = parent.getY();
    }
    
    
    public int getX()
    { return x; }
        
        
    public int getY()
    { return y; }
    
    
    public void setPositions(int newX, int newY)
    {
        x = newX;
        y = newY;
    }
    
    
    public void draw(Graphics g)
    {
        g.setColor(java.awt.Color.BLACK);
        g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
    }
}