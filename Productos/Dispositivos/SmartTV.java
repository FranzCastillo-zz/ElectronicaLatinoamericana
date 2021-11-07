package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class SmartTV extends Producto implements NavegarInternet, ReproducirVideo{
    public SmartTV(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Smart TV", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String reproducir() {
        return null;
    }
    public String navegar(String link) {
        return null;
    }
    public String probar() {
        return null;
    }
}
