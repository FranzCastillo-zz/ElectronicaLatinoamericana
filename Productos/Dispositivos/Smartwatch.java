/* Nombre: Smartwatch.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

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
    
    /** 
     * @param numero Numeor al que se llamara
     * @return String Resultado de probar realizar la llamada
     */
    public String llamar(int numero) {
        String llamada = "*llamando al numero + " + numero + " con mi Smart Watch " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
    }
    
    /** 
     * @return String Resultado de probar su portabilidad
     */
    public String portable() {
        return "Como no va a ser portatil? Es un reloj de munieca, no de pared. (Obviamente es portatil)";
    }
    
    /** 
     * @return String El resultado de tomar una foto
     */
    public String tomarFoto() {
        return "Say CHEESE :D *le toma la foto con el Smart Watch " + this.getNombre() + "* SE VE GENIAL!";
    }
    
    /** 
     * @param funcion La funcionalidad que desea probar
     * @param destino El destino de la funcion
     * @return String  El resultado de probar la funcionalidad
     */
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
        return true;
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
     * @return int EL resultado de la comparacion
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
