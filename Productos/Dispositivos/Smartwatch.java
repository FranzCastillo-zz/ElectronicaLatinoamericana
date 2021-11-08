package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Smartwatch extends Producto implements TomarFoto, Portable, HacerLlamadas{
    public Smartwatch(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Smartwatch", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String llamar(int numero) {
        return null;
    }
    public String portable() {
        return null;
    }
    public String tomarFoto() {
        return null;
    }
    /*public String[] getFuncionalidades() {
        String[] funcionalidades = {"Toma de fotografias", "Portabilidad", "Realizar llamadas"};
        return funcionalidades;
    }*/
    public String probar(int funcion) {
        return null;
    }
    
}
