package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Laptop extends Producto implements NavegarInternet, EjecutarVideojuego, ReproducirVideo, Portable{
    public Laptop(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Laptop", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
    }
    public String portable() {
        String esPortatil = "La laptop + " + this.getNombre() + " es portatil! Cabe perfectamente en el estuche incluido :). *la guarda*";
        return esPortatil;
    }
    public String reproducir() {
        String video = "*reproduciendo video desde mi Laptop " + this.getNombre() + "* PERO VEAN ESA CALIDAD!";
        return video;
    }
    public String ejecutar(String juego) {
        String jugar = "Espero pueda jugar " + juego + " a 60 FPS...\n";
        jugar += "*ejecutando " + juego + " desde mi Laptop " + this.getNombre() + "*\n";
        jugar += "El juego se ejecuta perfectamente!"; 
        return jugar;
    }
    public String navegar(String link) {
        String navegar = "Ok... *entrando a " + link + " desde mi Desktop " + this.getNombre();
        return navegar;
    }
    /*public String[] getFuncionalidades() {
        String[] funcionalidades = {"Ejecutar Videojuegos", "Navegar por Internet", "Reproduccion de video", "Portabilidad"};
        return funcionalidades;
    }*/
    public String probar(int funcion) {
        return null;
    }
}
