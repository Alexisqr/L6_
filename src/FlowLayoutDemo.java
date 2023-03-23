import java.awt.FlowLayout;
import javax.swing.*;

public class FlowLayoutDemo {
    public static void main(String[] args){
// створюємо вікно і встановлюємо його розмір.
        JFrame jf = new JFrame("Вікно входу");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(320, 150);

        jf.setResizable(false);
// створюємо панель.
        JPanel y = new JPanel();
        jf.add(y);
        JPanel p = new JPanel();
        jf.add(p);
// до панелі додаємо менеджер FlowLayout.
        p.setLayout(new FlowLayout());

// до панелі додаємо кнопки.
        p.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

        JLabel label1 = new JLabel("Логін:     ");
        JTextField textField1 = new JTextField(20);

        JLabel label2 = new JLabel("Пароль:");
        JTextField textField2 = new JTextField(20);

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Відміна");

        p.add(label1);
        p.add(textField1);
        p.add(label2);
        p.add(textField2);
        p.add(okButton);
        p.add(cancelButton);
        jf.setVisible(true);
    }
}
