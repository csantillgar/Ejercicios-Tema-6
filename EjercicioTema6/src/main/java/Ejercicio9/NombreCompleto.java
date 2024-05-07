package Ejercicio9;

import java.util.Objects;

public class NombreCompleto implements Comparable<NombreCompleto> {
    private String nombre;
    private String apellido;

    public NombreCompleto(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public int compareTo(NombreCompleto otroNombre) {
        // Comparar por apellido y luego por nombre si los apellidos son iguales
        int comparacionApellido = this.apellido.compareTo(otroNombre.apellido);
        if (comparacionApellido == 0) {
            return this.nombre.compareTo(otroNombre.nombre);
        }
        return comparacionApellido;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreCompleto that = (NombreCompleto) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }
}
