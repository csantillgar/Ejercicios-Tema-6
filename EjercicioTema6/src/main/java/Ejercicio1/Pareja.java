package Ejercicio1;
import javax.swing.*;

public class Pareja<T> {
    private T dato1;
    private T dato2;

    public Pareja(T dato1, T dato2) {
        this.dato1 = dato1;
        this.dato2 = dato2;
    }

    public T getDato1() {
        return dato1;
    }

    public T getDato2() {
        return dato2;
    }

    public void setDato1(T dato1) {
        this.dato1 = dato1;
    }

    public void setDato2(T dato2) {
        this.dato2 = dato2;
    }

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese los datos para la pareja
        String inputDato1 = JOptionPane.showInputDialog("Ingrese el primer dato:");
        String inputDato2 = JOptionPane.showInputDialog("Ingrese el segundo dato:");

        // Crear una instancia de Pareja con los datos ingresados por el usuario
        Pareja<String> pareja = new Pareja<>(inputDato1, inputDato2);

        // Mostrar los datos de la pareja en un JOptionPane
        JOptionPane.showMessageDialog(null,
                "Dato 1: " + pareja.getDato1() + "\n" +
                        "Dato 2: " + pareja.getDato2());
    }
}
