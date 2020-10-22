import java.awt.*;
/**
 * The Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */

public class Circle {
    private int rad; // Fields
    private Point pos;
    private Color col;

    //The Constructor
    public Circle(Point initPos, Color col, int radius) {
        rad = radius; // Initialize fields
        pos = initPos;
        this.col = col;
    }

    // A method that draws the object in g
    public void draw(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x, pos.y, rad, rad);
    }
}