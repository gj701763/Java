import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AEvent extends Frame implements ActionListener {
    TextField t;

    AEvent() {
        TextField t = new TextField();
        t.setBounds(60, 50, 170, 50);
        Button b = new Button("click me...!");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);
        add(b);
        add(t);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        t.setText("Welcome");
    }

    public static void main(String[] args) {
        new AEvent();
    }
}
