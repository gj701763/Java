import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swap {
    public static <TestFiled> void main(String[] args) {
        Frame f = new Frame("Welcome");
        Label l = new Label("First");
        Label l1 = new Label("Seconde");

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(0);

        Button b = new Button("Ok");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String temp = t1.getText();
                t1.setText(t2.getText());
                t2.setText(temp);
            }
        });
        f.add(l);
        f.add(t1);
        f.add(l1);
        f.add(t2);
        f.add(b);
        f.setLayout(new FlowLayout());
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
