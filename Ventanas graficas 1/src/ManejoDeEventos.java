import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejoDeEventos {

    public static void main(String[] args) {

        //Crear una nueva ventana
        JFrame frame = new JFrame("Manejo de eventos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        //Crear un boton

        JButton button1 = new JButton("Haz click");


        //Agregar un ActionListener al botón
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hiciste click en el botón!!!!");
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(button1);
        frame.setVisible(true);


        }





    }


