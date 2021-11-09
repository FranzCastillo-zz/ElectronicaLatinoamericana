package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class SmartTV extends Producto implements NavegarInternet, ReproducirVideo{
    public SmartTV(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Smart TV", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Reproduccion de videos");
        this.agregarFuncionalidad("NAvegacion por Internet");
    }
    public String reproducir() {
        return "*reproduciendo el video en mi Smart TV " + this.getNombre() + "*\nTiene una pantalla HERMOSA";
    }
    public String navegar(String link) {
        return "Ok... *entrando a " + link + " desde mi Smart TV " + this.getNombre();
    }
    public String probar(String funcion, String destino) {
        switch(funcion){
            case "reproducirVideo":
                return this.reproducir();
            case "navegarInternet":
                return this.navegar(destino);
            default:
                return "Algo salio mal probando la Smart TV. Pruebe de nuevo.";
        }
    }
    @Override
    public boolean ejecutaVidejouegos() {
        // TODO Auto-generated method stub
        return false;
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
