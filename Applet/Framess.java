import java.awt.*;

class Framess extends Frame {
    Framess() {

        Button b = new Button("Chick me..!");
        b.setBounds(30, 100, 80, 50);
        add(b);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Framess();
    }
}
