public class Game
{
    int screenWidth, screenHeight, cellSize;
    int[][] board;
    SnakeHead snakeHead;
    SnakeSegment lastSegment;
    Food food;
    
    
    public Game(int screenWidth, int screenHeight)
    {
        //Create number of cells based on screen dimensions
        board = new int[screenWidth / 10][screenHeight / 10];
        cellSize = 10;
        
        newGame();
    }
    
    
    public SnakeSegment getLastSegment()
    { return lastSegment; }
    
    
    public Food getFood()
    { return food; }
    
    
    private void newGame()
    {
        snakeHead = new SnakeHead(board.length / 4, board[0].length / 2);
        lastSegment = snakeHead;
    }
    
    
    public void drawObjects(java.awt.Graphics g)
    {
       // food.draw(g, cellSize);
        lastSegment.draw(g, cellSize);
    }
    
    
    public void updateObjects()
    {
        lastSegment.move();
    }
    
    
    public void keyPressed(char c)
    {
        if (c == 'd')
            snakeHead.changeDirection('r');
        else if (c == 'w')
            snakeHead.changeDirection('u');
        else if (c == 'a')
            snakeHead.changeDirection('l');
        else if (c == 's')
            snakeHead.changeDirection('d');
    }
}
