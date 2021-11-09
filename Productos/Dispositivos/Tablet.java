/* Nombre: Tablet.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

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
    
    /** 
     * @return String El resultado de probar su portabilidad
     */
    public String portable() {
        return "Es muy delgado! Es bastante portatil";
    }
    
    /** 
     * @return String el resultado de reproducir un video
     */
    public String reproducir() {
        return "*reproduciendo el video capturado con mi Tablet " + this.getNombre() + "*\nTiene una pantalla HERMOSA";
    }
    
    /** 
     * @param link el link al que navegara en internet
     * @return String el resultado de navegar
     */
    public String navegar(String link) {
        return "Ok... *entrando a " + link + " desde mi Tablet " + this.getNombre();
    }
    
    /** 
     * @return String El resutlado de tomar una foto
     */
    public String tomarFoto() {
        return "Say CHEESE :D *le toma la foto con la Tablet " + this.getNombre() + "* SE VE GENIAL!";
    }

    
    /** 
     * @param funcion La fuincionalidad que se desea probar
     * @param destino el destino de la accion
     * @return String El resultado de realizar la accionm
     */
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
        return true;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean tomaFotos() {
        // TODO Auto-generated method stub
        return true;
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
     * @param o Objeto con el que se compara
     * @return int Resultado de la comparacion
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
