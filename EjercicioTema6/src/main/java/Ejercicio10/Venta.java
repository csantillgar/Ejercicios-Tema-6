package Ejercicio10;

import java.time.LocalDate;

public class Venta implements Comparable<Venta> {
    private String producto;
    private String cliente;
    private double precio;
    private LocalDate fecha;

    public Venta(String producto, String cliente, double precio, LocalDate fecha) {
        this.producto = producto;
        this.cliente = cliente;
        this.precio = precio;
        this.fecha = fecha;
    }

    // Método para obtener la fecha de la venta
    public LocalDate getFecha() {
        return fecha;
    }

    // Método para comparar ventas por fecha, nombre del cliente y precio
    @Override
    public int compareTo(Venta otraVenta) {
        int comparacionFecha = this.fecha.compareTo(otraVenta.fecha);
        if (comparacionFecha != 0) {
            return comparacionFecha;
        }
        int comparacionCliente = this.cliente.compareTo(otraVenta.cliente);
        if (comparacionCliente != 0) {
            return comparacionCliente;
        }
        return Double.compare(this.precio, otraVenta.precio);
    }

    // Método para representar una venta como cadena de texto
    @Override
    public String toString() {
        return "Venta{" +
                "producto='" + producto + '\'' +
                ", cliente='" + cliente + '\'' +
                ", precio=" + precio +
                ", fecha=" + fecha +
                '}';
    }
}
