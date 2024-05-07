package Ejercicio8;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MapaNumerosLetras {
    private Map<Integer, Character> mapa;

    public MapaNumerosLetras() {
        this.mapa = new HashMap<>();
    }

    public void agregarPar(int numero, char letra) {
        mapa.put(numero, letra);
    }

    public char obtenerLetra(int numero) {
        if (mapa.containsKey(numero)) {
            return mapa.get(numero);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró una letra para el número proporcionado.");
            return '\0';
        }
    }
}
