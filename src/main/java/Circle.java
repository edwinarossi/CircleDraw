import java.awt.*;
/**
 * The Circle class encapsulates the information describing a circle and can draw it in
 * an AWT Graphics object using AWT library methods
 * */

public class Circle extends Shape {
    private int rad; // Fields

    //The Constructor
    public Circle(Point initPos, Color col, int radius) {
        super(initPos, col);
        rad = radius; // Initialize fields
    }

    // A method that draws the object in g
    @Override
    public void draw(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x, pos.y, rad, rad);
    }
}