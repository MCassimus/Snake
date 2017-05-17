import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//https://docs.oracle.com/javase/7/docs/api/java/awt/event/KeyListener.html
//https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html#addKeyListener(java.awt.event.KeyListener)
//https://docs.oracle.com/javase/7/docs/api/java/applet/Applet.html
//https://docs.oracle.com/javase/7/docs/api/java/awt/Graphics.html


public class Window extends Applet implements KeyListener
{
    private int screenWidth, screenHeight;
    private Game game;
    boolean close = false;
    
    //This is the entry point of the application
    public void init()
    {
        screenWidth = 800;
        screenHeight = 600;
        addKeyListener(this);
        resize(screenWidth, screenHeight);
        game = new Game(screenWidth, screenHeight);
    }
    
    
    public void paint(Graphics g)
    {  
        //Set the background to black
        java.util.Random r = new java.util.Random();
        g.setColor(new java.awt.Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        g.fillRect(0, 0, screenWidth, screenHeight);
        
        game.updateObjects();
        game.drawObjects(g);
        
        if (close)
            stop();

        paint(g);
    }

    
    public void keyPressed(KeyEvent e)
    {
         game.keyPressed(e.getKeyChar());
         if (e.getKeyChar() == 'f')
            close = true;
    }
    
    
    public void keyReleased(KeyEvent e)
    { /*We don't take key released events*/ }
    
    
    public void keyTyped(KeyEvent e)
    { /*We don't take key typed events*/ }
}

