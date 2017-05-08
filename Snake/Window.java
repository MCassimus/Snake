import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Window
{
    private double screenWidth = 800;
    private double screenHeight = 600;
    
    //This is the entry point of the application
    public void paint(Graphics g)
    {
        resize((int)screenWidth, (int)screenHeight);
        g.setColor(new java.awt.Color(227, 66, 52));
        g.fillRect(0, 0, 800, 600);//Set the background to black

        new Game(this);
    }
    
    
    public double getScreenWidth()
    { return screenWidth; }
    
    
    public double getScreenHeight()
    { return screenHeight; }
}
