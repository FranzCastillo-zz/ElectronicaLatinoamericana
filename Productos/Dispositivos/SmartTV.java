/* Nombre: SmartTV.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class SmartTV extends Producto implements NavegarInternet, ReproducirVideo{
    public SmartTV(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Smart TV", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Reproduccion de videos");
        this.agregarFuncionalidad("NAvegacion por Internet");
    }
    
    /** 
     * @return String el resultado de probar la reproduccion de video
     */
    public String reproducir() {
        return "*reproduciendo el video en mi Smart TV " + this.getNombre() + "*\nTiene una pantalla HERMOSA";
    }
    
    /** 
     * @param link el link objetivo para navegar
     * @return String el resultado de navegar
     */
    public String navegar(String link) {
        return "Ok... *entrando a " + link + " desde mi Smart TV " + this.getNombre();
    }
    
    /** 
     * @param funcion la funcionalidad que desea probar
     * @param destino el destino de la funcion
     * @return String el resultado de probar la funcionallidad
     */
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
        return false;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean navegaInternet() {
        // TODO Auto-generated method stub
        return true;
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
        return true;
    }
    
    /** 
     * @param o objeto con el que se compara
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
