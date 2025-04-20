import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;

//import java.awt.swing;
public class Border {
    Border() {
        JFrame j = new JFrame();

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");

        j.add(b1, BorderLayout.NORTH);
        j.add(b2, BorderLayout.SOUTH);
        j.add(b3, BorderLayout.EAST);
        j.add(b4, BorderLayout.WEST);
        j.add(b5, BorderLayout.CENTER);

        j.setSize(300, 300);
        j.setVisible(true);

    }

    public static void main(String[] args) {
        new Border();
    }
}