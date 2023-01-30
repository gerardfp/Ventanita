import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ventanita extends JFrame {
    Random random = new Random();
    void iniciar(){
        JLabel label = new JLabel("?");
        label.setBounds(0,0,400,300);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("sans-serif", Font.BOLD, 128));

        JButton button = new JButton("Tirar dado");
        button.setBounds(0,300, 400,300);
        button.addActionListener(actionEvent -> label.setText("" + (random.nextInt(6)+1)));
        button.setFont(new Font("sans-serif", Font.BOLD, 48));

        add(label);
        add(button);

        setSize(400,600);
        setLayout(null);
        setVisible(true);
    }
}
