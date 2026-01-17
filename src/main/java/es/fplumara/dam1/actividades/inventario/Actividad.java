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
            if ((cantidad + cantidadActual) >= 0){
                movimientosMap.put(elemento, cantidad + cantidadActual);
            }else{
                System.out.printf("AVISO: stock insuficiente de %s\n", elemento);
                movimientosMap.put(elemento, 0);
            }
        }
        for (Map.Entry<String, Integer> entry : movimientosMap.entrySet()) {
            System.out.println(" - " + entry.getKey() + " -> " + entry.getValue());
        }
        int mayor = 0;
        String masStock = "";
        for (Map.Entry<String, Integer> entry : movimientosMap.entrySet()){
            if (mayor > entry.getValue()){
                continue;
            }else{
                mayor = entry.getValue();
            }
            masStock = entry.getKey();
        }
        System.out.printf("El producto con más stock es: %s", masStock);
    }
}
