import javax.swing.*;
import java.awt.*;

public class VentanaConFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana con flowlayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        //Crear dos botones

        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");

        //Utilizar flowLayout para organizar los botones de izquierda a derecha

        frame.setLayout(new FlowLayout());

        //Agregar los botones a la ventana
        frame.add(button1);
        frame.add(button2);

        frame.setVisible(true);

    }
}
