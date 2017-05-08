public class Game
{
    private Window win;
    private Snake snake;
    private Food food;
    
    
    public Game(Window window)
    {
        win = window;
        snake = new Snake(0, 0);//create new player
        food = new Food(window.getScreenWidth(), window.getScreenHeight());
        
        while(snake.isAlive())//while the snake is alive
            loop();//run the game
    }
    
    
    //controls the game loop
    protected void loop()
    {
        
        return;
    }
}
