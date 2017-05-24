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
    
    
    /**
     * Checks if any spot on snake occupies a cell
     */
    public boolean occupies(int occX, int occY)
    {
        if (x == occX && y == occY)
            return true;
        else if (parent != null)
            return parent.occupies(occX, occY);
        else
            return false;
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
        g.setColor(new java.awt.Color(0, 193, 64));
        g.fillRect(x * cellSize, y * cellSize, cellSize, cellSize);
        if (parent != null)
            parent.draw(g, cellSize);
    }
}