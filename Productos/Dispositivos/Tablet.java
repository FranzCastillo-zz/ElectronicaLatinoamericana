package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Tablet extends Producto implements TomarFoto, NavegarInternet, ReproducirVideo, Portable{
    public Tablet(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Tablet", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Reproduccion de Videos");
        this.agregarFuncionalidad("Navegacion por Internet");
        this.agregarFuncionalidad("Toma de Fotografias");
    }
    public String portable() {
        return "Es muy delgado! Es bastante portatil";
    }
    public String reproducir() {
        return "*reproduciendo el video capturado con mi Tablet " + this.getNombre() + "*\nTiene una pantalla HERMOSA";
    }
    public String navegar(String link) {
        return "Ok... *entrando a " + link + " desde mi Tablet " + this.getNombre();
    }
    public String tomarFoto() {
        return "Say CHEESE :D *le toma la foto con la Tablet " + this.getNombre() + "* SE VE GENIAL!";
    }

    public String probar(String funcion, String destino) {
        switch(funcion){
            case "portabilidad":
                return this.portable();
            case "reproducirVideo":
                return this.reproducir();
            case "navegarInternet":
                return this.navegar(destino);
            case "tomarFoto":
                return this.tomarFoto();
            default:
                return "Algo salio mal al intentar usar el telefono. Pruebe de nuevo.";
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
        return true;
    }
    @Override
    public boolean tomaFotos() {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public boolean reproduceVideos() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
