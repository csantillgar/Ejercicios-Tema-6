import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.time.LocalDate;
import java.util.List;

import Ejercicio1.Pareja;
import Ejercicio2.ListaDatosReales;
import Ejercicio3.ListaParejasEnteros;
import Ejercicio4.ListaCadenasCaracteres;
import Ejercicio5.ListaCadenasCaracteresej5;
import Ejercicio6.ListaCadenasOrdenadaej6;
import Ejercicio7.MapaNumerosTexto;
import Ejercicio8.MapaNumerosLetras;
import Ejercicio9.NombreCompleto;
import Ejercicio10.Venta;
import Ejercicio11.GestorArchivos;
import Ejercicio12.FileIndexer;



public class Main {
    public static void main(String[] args) {
        // Cambiar la fuente por defecto a Times New Roman
        UIManager.put("OptionPane.messageFont", new Font("Times New Roman", Font.PLAIN, 16));
        UIManager.put("OptionPane.buttonFont", new Font("Times New Roman", Font.PLAIN, 16));
        UIManager.put("Label.font", new Font("Times New Roman", Font.PLAIN, 16));
        UIManager.put("Button.font", new Font("Times New Roman", Font.PLAIN, 16));

        JFrame frame = new JFrame("Ejercicios");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout()); // Usamos GridBagLayout para mayor flexibilidad
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

        JButton ejercicio8Button = new JButton("Ejercicio 8");
        panel.add(ejercicio8Button);


        JButton ejercicio9Button = new JButton("Ejercicio 9");
        panel.add(ejercicio9Button);

        JButton ejercicio10Button = new JButton("Ejercicio 10");
        panel.add(ejercicio10Button);

        JButton ejercicio11Button = new JButton("Ejercicio 11");
        panel.add(ejercicio11Button);

        JButton ejercicio12Button = new JButton("Ejercicio 12");
        panel.add(ejercicio12Button);

        JButton rendimientoButton = new JButton("Comparar Rendimiento de Ordenación");
        panel.add(rendimientoButton);

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

