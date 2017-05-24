import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
//import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;


public class Window extends Applet implements KeyListener
{
    private int screenWidth, screenHeight;
    private Game game;
    
    //This is the entry point of the application
    public void init()
    {
        screenWidth = 800;
        screenHeight = 600;
        resize(screenWidth, screenHeight);
        game = new Game(screenWidth, screenHeight);
        addKeyListener(this);
    }
    
    
    public void paint(Graphics g)
    {  
        //Set the background to black
        g.setColor(java.awt.Color.BLACK);
        g.fillRect(0, 0, screenWidth, screenHeight);
        
        game.updateObjects();
        game.drawObjects(g);
        
        try 
        { Thread.sleep(100); }
        catch (Exception e) {}
        
       repaint();
    }

    
    public void keyPressed(KeyEvent e)
    {
        game.keyPressed(e.getKeyChar());
    }
    
    
    public void keyReleased(KeyEvent e)
    { /*We don't take key released events*/ }
    
    
    public void keyTyped(KeyEvent e)
    { /*We don't take key typed events*/ }
}

