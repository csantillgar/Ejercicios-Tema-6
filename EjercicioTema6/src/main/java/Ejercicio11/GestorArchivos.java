package Ejercicio11;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestorArchivos {

    public static void ordenarArchivo(String rutaEntrada, String rutaSalida) {
        try {
            // Leer todas las líneas del archivo de entrada
            List<String> lineas = leerArchivo(rutaEntrada);

            // Ordenar las líneas
            Collections.sort(lineas);

            // Escribir las líneas ordenadas en el archivo de salida
            escribirArchivo(lineas, rutaSalida);

            System.out.println("Archivo ordenado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    private static List<String> leerArchivo(String rutaArchivo) throws IOException {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        }
        return lineas;
    }

    private static void escribirArchivo(List<String> lineas, String rutaArchivo) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        }
    }
}
