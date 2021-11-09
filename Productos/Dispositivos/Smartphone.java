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
    
    /** 
     * @return String el resultado de probar la portabilidad
     */
    public String portable() {
        return "Es tan delgado que cabe en tu bolsillo!";
    }
    
    /** 
     * @return String el resultado de probar la reproduccion del video
     */
    public String reproducir() {
        return "*reproduciendo el video capturado con mi Smartphone " + this.getNombre() + "*\nTiene una pantalla HERMOSA";
    }
    
    /** 
     * @param link el link al que se desea navegar
     * @return String el resultado de probar la navegacion de internet
     */
    public String navegar(String link) {
        return "Ok... *entrando a " + link + " desde mi Smartphone " + this.getNombre();
    }
    
    /** 
     * @return String el resultado de probar tomar una fotografia
     */
    public String tomarFoto() {
        return "Say CHEESE :D *le toma la foto con el smartphone " + this.getNombre() + "* SE VE GENIAL!";
    }
    
    /** 
     * @param numero el numero al que se desea llamar
     * @return String el resultado de probar realizar una llamada
     */
    public String llamar(int numero) {
        String llamada = "*llamando al numero + " + numero + " con mi smartphone " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
    }
    
    /** 
     * @param funcion la funcionalidad que se desea probar
     * @param destino el destino de la accion
     * @return String el resultado de probar la funcionalidad
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
            case "llamar":
                return this.llamar(Integer.parseInt(destino));
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
        return true;
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
     * @param o el objeto  con el que se compara
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
