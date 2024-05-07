import javax.swing.*;
import java.awt.*;
import java.util.List;
import Ejercicio1.Pareja;
import Ejercicio2.ListaDatosReales;

public class Main {
    public static void main(String[] args) {
        // Cambiar la fuente por defecto a Times New Roman
        UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.PLAIN, 16));
        UIManager.put("OptionPane.buttonFont", new Font("Times New Roman", Font.PLAIN, 16));
        UIManager.put("Label.font", new Font("Times New Roman", Font.PLAIN, 16));
        UIManager.put("Button.font", new Font("Times New Roman", Font.PLAIN, 16));

        JFrame frame = new JFrame("Ejercicios");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(new GridLayout(0, 1));

        JLabel titleLabel = new JLabel("Ejercicios Tema 6");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        panel.add(titleLabel);

        JButton ejercicio1Button = new JButton("Ejercicio 1");
        panel.add(ejercicio1Button);

        JButton ejercicio2Button = new JButton("Ejercicio 2");
        panel.add(ejercicio2Button);

        // Acción del botón del Ejercicio 1
        ejercicio1Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 1");
            ejercicio1();
        });

        // Acción del botón del Ejercicio 2
        ejercicio2Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 2");
            ejercicio2();
        });
    }

    // Definición de los métodos para cada ejercicio
    private static void ejercicio1() {
        Pareja<String> parejaString = obtenerParejaUsuario("string");
        Pareja<Integer> parejaInteger = obtenerParejaUsuario("entero");

        JOptionPane.showMessageDialog(null, "Pareja de String:\nPrimero: " + parejaString.getPrimero() +
                "\nSegundo: " + parejaString.getSegundo());

        JOptionPane.showMessageDialog(null, "Pareja de Integer:\nPrimero: " + parejaInteger.getPrimero() +
                "\nSegundo: " + parejaInteger.getSegundo());
    }


    private static void ejercicio2() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de números reales a generar:"));
        List<Double> lista = ListaDatosReales.generarLista(cantidad);
        ListaDatosReales.mostrarLista(lista);
    }

    // Método para obtener la pareja de valores del usuario
    private static Pareja obtenerParejaUsuario(String tipo) {
        String primero = JOptionPane.showInputDialog("Introduce el primer valor para la pareja de " + tipo + ":");
        String segundo = JOptionPane.showInputDialog("Introduce el segundo valor para la pareja de " + tipo + ":");
        return new Pareja<>(primero, segundo);
    }
}
