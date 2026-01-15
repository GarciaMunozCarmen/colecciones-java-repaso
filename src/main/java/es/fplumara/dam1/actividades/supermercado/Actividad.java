package es.fplumara.dam1.actividades.supermercado;

import java.util.*;

public class Actividad {

    public void procesarEscaneos(List<String> escaneos) {
        escaneos = escaneos.stream().map(p -> p.trim().replace("  ", " ").toLowerCase()).toList();
        Set<String> escaneosSet= new TreeSet<>();
        for(String e:escaneos){
            if(escaneosSet.add(e)) {
                System.out.println("AÑADIDO: " + e);
            }else {
                System.out.println("REPETIDO: " + e);
            }
        }
        System.out.printf("Total escaneos: %d\nTotal repetidos: %d\nTotal productos distintos: %d\n", escaneos.size(), (escaneos.size() - escaneosSet.size()), escaneosSet.size());
        System.out.println("Listado final de productos:");
        escaneosSet.forEach(escaneo-> System.out.println("  - " + escaneo));

    }

}
