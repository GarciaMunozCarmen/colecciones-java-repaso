package es.fplumara.dam1.actividades.alumnos;

import java.util.Objects;

public class Alumno implements Comparable{
    private final String dni;
    private final String nombre;

    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;

    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Alumno{dni='" + dni + "', nombre='" + nombre + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Alumno alumno)) return false;
        return Objects.equals(dni, alumno.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;
        if(dni.equalsIgnoreCase(a.dni)) {
            return nombre.compareTo(a.nombre);
        }else {
            return dni.compareTo(a.dni);
        }
    }
}
