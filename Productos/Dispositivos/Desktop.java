package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Desktop extends Producto implements NavegarInternet, ReproducirVideo, EjecutarVideojuego{
    public Desktop(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Computadora de escritorio", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String ejecutar(String juego) {
        String jugar = "Espero pueda jugar " + juego + " a 60 FPS...\n";
        jugar += "*ejecutando " + juego + " desde mi Desktop " + this.getNombre() + "*\n";
        jugar += "El juego se ejecuta perfectamente!"; 
        return jugar;
    }
    public String reproducir() {
        String video = "*reproduciendo video desde mi Desktop " + this.getNombre() + "* PERO VEAN ESA CALIDAD!";
        return video;
    }
    public String navegar(String link) {
        String navegar = "Ok... *entrando a " + link + " desde mi Desktop " + this.getNombre();
        return navegar;
    }
    /*public String[] getFuncionalidades() {
        String[] funcionalidades = {"Ejecutar Videojuegos", "Navegar por Internet", "Reproduccion de video"};
        return funcionalidades;
    }*/
    public String probar(int funcion) {
        switch(funcion){
            case 1:
                //return this.ejecutar();
            case 2:
                //return this.navegar();
            case 3:
                return this.reproducir();
            default:
                return "Algo salio mal al intentar probar el Desktop. Intente de nuevo";
        }    }
}
