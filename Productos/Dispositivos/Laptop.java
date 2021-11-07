package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Laptop extends Producto implements NavegarInternet, EjecutarVideojuego, ReproducirVideo, Portable{
    public Laptop(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Laptop", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String portable() {
        return null;
    }
    public String reproducir() {
        return null;
    }
    public String ejecutar(String juego) {
        return null;
    }
    public String navegar(String link) {
        return null;
    }
    public String[] getFuncionalidades() {
        String[] funcionalidades = {"Ejecutar Videojuegos", "Navegar por Internet", "Reproduccion de video", "Portabilidad"};
        return funcionalidades;
    }
    public String probar(int funcion) {
        return null;
    }
}
