public class Game
{
    int screenWidth, screenHeight, cellSize;
    int[][] board;
    SnakeHead snakeHead;
    SnakeSegment lastSegment;
    Food food;
    
    
    public Game(int screenWidth, int screenHeight)
    {
        //Create number of cells based on screenWidth
        board = new int[screenWidth / 10][screenHeight / 10];
        
        newGame();
    }
    
    
    public SnakeSegment getLastSegment()
    { return lastSegment; }
    
    
    public Food getFood()
    { return food; }
    
    
    private void newGame()
    {
        snakeHead = new SnakeHead(board.length / 4, board[0].length / 2);
    }
    
    
    public void drawObjects(java.awt.Graphics g)
    {
        food.draw(g, cellSize);
        lastSegment.draw(g, cellSize);
    }
    
    
    public void updateObjects()
    {
        lastSegment.move();
    }
    
    
    public void keyPressed(char k)
    {
        
    }
}
