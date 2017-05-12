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
    private double screenWidth = 800;
    private double screenHeight = 600;
    private double boxWidth = 10;
    private double boxHeight = 10;
    private Graphics graphics;
    private KeyEvent keyboard;
    //board data aliases
    private int emptyID = 0;//empty space
    private int snakeID = 1;//represents a snake segment
    private int foodID = 2;//represents food 
    char c;
    
    
    public void init()
    {
        addKeyListener(this);
    }
    
    //This is the entry point of the application
    public void paint(Graphics g)
    {
        //g.drawCharacter(c, 100, 150);
        //showStatus("You typed " + c + " character");
        
        resize((int)screenWidth, (int)screenHeight);
        graphics = g;
        graphics.setColor(new java.awt.Color(0, 0, 0));
        graphics.fillRect(0, 0, 800, 600);//Set the background to black
        
        new Game(this);
        System.out.println("This is a test3");
    }
    
    
    public void drawBoard(int [][] board)
    {
        //draw elements
        for(int y = 0; y < board[0].length; y++)
        {
            for(int x = 0; x < board.length; x++)
            {
                if(board[x][y] == emptyID)
                {
                    graphics.fillRect( x * (int)boxWidth, y * (int)boxHeight , (int)boxWidth, (int)boxHeight);
                }
                else if(board[x][y] == snakeID)
                {
                    //draw snake color of dimensions boxX x boxY
                }
                else
                {
                    //draw food item
                }
            }
        }
    }
    
        
    public double getScreenWidth()
    { return screenWidth; }
    
    
    public double getScreenHeight()
    { return screenHeight; }
    
    
    public void keyPressed(KeyEvent e)
    {
         c += e.getKeyChar();
         String temp = "" + c;
         showStatus(temp);
    }
    
    
    public void keyReleased(KeyEvent e)
    { 
       
    }
    
    
    public void keyTyped(KeyEvent e)
    { /*We don't take key typed events*/ }
}

