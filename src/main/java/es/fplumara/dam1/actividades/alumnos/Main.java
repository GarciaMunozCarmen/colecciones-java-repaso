package es.fplumara.dam1.actividades.alumnos;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> alumnosEntrada = List.of(
                new Alumno("123A", "Ana"),
                new Alumno("123A", "Ana María"),
                new Alumno("999Z", "Zoe"),
                new Alumno("555B", "Bruno"),
                new Alumno("555B", "Bruno López"),
                new Alumno("777K", "Kike"),
                new Alumno("888M", "Marta"),
                new Alumno("888M", "Marta G."),
                new Alumno("111Q", "Quino"),
                new Alumno("222W", "Wendy"),
                new Alumno("333E", "Elena"),
                new Alumno("444R", "Raúl"),
                new Alumno("444R", "Raúl S."),
                new Alumno("010T", "Tania"),
                new Alumno("010T", "Tania P."),
                new Alumno("909X", "Xabi"),
                new Alumno("909X", "Xabier"),
                new Alumno("606J", "Juan"),
                new Alumno("707L", "Lola"),
                new Alumno("707L", "Lola Martínez")

        );

        Actividad actividad = new Actividad();
        actividad.procesar(alumnosEntrada);
    }
}
