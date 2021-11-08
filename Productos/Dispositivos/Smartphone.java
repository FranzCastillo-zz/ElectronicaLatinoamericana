package Productos.Dispositivos;

import Productos.*;
import Productos.Interfaces.*;

public class Smartphone extends Producto implements HacerLlamadas, TomarFoto, NavegarInternet, ReproducirVideo, Portable {
    public Smartphone(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Smartphone", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String portable() {
        return null;
    }
    public String reproducir() {
        return null;
    }
    public String navegar(String link) {
        return null;
    }
    public String tomarFoto() {
        return null;
    }
    public String llamar(int numero) {
        return null;
    }
    /*public String[] getFuncionalidades() {
        String[] funcionalidades = {"Realizar llamadas", "Navegar por Internet", "Reproduccion de video", "Portabilidad", "Toma de fotografias"};
        return funcionalidades;
    }*/
    public String probar(int funcion) {
        return null;
    }
    
}
