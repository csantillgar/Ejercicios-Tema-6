import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Map;

import Ejercicio1.Pareja;
import Ejercicio2.ListaDatosReales;
import Ejercicio3.ListaParejasEnteros;
import Ejercicio4.ListaCadenasCaracteres;
import Ejercicio5.ListaCadenasCaracteresej5;
import Ejercicio6.ListaCadenasOrdenadaej6;
import Ejercicio7.MapaNumerosTexto;


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

        JButton ejercicio3Button = new JButton("Ejercicio 3");
        panel.add(ejercicio3Button);

        JButton ejercicio4Button = new JButton("Ejercicio 4");
        panel.add(ejercicio4Button);

        JButton ejercicio5Button = new JButton("Ejercicio 5");

        panel.add(ejercicio5Button);

        JButton ejercicio6Button = new JButton("Ejercicio 6");
        //ejercicio6Button.setBounds(80, 260, 150, 25);
        panel.add(ejercicio6Button);

        JButton ejercicio7Button = new JButton("Ejercicio 7");
        panel.add(ejercicio7Button);

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

        // Acción del botón del Ejercicio 3
        ejercicio3Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 3");
            ejercicio3();
        });

        // Acción del botón del Ejercicio 4
        ejercicio4Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 4");
            ejercicio4();
        });

        // Acción del botón del Ejercicio 5
        ejercicio5Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 5");
            ejercicio5();
        });

        // Acción del botón del Ejercicio 6
        ejercicio6Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 6");
            ejercicio6();
        });

        // Acción del botón del Ejercicio 7
        ejercicio7Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 7");
            ejercicio7();
        });
    }

    // Método para el Ejercicio 1
    private static void ejercicio1() {
        Pareja<String> parejaString = obtenerParejaUsuario("string");
        Pareja<Integer> parejaInteger = obtenerParejaUsuario("entero");

        JOptionPane.showMessageDialog(null, "Pareja de String:\nPrimero: " + parejaString.getPrimero() +
                "\nSegundo: " + parejaString.getSegundo());

        JOptionPane.showMessageDialog(null, "Pareja de Integer:\nPrimero: " + parejaInteger.getPrimero() +
                "\nSegundo: " + parejaInteger.getSegundo());
    }

    // Método para el Ejercicio 2
    private static void ejercicio2() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de números reales a generar:"));
        List<Double> lista = ListaDatosReales.generarLista(cantidad);
        ListaDatosReales.mostrarLista(lista);
    }

    // Método para el Ejercicio 3
    private static void ejercicio3() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de parejas de enteros a generar:"));
        List<Pareja<Integer>> lista = ListaParejasEnteros.generarLista(cantidad);
        ListaParejasEnteros.mostrarLista(lista);
    }

    // Método para el Ejercicio 4
    private static void ejercicio4() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("1. Agregar elemento\n2. Eliminar último elemento\n0. Salir");
            switch (opcion) {
                case "1":
                    String elemento = JOptionPane.showInputDialog("Introduce una cadena de caracteres:");
                    ListaCadenasCaracteres.agregarElemento(elemento);
                    break;
                case "2":
                    ListaCadenasCaracteres.eliminarUltimoElemento();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saliendo del Ejercicio 4.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor introduce un número válido.");
            }
        } while (!opcion.equals("0"));
    }

    // Método para el Ejercicio 5
    private static void ejercicio5() {
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("1. Agregar elemento en posición\n2. Eliminar elemento en posición\n0. Salir");
            switch (opcion) {
                case "1":
                    int posicionAgregar = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición donde agregar el elemento:"));
                    String elementoAgregar = JOptionPane.showInputDialog("Introduce una cadena de caracteres:");
                    ListaCadenasCaracteresej5.agregarElementoEnPosicion(posicionAgregar, elementoAgregar);
                    break;
                case "2":
                    int posicionEliminar = Integer.parseInt(JOptionPane.showInputDialog("Introduce la posición del elemento a eliminar:"));
                    ListaCadenasCaracteresej5.eliminarElementoEnPosicion(posicionEliminar);
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saliendo del Ejercicio 5.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor introduce un número válido.");
            }
        } while (!opcion.equals("0"));
    }

    // Método para el Ejercicio 6
    private static void ejercicio6() {
        ListaCadenasOrdenadaej6 listaCadenas = new ListaCadenasOrdenadaej6();
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("1. Insertar cadena\n2. Eliminar cadena\n0. Salir");
            switch (opcion) {
                case "1":
                    String cadenaInsertar = JOptionPane.showInputDialog("Introduce una cadena de caracteres:");
                    listaCadenas.insertar(cadenaInsertar);
                    listaCadenas.mostrar();
                    break;
                case "2":
                    String cadenaEliminar = JOptionPane.showInputDialog("Introduce la cadena a eliminar:");
                    listaCadenas.eliminar(cadenaEliminar);
                    listaCadenas.mostrar();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saliendo del Ejercicio 6.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor introduce un número válido.");
            }
        } while (!opcion.equals("0"));
    }

    // Método para el Ejercicio 7
    private static void ejercicio7() {
        Map<String, Integer> mapaNumerosTexto = MapaNumerosTexto.crearMapa();
        StringBuilder contenido = new StringBuilder();
        contenido.append("Clave : Valor\n");
        for (Map.Entry<String, Integer> entry : mapaNumerosTexto.entrySet()) {
            contenido.append(entry.getKey()).append(" : ").append(entry.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, contenido.toString());
    }



    // Método para obtener la pareja de valores del usuario
    private static Pareja obtenerParejaUsuario(String tipo) {
        String primero = JOptionPane.showInputDialog("Introduce el primer valor para la pareja de " + tipo + ":");
        String segundo = JOptionPane.showInputDialog("Introduce el segundo valor para la pareja de " + tipo + ":");
        return new Pareja<>(primero, segundo);
    }
}
