package Ejercicio3;

import Ejercicio1.Pareja;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListaParejasEnteros {

    public static List<Pareja<Integer>> generarLista(int cantidad) {
        List<Pareja<Integer>> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            int primero = random.nextInt(100); // Genera números aleatorios entre 0 y 99
            int segundo = random.nextInt(100);
            lista.add(new Pareja<>(primero, segundo));
        }
        return lista;
    }

    public static void mostrarLista(List<Pareja<Integer>> lista) {
        StringBuilder sb = new StringBuilder();
        for (Pareja<Integer> pareja : lista) {
            sb.append("Primero: ").append(pareja.getPrimero()).append(", Segundo: ").append(pareja.getSegundo()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
