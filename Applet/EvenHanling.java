import java.applet.*;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EvenHanling extends Applet implements ActionListener {

    Button button;

    @Override
    public void init() {
        button = new Button("Click me!");
        button.addActionListener(this);
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Welcome to Java!");
    }
}