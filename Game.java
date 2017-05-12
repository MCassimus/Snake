public class Game
{
    int [][] board;
    Window win;
    SnakeHead snake;
    Food food;
    //board data aliases
    private int emptyID = 0;//empty space
    private int snakeID = 1;//represents a snake segment
    private int foodID = 2;//represents food item
    
    public Game(Window window)
    {
        System.out.println("This is a test2");
        win = window;
        newGame();
        
        //while(snake.isAlive())
       // {
           // if(snake.update())//if update returns true, make new food
            //    food.newPos();
                
           // window.drawBoard(board);
       // }
    }
    
    
    private void newGame()
    {
        board = new int[(int)win.getScreenWidth() / 10][(int)win.getScreenHeight() / 10];
        
        //initialize board to all empty
        for(int y = 0; y < board[0].length; y++)
            for(int x = 0; x < board.length; x++)
                board[x][y] = emptyID;
                
        //create objects
        //snake = new Snake(board);
        //food = new Food(board);
    }
}
