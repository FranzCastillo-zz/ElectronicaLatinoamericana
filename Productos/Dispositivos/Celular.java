/* Nombre: Celular.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Celular extends Producto implements HacerLlamadas, Portable{
    public Celular(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Celular", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Realizar Llamadas");
    }
    public String portable() {
        return "El celular " + this.getNombre() + " es portatil! Cabe perfectamente en la bolsa de tu pantalon :). *lo guarda*";
    }
    public String llamar(int numero) {
        String llamada = "*llamando al numero " + numero + " con mi celular " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
    }
    public String probar(String funcion, String destino) {
        switch(funcion){
            case "portabilidad":
                return this.portable();
            case "llamar":
                return this.llamar(Integer.parseInt(destino));
            default:
                return "Algo salio mal al intentar usar el celular. Prueba de nuevo";
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
        return false;
    }
    @Override
    public boolean reproduceVideos() {
        // TODO Auto-generated method stub
        return false;
    }
    @Override
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
