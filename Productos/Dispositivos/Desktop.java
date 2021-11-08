package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Desktop extends Producto implements NavegarInternet, ReproducirVideo, EjecutarVideojuego{
    public Desktop(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Computadora de escritorio", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Ejecutar Videojuegos");
        this.agregarFuncionalidad("Navegar por Internet");
        this.agregarFuncionalidad("Reproducir videos");
    }
    public String ejecutar(String juego) {
        String jugar = "Espero pueda jugar " + juego + " a 60 FPS...\n";
        jugar += "*ejecutando " + juego + " desde mi Desktop " + this.getNombre() + "*\n";
        jugar += "El juego se ejecuta perfectamente!"; 
        return jugar;
    }
    public String reproducir() {
        return "*reproduciendo video desde mi Desktop " + this.getNombre() + "* PERO VEAN ESA CALIDAD!";
    }
    public String navegar(String link) {
        return "Ok... *entrando a " + link + " desde mi Desktop " + this.getNombre();
    }
    public String probar(String funcion, String destino) {
        switch(funcion){
            case "ejecutarVideojuego":
                return this.ejecutar(destino);
            case "navegarInternet":
                return this.navegar(destino);
            case "reproducirVideo":
                return this.reproducir();
            default:
                return "Algo salio mal al intentar probar el Desktop. Intente de nuevo";
        }    
    }
    @Override
    public boolean ejecutaVidejouegos() {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public boolean haceLlamadas() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean navegaInternet() {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public boolean esPortatil() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean tomaFotos() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
    public boolean reproduceVideos() {
        // TODO Auto-generated method stub
        return true;
    }
}
