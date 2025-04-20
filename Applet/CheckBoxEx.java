import java.awt.Checkbox;
import java.awt.Frame;

public class CheckBoxEx {
    CheckBoxEx() {
        Frame f = new Frame("CheckBox");
        Checkbox c = new Checkbox("java", true);
        c.setBounds(100, 100, 50, 50);
        f.add(c);
        f.setSize(300, 300);
        f.setVisible(true);
        f.setLayout(null);
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
