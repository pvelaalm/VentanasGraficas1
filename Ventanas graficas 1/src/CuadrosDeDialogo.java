import javax.swing.*;
import java.awt.*;

public class CuadrosDeDialogo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cuadros de diálogo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);

        JButton button1 = new JButton("Botón 1");

        button1.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Esto es un mensaje de ejemplo.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        });

        frame.setLayout(new FlowLayout());
        frame.add(button1);

        frame.setVisible(true);


    }
}
