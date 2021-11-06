package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class TelefonoFijo extends Producto implements HacerLlamadas{
    public TelefonoFijo(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super(nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String llamar(int numero) {
        return null;
    }
    public String probar() {
        return null;
    }
    
}
