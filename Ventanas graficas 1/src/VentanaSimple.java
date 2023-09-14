import javax.swing.*;
import java.awt.*;


public class VentanaSimple {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana con botón");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,300);

        JButton button = new JButton("Haz click");
        frame.add(button);


        frame.setVisible(true);

    }
}