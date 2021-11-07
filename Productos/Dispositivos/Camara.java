package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Camara extends Producto implements TomarFoto, ReproducirVideo, Portable{
    public Camara(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Camara", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String portable() {
        return null;
    }
    public String reproducir() {
        return null;
    }
    public String tomarFoto() {
        return null;
    }
    public String[] getFuncionalidades() {
        String[] funcionalidades = {"Portabilidad", "Reproduccion de Videos", "Toma de Fotografias"};
        return funcionalidades;
    }
    public String probar(int funcion) {
        return null;
    }
}
