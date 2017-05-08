public class Food
{
    private double winWidth;
    private double winHeight;
    private double x;
    private double y;
    
    
    public Food(double windowX, double windowY)
    {
        winWidth = windowX;
        winHeight = windowY;
        
        newPosition();
    }
    
    
    public void newPosition()
    {
        x = Math.random() * winWidth;
        y = Math.random() * winHeight;
    }
    
    
    public double getXPos()
    {
        return x;
    }
    
    
    public double getYPos()
    {
        return y;
    }
}
