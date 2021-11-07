package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Desktop extends Producto implements NavegarInternet, ReproducirVideo, EjecutarVideojuego{
    public Desktop(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Computadora de escritorio", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String ejecutar(String juego) {
        return null;
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
