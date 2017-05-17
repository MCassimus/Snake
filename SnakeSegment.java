import java.awt.Graphics;

public class SnakeSegment 
{
    private int x, y;
    private SnakeSegment parent;


    public SnakeSegment(SnakeSegment s) 
    {
        x = s.getX();
        y = s.getY();
        parent = s;
    }
    
    
    public SnakeSegment()
    {
        parent = null;
    }
    
    
    public void move() 
    {
        x = parent.getX();
        y = parent.getY();
        parent.move();
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
    
    
    public void draw(Graphics g, int cellSize)
    {
        g.setColor(java.awt.Color.BLACK);
        g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
    }
}