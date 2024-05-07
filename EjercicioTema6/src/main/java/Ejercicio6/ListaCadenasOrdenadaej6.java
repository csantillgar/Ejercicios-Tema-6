package Ejercicio6;

import javax.swing.*;
import java.util.LinkedList;

public class ListaCadenasOrdenadaej6 {
    private LinkedList<String> lista;

    public ListaCadenasOrdenadaej6() {
        this.lista = new LinkedList<>();
    }

    public void insertar(String cadena) {
        int index = 0;
        for (String elemento : lista) {
            if (cadena.compareTo(elemento) < 0) {
                break;
            }
            index++;
        }
        lista.add(index, cadena);
    }

    public void eliminar(String cadena) {
        lista.remove(cadena);
    }

    public void mostrar() {
        StringBuilder sb = new StringBuilder();
        int posicion = 1;
        for (String cadena : lista) {
            sb.append("Posición: ").append(posicion).append(", Cadena: ").append(cadena).append("\n");
            posicion++;
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
/*
Para el ejercicio 6, he utilizado una lista ordenada.
Esta estructura garantiza que los elementos estén siempre
en orden, lo que facilita las operaciones de inserción, eliminación
y búsqueda de cadenas de caracteres.
 */
