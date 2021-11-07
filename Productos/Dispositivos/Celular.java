package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Celular extends Producto implements HacerLlamadas, Portable{
    public Celular(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Celular", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String portable() {
        return null;
    }
    public String llamar(int numero) {
        return null;
    }
    public String probar() {
        return null;
    }
}
