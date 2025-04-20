import java.awt.*;
import java.applet.*;
/* <applet code="Some" width=200 height=200>
</applet> */
public class Practical11 extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.RED);
g.fillOval(80,50,50,50);
g.setColor(Color.GREEN);
g.fillRect(50,120,100,50);
g.setColor(Color.YELLOW);
int x1[]={50, 100, 150, 50};
int y1[]={250, 200, 250, 250};
int n1=4;
g.fillPolygon(x1, y1, n1);
}
}
