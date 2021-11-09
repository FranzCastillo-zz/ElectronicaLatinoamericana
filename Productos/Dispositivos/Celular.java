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
    
    /** 
     * @return String El resultado de probar la portabilidad
     */
    public String portable() {
        return "El celular " + this.getNombre() + " es portatil! Cabe perfectamente en la bolsa de tu pantalon :). *lo guarda*";
    }
    
    /** 
     * @param numero el numero al que se desea llamar
     * @return String El resultado de probar realizar una llamada
     */
    public String llamar(int numero) {
        String llamada = "*llamando al numero " + numero + " con mi celular " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
    }
    
    /** 
     * @param funcion la funcionalidad que se desea probar
     * @param destino el destino de la realizacion de la accion
     * @return String el resultado de probar la funcionalidad
     */
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
        return true;
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
     * @param o el objeto con el que se comparara
     * @return int el resultado de la comparacion
     */
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
