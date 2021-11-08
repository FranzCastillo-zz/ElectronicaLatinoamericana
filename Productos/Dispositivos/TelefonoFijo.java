package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class TelefonoFijo extends Producto implements HacerLlamadas{
    public TelefonoFijo(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Telefono", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Realizacion de Llamadas");
    }
    public String llamar(int numero) {
        String llamada = "*llamando al numero + " + numero + " con mi telefono fijo " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
    }
    public String probar(String funciones, String destino) {
        if(funciones.equals("llamar")){
            return this.llamar(Integer.parseInt(destino));
        }else{
            return "Algo salio mal probando el Telefono Fijo";
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
        return false;
    }
}
