package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Laptop extends Producto implements NavegarInternet, EjecutarVideojuego, ReproducirVideo, Portable{
    public Laptop(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Laptop", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Ejecutar videojuegos");
        this.agregarFuncionalidad("Navegar por Internet");
        this.agregarFuncionalidad("Reproducir videos");
        this.agregarFuncionalidad("Portabilidad");
    }
    public String portable() {
        return "La laptop " + this.getNombre() + " es portatil! Cabe perfectamente en el estuche incluido :). *la guarda*";
    }
    public String reproducir() {
        return "*reproduciendo video desde mi Laptop " + this.getNombre() + "* PERO VEAN ESA CALIDAD!";
    }
    public String ejecutar(String juego) {
        String jugar = "Espero pueda jugar " + juego + " a 60 FPS...\n";
        jugar += "*ejecutando " + juego + " desde mi Laptop " + this.getNombre() + "*\n";
        jugar += "El juego se ejecuta perfectamente!"; 
        return jugar;
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
            case "portabilidad":
                return this.portable();
            default:
                return "Algo salio mal al intentar probar el la Laptop. Intente de nuevo"; 
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
        return true;
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
    public int compareTo(Producto o) {
        if(this.getPrecio() > o.getPrecio()){
            return 1;
        }else if(this.getPrecio() < o.getPrecio()){
            return -1;
        }else{
            return 0;
        }
    }
}
