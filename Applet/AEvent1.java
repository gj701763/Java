import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AEvent1 extends Frame {
    TextField t;

    AEvent1() {
        t = new TextField();
        t.setBounds(20, 30, 170, 120);
        Button b = new Button("click me...!");
        b.setBounds(30, 50, 120, 80);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                t.setText("Welcome");
            }
        });
        add(b);
        add(t);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AEvent1();
    }

}