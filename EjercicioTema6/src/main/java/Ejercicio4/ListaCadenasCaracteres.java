package Ejercicio4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListaCadenasCaracteres {
    private static List<String> lista = new ArrayList<>();

    public static void agregarElemento(String elemento) {
        lista.add(elemento);
        mostrarLista();
    }

    public static void eliminarUltimoElemento() {
        if (!lista.isEmpty()) {
            lista.remove(lista.size() - 1);
            mostrarLista();
        } else {
            JOptionPane.showMessageDialog(null, "La lista está vacía, no se puede eliminar ningún elemento.");
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
En el ejercicio 4, se ha empleado una lista de cadenas de caracteres (`List<String>`).
Esta elección se debe a que el ejercicio implica la manipulación de cadenas de caracteres,
como agregar y eliminar elementos en una posición específica. Una lista de cadenas de caracteres
es la estructura de datos más adecuada para manejar este tipo de información, ya que permite
almacenar y manipular secuencias de texto de manera eficiente.
 */
