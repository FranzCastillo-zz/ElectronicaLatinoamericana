package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class TelefonoFijo extends Producto implements HacerLlamadas{
    public TelefonoFijo(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Telefono", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String llamar(int numero) {
        return null;
    }
    /*public String[] getFuncionalidades() {
        String[] funcionalidades = {"Realizar llamadas"};
        return funcionalidades;
    }*/
    public String probar(int funciones) {
        return null;
    }
}
