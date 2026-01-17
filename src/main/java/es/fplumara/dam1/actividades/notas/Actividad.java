package es.fplumara.dam1.actividades.notas;

import java.util.*;

public class Actividad {

    public void parteA_MapList(List<String> registros) {
        Map<String,List<Double>> registrosMap = new TreeMap<>();
        for (String registro : registros){
            String[] arrayRegistros = registro.split(";");
            String dni = arrayRegistros[0];
            double nota = Double.parseDouble(arrayRegistros[2]);
            if (registrosMap.containsKey(dni)){
                registrosMap.get(dni).add(nota);
            }else{
                registrosMap.put(dni,new ArrayList<>(List.of(nota)));
            }
        }
        Map<String, Double> alumnosMedia = new TreeMap<>();
        for (Map.Entry<String, List<Double>> registro : registrosMap.entrySet()){
            alumnosMedia.put(registro.getKey(),registro.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0));
        }
        for (Map.Entry<String, Double> entry : alumnosMedia.entrySet()){
            System.out.printf("\n - " + entry.getKey() + " -> %.2f",entry.getValue());
        }
        double mayorMedia = 0;
        String mejorAlumno = "";
        for (Map.Entry<String, Double> alumno : alumnosMedia.entrySet()){
            if(mayorMedia < alumno.getValue()){
                mayorMedia = alumno.getValue();
                mejorAlumno = alumno.getKey();
            }
        }
        System.out.printf("\nEl alumno con mejor media es %s con una media de %.2f", mejorAlumno, mayorMedia);
    }

    public void parteB_MapMap_MaxPorAsignatura(List<String> registros) {
        Map<String, Map<String, Double>> registroPorAsignatura = new TreeMap<>();
        for (String registro : registros){
            String[] arrayRegistros = registro.split(";");
            String dni = arrayRegistros[0];
            String asignatura = arrayRegistros[1];
            double nota = Double.parseDouble(arrayRegistros[2]);
            if (registroPorAsignatura.containsKey(dni) && registroPorAsignatura.get(dni).containsKey(asignatura)){
                if(registroPorAsignatura.get(dni).get(asignatura) < nota){
                    registroPorAsignatura.get(dni).put(asignatura, nota);
                }
            }else if (registroPorAsignatura.containsKey(dni)){
                registroPorAsignatura.get(dni).put(asignatura, nota);
            }else {
                registroPorAsignatura.put(dni, new TreeMap<>());
                registroPorAsignatura.get(dni).put(asignatura, nota);
            }
        }

        Map<String, Double> alumnosMedia = new TreeMap<>();
        for (Map.Entry<String, Map<String, Double>> alumno : registroPorAsignatura.entrySet()){
            List<Double> media = new ArrayList<>();
            for(Map.Entry<String, Double> asignatura : alumno.getValue().entrySet()){
                media.add(asignatura.getValue());
            }
            double mediaAlumno = media.stream().mapToDouble(Double::doubleValue).average().orElse(0);
            alumnosMedia.put(alumno.getKey(), mediaAlumno);
        }
        for (Map.Entry<String, Double> entry : alumnosMedia.entrySet()) {
            System.out.printf("\n - " + entry.getKey() + " -> %.2f",entry.getValue());
        }
        double mayorMedia = 0;
        String mejorAlumno = "";
        for (Map.Entry<String, Double> alumno : alumnosMedia.entrySet()){
            if(mayorMedia < alumno.getValue()){
                mayorMedia = alumno.getValue();
                mejorAlumno = alumno.getKey();
            }
        }
        System.out.printf("\nEl alumno con mejor media es %s con una media de %.2f", mejorAlumno, mayorMedia);
    }
}