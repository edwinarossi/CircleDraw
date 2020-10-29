import java.awt.*;

public class Rect extends Shape {

    // Fields
    private int width;
    private int height;

    //The Constructor
    public Rect(Point initPos, Color col, int w, int h) {
        super(initPos, col);
        width = w; // Initialize fields
        height = h;
        pos = initPos;
        this.col = col;
    }

    // A method that draws the object in g
    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }
}
