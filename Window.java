import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class Window extends Applet
{
    private double screenWidth = 800;
    private double screenHeight = 600;
    private double boxWidth = 10;
    private double boxHeight = 10;
    //board data aliases
    private int emptyID = 0;//empty space
    private int snakeID = 1;//represents a snake segment
    private int foodID = 2;//represents food item
    
    //This is the entry point of the application
    public void paint(Graphics g)
    {
        resize((int)screenWidth, (int)screenHeight);
        g.setColor(new java.awt.Color(0, 0, 0));
        g.fillRect(0, 0, 800, 600);//Set the background to black

        new Game(this);
    }
    
    
    public double getScreenWidth()
    { return screenWidth; }
    
    
    public double getScreenHeight()
    { return screenHeight; }
    
    
    public void drawBoard(int [][] board)
    {
        //calculate box dimensions
        boxHeight = getScreenHeight() / board[0].length;
        boxWidth = getScreenWidth() / board.length;
        
        //draw elements
        for(int y = 0; y < board[0].length; y++)
        {
            for(int x = 0; x < board.length; x++)
            {
                if(board[x][y] == emptyID)
                {
                    //draw black box of dimensions boxX x boxY
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
}
