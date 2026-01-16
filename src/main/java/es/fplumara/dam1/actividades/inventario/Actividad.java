package es.fplumara.dam1.actividades.inventario;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Actividad {

    public void procesarMovimientos(List<String> movimientos) {
        Map<String, Integer> movimientosMap = new TreeMap<>();
        for (String movimiento : movimientos) {
            String[] movimientoParts = movimiento.split(" ");
            String elemento = movimientoParts[0];
            Integer cantidad = Integer.parseInt(movimientoParts[1]);
            Integer cantidadActual = movimientosMap.getOrDefault(elemento, 0);
            movimientosMap.put(elemento, cantidad + cantidadActual);
        }
    }
}
