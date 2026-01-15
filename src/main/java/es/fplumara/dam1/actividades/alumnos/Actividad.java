package es.fplumara.dam1.actividades.alumnos;

import java.util.*;

public class Actividad {

    public void procesar(List<Alumno> alumnosEntrada) {
        Set<Alumno> alumnoSet = new TreeSet<>(alumnosEntrada); //Tree no los hace unicos ???? (por algun motivo desconocido)
        System.out.printf("Total Alumnos: %d\nAlumnos no repetidos (%d):\n",alumnosEntrada.size(), alumnoSet.size());
        alumnoSet.forEach(a-> System.out.println(a.toString()));
    }


}