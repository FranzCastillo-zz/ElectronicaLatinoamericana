/* Nombre: Desktop.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

package Productos.Dispositivos;

import Productos.Producto;
import Productos.Interfaces.*;

public class Desktop extends Producto implements NavegarInternet, ReproducirVideo, EjecutarVideojuego{
    public Desktop(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Computadora de escritorio", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Ejecutar Videojuegos");
        this.agregarFuncionalidad("Navegar por Internet");
        this.agregarFuncionalidad("Reproducir videos");
    }
    
    /** 
     * @param juego el titulo del juego que desea probar
     * @return String el resultado de probar ejecutar el videojuego
     */
    public String ejecutar(String juego) {
        String jugar = "Espero pueda jugar " + juego + " a 60 FPS...\n";
        jugar += "*ejecutando " + juego + " desde mi Desktop " + this.getNombre() + "*\n";
        jugar += "El juego se ejecuta perfectamente!"; 
        return jugar;
    }
    
    /** 
     * @return String el resultado de probar la reproduccion de video
     */
    public String reproducir() {
        return "*reproduciendo video desde mi Desktop " + this.getNombre() + "* PERO VEAN ESA CALIDAD!";
    }
    
    /** 
     * @param link el link hacia el que se desea navegar
     * @return String el resultado de probar la navegacion por internet
     */
    public String navegar(String link) {
        return "Ok... *entrando a " + link + " desde mi Desktop " + this.getNombre();
    }
    
    /** 
     * @param funcion la funcionalidad que se desea probar
     * @param destino el destino de la accion a probar
     * @return String el resultado de probar la funcionalidad
     */
    public String probar(String funcion, String destino) {
        switch(funcion){
            case "ejecutarVideojuego":
                return this.ejecutar(destino);
            case "navegarInternet":
                return this.navegar(destino);
            case "reproducirVideo":
                return this.reproducir();
            default:
                return "Algo salio mal al intentar probar el Desktop. Intente de nuevo";
        }    
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean ejecutaVidejouegos() {
        // TODO Auto-generated method stub
        return true;
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
     * @param o objeto con el que se comparara
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
