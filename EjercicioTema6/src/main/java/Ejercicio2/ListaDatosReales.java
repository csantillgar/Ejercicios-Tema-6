package Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaDatosReales {

    public static List<Double> generarLista(int cantidad) {
        List<Double> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextDouble() * 100); // Genera números aleatorios entre 0 y 100
        }
        return lista;
    }

    public static void mostrarLista(List<Double> lista) {
        StringBuilder sb = new StringBuilder();
        for (Double dato : lista) {
            sb.append(dato).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
