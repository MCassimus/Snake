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
    }
    
    
    public int getX()
    { return x; }
        
        
    public int getY()
    { return y; }
}