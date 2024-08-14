import java.awt.*;
import java.applet.*;

/*Write a program to create applet which set background color
    with read and foreground color with blue. */

/*. Define Applet. Write a program to create applet to display filled
rectangle and display
message “GONDWANA UNIVERSITY EXAMINATION 2023 “
in red color below it */

public class Sample extends Applet {
    // public void init() {
    // Label l = new Label("Hello World");
    // l.setBackground(Color.red);
    // add(l);
    // }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(100, 100, 200, 100);

        // Draw a message
        g.setColor(Color.red);
        g.setFont(new Font("Arial", Font.PLAIN, 10));
        g.drawString("GONDWANA UNIVERSITY EXAMINATION 2023", 100, 200);
    }
}