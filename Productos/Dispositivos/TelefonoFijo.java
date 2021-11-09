/* Nombre: TelefonoFijo.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class TelefonoFijo extends Producto implements HacerLlamadas{
    public TelefonoFijo(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Telefono", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Realizacion de Llamadas");
    }
    
    /** 
     * @param numero El numero al que se llamara
     * @return String El resultado de probar la llamada
     */
    public String llamar(int numero) {
        String llamada = "*llamando al numero " + numero + " con mi telefono fijo " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
    }
    
    /** 
     * @param funciones La funcion que se desea probar
     * @param destino El receptor de la accion (Numero de telefono para llamadas, link para Navegar Internet, etc)
     * @return String el efecto de probar la accion
     */
    public String probar(String funciones, String destino) {
        if(funciones.equals("llamar")){
            return this.llamar(Integer.parseInt(destino));
        }else{
            return "Algo salio mal probando el Telefono Fijo";
        }
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean ejecutaVidejouegos() {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean haceLlamadas() {
        // TODO Auto-generated method stub
        return true;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean navegaInternet() {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean esPortatil() {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean tomaFotos() {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean reproduceVideos() {
        // TODO Auto-generated method stub
        return false;
    }
    
    /** 
     * @param o El producto con el que se comparara
     * @return int el resultado de la comparacion
     */
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
