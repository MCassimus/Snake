public class SnakeHead extends SnakeSegment
{
    char direction;
    
    
    public SnakeHead(int initX, int initY)
    {
        super();
        setPositions(initX, initY);
        direction = 'r';
    }
    
    
    public void move()
    {
        switch (direction)
        {
        case 'r': //Right
            setPositions(getX() + 1, getY());
            break;
        case 'u': //Up
            setPositions(getX(), getY() - 1);
            break;
        case 'l': //Left
            setPositions(getX() - 1, getY());
            break;
        case 'd': //Down
            setPositions(getX(), getY() + 1); 
            break;
        }
    }
    
    
    public void changeDirection(char newD)
    {
        //Make sure player is not reversing direction
        boolean valid = true;
        if (direction == 'r' && newD == 'l')
            valid = false;
        else if (direction == 'u' && newD == 'd')
            valid = false;
        else if (direction == 'l' && newD == 'r')
            valid = false;
        else if (direction == 'd' && newD == 'u')
            valid = false;
        
        if (valid)
            direction = newD;
    }
}