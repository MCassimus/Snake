public class SnakeHead extends SnakeSegment
{
    //0 is right, 1 is up, 2 is left, 3 is down
    int direction;
     
    
    public SnakeHead(int initX, int initY)
    {
        super();
        setPositions(initX, initY);
        direction = 0;
    }
}