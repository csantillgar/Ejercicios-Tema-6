import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Ejercicio1.Pareja;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejercicio 1: Clase Pareja");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        JButton botonEjercicio1 = new JButton("Ejercicio 1");

        botonEjercicio1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llamar a la ventana para el ejercicio 1
                ejercicio1();
            }
        });

        panel.add(botonEjercicio1);
        frame.add(panel);
        frame.setVisible(true);
    }

    public static void ejercicio1() {
        JFrame ejercicio1Frame = new JFrame("Ejercicio 1: Clase Pareja");
        ejercicio1Frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JTextField inputDato1 = new JTextField();
        JTextField inputDato2 = new JTextField();
        JButton botonMostrar = new JButton("Mostrar Pareja");

        panel.add(new JLabel("Ingrese el primer dato:"));
        panel.add(inputDato1);
        panel.add(new JLabel("Ingrese el segundo dato:"));
        panel.add(inputDato2);
        panel.add(botonMostrar);

        botonMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de Pareja con los datos ingresados por el usuario
                Pareja<String> pareja = new Pareja<>(inputDato1.getText(), inputDato2.getText());

                // Mostrar los datos de la pareja en un JOptionPane
                JOptionPane.showMessageDialog(null,
                        "Dato 1: " + pareja.getDato1() + "\n" +
                                "Dato 2: " + pareja.getDato2());
            }
        });

        ejercicio1Frame.add(panel);
        ejercicio1Frame.setVisible(true);
    }
}
