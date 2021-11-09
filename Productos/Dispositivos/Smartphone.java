package Productos.Dispositivos;

import Productos.*;
import Productos.Interfaces.*;

public class Smartphone extends Producto implements HacerLlamadas, TomarFoto, NavegarInternet, ReproducirVideo, Portable {
    public Smartphone(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Smartphone", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Reproduccion de videos");
        this.agregarFuncionalidad("Navegar por Internet");
        this.agregarFuncionalidad("Tomar Fotografias");
        this.agregarFuncionalidad("Realizar Llamadas");
    }
    public String portable() {
        return "Es tan delgado que cabe en tu bolsillo!";
    }
    public String reproducir() {
        return "*reproduciendo el video capturado con mi Smartphone " + this.getNombre() + "*\nTiene una pantalla HERMOSA";
    }
    public String navegar(String link) {
        return "Ok... *entrando a " + link + " desde mi Smartphone " + this.getNombre();
    }
    public String tomarFoto() {
        return "Say CHEESE :D *le toma la foto con el smartphone " + this.getNombre() + "* SE VE GENIAL!";
    }
    public String llamar(int numero) {
        String llamada = "*llamando al numero + " + numero + " con mi smartphone " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
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
            case "llamar":
                return this.llamar(Integer.parseInt(destino));
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
        return true;
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
