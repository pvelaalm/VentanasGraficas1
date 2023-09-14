import javax.swing.*;
import java.awt.*;

public class PersonalizarApariencia {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Personalizar la apariencia");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,700);

        JButton button1 = new JButton("Botón 1");

        //Cambiar el color del fondo
        button1.setBackground(Color.cyan);

        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.setVisible(true);
    }
}
