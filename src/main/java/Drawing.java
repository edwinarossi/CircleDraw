import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private Frame f;

    // The constructor
    public Drawing() {
        f = new Frame("My window"); // Instantiates the Frame
        f.add(this); // Adds the Canvas to the Frame
        f.setLayout(null); // Stops the frame from trying to layout contents
        f.setSize(400, 400); // Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() { // Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        setBackground(Color.WHITE); // Sets the Canvas background
        setSize(400, 400); // Sets the Canvas size to be the same as the frame
    }

    public void paint(Graphics g) {
        //point and colour are from canvas
        Point p=new Point(200,200);
        Color c=new Color(0x992266);// The RGB number comprises three bytes: red, green and blue
        //create Circle object and call on method draw (public method)
        Circle circle=new Circle(p,c, 50); //from the Circle constructor
        circle.draw(g);

        Point p_rectangle=new Point(100, 150);
        Color c_rectangle=new Color(0x3CBFBF);
        Rect rect=new Rect(p_rectangle, c_rectangle, 100, 200);
        rect.draw(g);
    }

}