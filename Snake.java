import java.lang.String;
import java.lang.ArrayIndexOutOfBoundsException;

public class Snake
{
    private int [][] board;
    private int headPosX;
    private int headPosY;
    private boolean life;
    private int length;
    private String dir;
    //board data aliases
    private int emptyID = 0;//empty space
    private int snakeID = 1;//represents a snake segment
    private int foodID = 2;//represents food item
    
    public Snake(int[][] gameBoard)
    {
        board = gameBoard;
        life = true;
        length = 1;
        headPosY = (int)Math.random() * (board[0].length - 1);
        headPosX = (board.length - 1) / 8;
        dir = "left";
    }
    
    
    public boolean isAlive()
    {
        return life;
    }
    
    
    public void turnLeft()
    {
        if(dir == "up")
            dir = "left";
        else if(dir == "left")
            dir = "down";
        else if(dir == "down")
            dir = "right";
        else
            dir = "up";
    }
    
    
    public void turnRight()
    {
        if(dir == "up")
            dir = "right";
        else if(dir == "right")
            dir = "down";
        else if(dir == "down")
            dir = "left";
        else
            dir = "up";
    }
    
    
    //returns true if food collision, kill if self collision, false otherwise
    public boolean update()
    {        
        try
        {
            if(dir == "up")
            {
                if(board[headPosX][headPosY++] == foodID)//move & food test
                    return true;//food collision
                else if(board[headPosX][headPosY] == snakeID)//self collision check
                    life = false;
            }          
            else if(dir == "right")
            {
                if(board[headPosX++][headPosY] == foodID)//move & food test
                    return true;
                else if(board[headPosX][headPosY] == snakeID)//self collision check
                    life = false;
            }
            else if(dir == "down")
            {
                if(board[headPosX][headPosY--] == foodID)//move & food test
                    return true;
                else if(board[headPosX][headPosY] == snakeID)//self collision check
                    life = false;
            }
            else if(dir == "left")
            {
                if(board[headPosX--][headPosY] == foodID)//move & food test
                    return true;
                else if(board[headPosX][headPosY] == snakeID)//self collision check
                    life = false;
            }    
        }
        catch(ArrayIndexOutOfBoundsException exception)//player off board, death
        {
            life = false;
        }
        
        return false;
    }
}