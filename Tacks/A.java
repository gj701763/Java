package Tacks;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class A extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(50, 120, 100, 50);
    }
}