        // Acción del botón del Ejercicio 8
        ejercicio8Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 8");
            ejercicio8();
        });

        // Acción del botón del Ejercicio 9
        ejercicio9Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 9");
            ejercicio9();
        });

        // Acción del botón del Ejercicio 10
        ejercicio10Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 10");
            ejercicio10();
        });

        // Acción del botón del Ejercicio 11
        ejercicio11Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 11");
            ejercicio11();
        });

        // Acción del botón del Ejercicio 12
        ejercicio12Button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Has seleccionado el Ejercicio 12");
            ejercicio12();
        });

        rendimientoButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Comparando rendimiento de ordenación...");
            ejercicioRendimientoOrdenacion();
            JOptionPane.showMessageDialog(null, "Comparación de rendimiento completa.");
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

    // Método para el Ejercicio 8
    private static void ejercicio8() {
        MapaNumerosLetras mapa = new MapaNumerosLetras();
        String opcion;
        do {
            opcion = JOptionPane.showInputDialog("1. Agregar par número/letra\n2. Obtener letra por número\n0. Salir");
            switch (opcion) {
                case "1":
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
                    char letra = JOptionPane.showInputDialog("Introduce una letra:").charAt(0);
                    mapa.agregarPar(numero, letra);
                    break;
                case "2":
                    int numeroBuscar = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número para obtener la letra:"));
                    char letraObtenida = mapa.obtenerLetra(numeroBuscar);
                    if (letraObtenida != '\0') {
                        JOptionPane.showMessageDialog(null, "La letra correspondiente al número " + numeroBuscar + " es: " + letraObtenida);
                    }
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Saliendo del Ejercicio 8.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, por favor introduce un número válido.");
            }
        } while (!opcion.equals("0"));
    }

    // Método para el Ejercicio 9
    private static void ejercicio9() {
        // Crear un TreeSet para almacenar los nombres completos ordenados por apellido
        Set<NombreCompleto> nombresOrdenados = new TreeSet<>();

        // Solicitar al usuario que ingrese pares de nombre/apellido
        String opcion;
        do {
            String nombre = JOptionPane.showInputDialog("Introduce el nombre:");
            String apellido = JOptionPane.showInputDialog("Introduce el apellido:");
            NombreCompleto nombreCompleto = new NombreCompleto(nombre, apellido);
            nombresOrdenados.add(nombreCompleto);
            opcion = JOptionPane.showInputDialog("¿Deseas ingresar otro nombre? (s/n):");
        } while (!opcion.equalsIgnoreCase("n"));

        // Mostrar los nombres ordenados alfabéticamente por apellido
        StringBuilder listaNombres = new StringBuilder("Nombres ordenados alfabéticamente por apellido:\n");
        for (NombreCompleto nombre : nombresOrdenados) {
            listaNombres.append(nombre).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaNombres.toString());
    }

    private static void ejercicio10() {
        // Crear un TreeSet para almacenar las ventas ordenadas
        Set<Venta> ventasOrdenadas = new TreeSet<>();

        // Solicitar al usuario que ingrese los datos de la venta
        String opcion;
        do {
            String producto = JOptionPane.showInputDialog("Introduce el nombre del producto:");
            String cliente = JOptionPane.showInputDialog("Introduce el nombre del cliente:");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio de la venta:"));
            LocalDate fecha = LocalDate.now(); // Fecha actual
            Venta venta = new Venta(producto, cliente, precio, fecha);
            ventasOrdenadas.add(venta);
            opcion = JOptionPane.showInputDialog("¿Deseas ingresar otra venta? (s/n):");
        } while (!opcion.equalsIgnoreCase("n"));

        // Mostrar las ventas ordenadas
        StringBuilder listaVentas = new StringBuilder("Ventas ordenadas:\n");
        for (Venta venta : ventasOrdenadas) {
            listaVentas.append(venta).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaVentas.toString());
    }

    // Método para el Ejercicio 11
    private static void ejercicio11() {
        String rutaEntrada = JOptionPane.showInputDialog("Introduce la ruta del archivo de entrada:");
        String rutaSalida = JOptionPane.showInputDialog("Introduce la ruta del archivo de salida:");

        // Llamar al método de GestorArchivos para ordenar el archivo
        GestorArchivos.ordenarArchivo(rutaEntrada, rutaSalida);
    }

    private static void ejercicio12() {
        // Crear un objeto FileIndexer
        FileIndexer fileIndexer = new FileIndexer();

        // Indexar el contenido del directorio de inicio del usuario
        String userHomeDirectory = System.getProperty("user.home");
        fileIndexer.indexFiles(userHomeDirectory);

        // Mostrar opciones al usuario
        String[] options = {"Buscar archivo por nombre", "Listar archivos ordenados alfabéticamente"};
        int choice = JOptionPane.showOptionDialog(null, "Selecciona una opción:", "Ejercicio 12", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        switch (choice) {
            case 0: // Buscar archivo por nombre
                String fileName = JOptionPane.showInputDialog("Introduce el nombre del archivo:");
                String filePath = fileIndexer.getFilePath(fileName);
                if (filePath != null) {
                    JOptionPane.showMessageDialog(null, "La ruta del archivo '" + fileName + "' es:\n" + filePath);
                } else {
                    JOptionPane.showMessageDialog(null, "El archivo '" + fileName + "' no se encontró en el directorio.");
                }
                break;
            case 1: // Listar archivos ordenados alfabéticamente
                List<String> sortedFiles = fileIndexer.getAllFilesSorted();
                StringBuilder filesList = new StringBuilder("Archivos ordenados alfabéticamente:\n");
                for (String file : sortedFiles) {
                    filesList.append(file).append("\n");
                }
                JOptionPane.showMessageDialog(null, filesList.toString());
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida.");
                break;
        }
    }



    // Método para obtener la pareja de valores del usuario
    private static Pareja obtenerParejaUsuario(String tipo) {
        String primero = JOptionPane.showInputDialog("Introduce el primer valor para la pareja de " + tipo + ":");
        String segundo = JOptionPane.showInputDialog("Introduce el segundo valor para la pareja de " + tipo + ":");
        return new Pareja<>(primero, segundo);
    }

    // Método para comparar el rendimiento de la ordenación
    private static void ejercicioRendimientoOrdenacion() {
        int cantidad = 1_000_000;
        int[] numerosAleatorios = new int[cantidad];

        // Generar números aleatorios
        for (int i = 0; i < cantidad; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 1_000_000);
        }

        // Ordenar utilizando TreeSet
        long startTime = System.nanoTime();
        Set<Integer> treeSet = new TreeSet<>();
        for (int num : numerosAleatorios) {
            treeSet.add(num);
        }
        long endTimeTreeSet = System.nanoTime();
        long tiempoTreeSet = endTimeTreeSet - startTime;

        // Ordenar utilizando Collections.sort()
        startTime = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>();
        for (int num : numerosAleatorios) {
            arrayList.add(num);
        }
        Collections.sort(arrayList);
        long endTimeCollectionsSort = System.nanoTime();
        long tiempoCollectionsSort = endTimeCollectionsSort - startTime;

        // Ordenar utilizando Arrays.sort()
        startTime = System.nanoTime();
        Arrays.sort(numerosAleatorios);
        long endTimeArraysSort = System.nanoTime();
        long tiempoArraysSort = endTimeArraysSort - startTime;

        // Mostrar tiempos de ordenación en una ventana emergente
        StringBuilder message = new StringBuilder();
        message.append("Tiempo de ordenación utilizando TreeSet: ").append(tiempoTreeSet).append(" nanosegundos.\n");
        message.append("Tiempo de ordenación utilizando Collections.sort(): ").append(tiempoCollectionsSort).append(" nanosegundos.\n");
        message.append("Tiempo de ordenación utilizando Arrays.sort(): ").append(tiempoArraysSort).append(" nanosegundos.");

        JOptionPane.showMessageDialog(null, message.toString(), "Tiempos de Ordenación", JOptionPane.INFORMATION_MESSAGE);
    }
}


