import java.awt.*;

public abstract class Shape {
    //abstract class that takes common methods from Rect and Circle
    //also takes the fields pos and col
    protected Point pos;
    protected Color col;

    //Constructor
    public Shape(Point initPos, Color col) {
        pos = initPos;
        this.col = col;
    }

    // A method that draws the object in g
    // no implementation, get specific implementation in Rect and Circle
    public abstract void draw(Graphics g);
}
