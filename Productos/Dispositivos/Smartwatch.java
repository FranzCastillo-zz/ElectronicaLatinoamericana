package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Smartwatch extends Producto implements TomarFoto, Portable, HacerLlamadas{
    public Smartwatch(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Smartwatch", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Toma de Fotografias");
        this.agregarFuncionalidad("Realizacion de Llamadas");
    }
    public String llamar(int numero) {
        String llamada = "*llamando al numero + " + numero + " con mi Smart Watch " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
    }
    public String portable() {
        return "Como no va a ser portatil? Es un reloj de munieca, no de pared. (Obviamente es portatil)";
    }
    public String tomarFoto() {
        return "Say CHEESE :D *le toma la foto con el Smart Watch " + this.getNombre() + "* SE VE GENIAL!";
    }
    public String probar(String funcion, String destino) {
        switch(funcion){
            case "llamar":
                return this.llamar(Integer.parseInt(destino));
            case "tomarFoto":
                return this.tomarFoto();
            case "portabilidad":
                return this.portable();
            default:
                return "Algo salio mal probando el Smart Watch. Pruebe de nuevo.";
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
        return false;
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
        return false;
    }
    
}
