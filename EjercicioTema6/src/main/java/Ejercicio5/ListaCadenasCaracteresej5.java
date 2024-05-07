package Ejercicio5;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ListaCadenasCaracteresej5 {
    private static List<String> lista = new ArrayList<>();

    public static void agregarElementoEnPosicion(int posicion, String elemento) {
        if (posicion >= 1 && posicion <= lista.size() + 1) {
            lista.add(posicion - 1, elemento);
            mostrarLista();
        } else {
            JOptionPane.showMessageDialog(null, "Posición no válida.");
        }
    }





    public static void eliminarElementoEnPosicion(int posicion) {
        if (posicion >= 0 && posicion < lista.size()) {
            lista.remove(posicion);
            mostrarLista();
        } else {
            JOptionPane.showMessageDialog(null, "Posición no válida.");
        }
    }

    private static void mostrarLista() {
        StringBuilder sb = new StringBuilder();
        for (String elemento : lista) {
            sb.append(elemento).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
/*
En el ejercicio 5, se ha empleado una lista de cadenas de caracteres (`List<String>`).
Esto se debe a que el objetivo principal del ejercicio es agregar y eliminar elementos en
posiciones específicas de la lista. Una lista de cadenas de caracteres es adecuada para este
propósito, ya que permite almacenar secuencias de texto y manipularlas mediante operaciones
como la inserción y eliminación en posiciones particulares.

 */
