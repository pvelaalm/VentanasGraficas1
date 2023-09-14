import javax.swing.*;
import java.awt.*;

public class CamposYEtiquetas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Campos y etiquetas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);

        //Crear una etiqueta
        JLabel label = new JLabel("Ingresa tu nombre: ");

        //Crear un campo de texto

        JTextField textField = new JTextField(20);

        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.add(textField);

        frame.setVisible(true);
    }

}
