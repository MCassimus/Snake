import java.util.Random;

public class Game
{
    int cellSize, xCells, yCells;
    SnakeHead snakeHead;
    SnakeSegment lastSegment;
    Food food;
    
    
    public Game(int screenWidth, int screenHeight)
    {
        //Create number of cells based on screen dimensions
        cellSize = 10;
        xCells = screenWidth / cellSize;
        yCells = screenHeight / cellSize;
        food = new Food();
                
        newGame();
    }
    
    
    private void newGame()
    {
        Random r = new Random();
        snakeHead = new SnakeHead(r.nextInt(xCells / 2), r.nextInt(yCells / 2));
        lastSegment = snakeHead;
        lastSegment = new SnakeSegment(lastSegment);
        newFoodPos();
    }
    
    
    private void gameOver()
    {
        newGame();
    }
    
    
    private void newFoodPos()
    {
        Random r = new Random();
        int x, y;
        
        do
        {
            x = r.nextInt(xCells);
            y = r.nextInt(yCells);
        } while (snakeOccupies(x, y));
        
        food.setPositions(x, y);
    }
    
    
    private boolean snakeOccupies(int x, int y)
    {
        boolean occupied = false;
        if (lastSegment.occupies(x, y))
            occupied = true;
        return occupied;
    }
    
    
        public void drawObjects(java.awt.Graphics g)
    {
       food.draw(g, cellSize);
       lastSegment.draw(g, cellSize);
    }
    
    
    public void updateObjects()
    {
        //Check if snake will hit itself
        int x = snakeHead.getX(), y = snakeHead.getY();
        switch(snakeHead.getDirection())
        {
        case 'r':
            x++;
            break;
        case 'u':
            y--;
            break;
        case 'l':
            x--;
            break;
        case 'd':
            y++;
            break;
        }
        
        if (snakeOccupies(x, y))
            gameOver();
        else
        {
            lastSegment.move();
            //Check if snake hit food
            x = snakeHead.getX(); 
            y = snakeHead.getY(); //Reupdate variables
            if (x < 0 || x >= xCells || y < 0 || y >= yCells) //Snake goes offscreen
                gameOver();
            else if (x == food.getX() && y == food.getY()) //Snake gets food
            {
                newFoodPos();
                lastSegment = new SnakeSegment(lastSegment);
            }
        }
    }
    
    
    public void keyPressed(char c)
    {
        if (c == 'd')
            snakeHead.setDirection('r');
        else if (c == 'w')
            snakeHead.setDirection('u');
        else if (c == 'a')
            snakeHead.setDirection('l');
        else if (c == 's')
            snakeHead.setDirection('d');
    }
}
