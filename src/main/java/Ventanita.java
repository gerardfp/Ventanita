import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ventanita extends JFrame {
    Random random = new Random();
    void iniciar(){
        JLabel label = new JLabel("?");
        label.setBounds(0,0,400,300);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("sans", Font.BOLD, 128));

        JButton button = new JButton("Tirar dado");
        button.setBounds(0,300, 400,300);
        button.addActionListener(actionEvent -> label.setText("" + getRandomNumber()));
        button.setFont(new Font("sans", Font.BOLD, 48));

        add(label);
        add(button);

        setSize(400,600);
        setLayout(null);
        setVisible(true);
    }

    int getRandomNumber(){
        // https://stackoverflow.com/a/363732
//        return 1 + (int) (Math.random() * ((6+1)));
//        return 1 + (int) (Math.random() * ((6-1)) + 1);
//        return (int) (Math.random() * ((6-1)) + 1);
        return random.nextInt(6)+1;
    }
}
