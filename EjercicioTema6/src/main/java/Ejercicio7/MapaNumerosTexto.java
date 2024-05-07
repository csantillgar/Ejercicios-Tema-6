package Ejercicio7;

import java.util.HashMap;
import java.util.Map;

public class MapaNumerosTexto {

    public static Map<String, Integer> crearMapa() {
        Map<String, Integer> mapa = new HashMap<>();
        // Llenar el mapa con los números del 0 al 10
        for (int i = 0; i <= 10; i++) {
            mapa.put(convertirNumeroATexto(i), i);
        }
        return mapa;
    }

    private static String convertirNumeroATexto(int numero) {
        switch (numero) {
            case 0:
                return "cero";
            case 1:
                return "uno";
            case 2:
                return "dos";
            case 3:
                return "tres";
            case 4:
                return "cuatro";
            case 5:
                return "cinco";
            case 6:
                return "seis";
            case 7:
                return "siete";
            case 8:
                return "ocho";
            case 9:
                return "nueve";
            case 10:
                return "diez";
            default:
                return "";
        }
    }
}
