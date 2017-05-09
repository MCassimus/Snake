
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food
{
    // instance variables - replace the example below with your own
    private int [][] board;
    private int screenWidth;
    private int screenHeight;
    //board data aliases
    private int emptyID = 0;//empty space
    private int snakeID = 1;//represents a snake segment
    private int foodID = 2;//represents food item
    
    /**
     * Constructor for objects of class Food
     */
    public Food(int [][] gameBoard)
    {
        board = gameBoard;
        screenWidth = board.length - 1;
        screenHeight = board[0].length - 1;
        
        newPos();
    }

    
    //randomly generate new coordinates for the food item
    public void newPos()
    {
        boolean placeSuccess = false;
        
        //find previous food item and erase
        for(int y = 0; y <= screenHeight; y++)
            for(int x = 0; x <= screenWidth; x++)
                if(board[x][y] == foodID)
                    board[x][y] = emptyID;
                    
        //randomly generate a new valid position for the food
        while(!placeSuccess)
        {
            int tempX = (int)Math.random() * screenWidth;
            int tempY = (int)Math.random() * screenHeight;
        
            if(board[tempX][tempY] == emptyID)
            {
                board[tempX][tempY] = foodID;
                placeSuccess = true;
            }
        }
    }
}
