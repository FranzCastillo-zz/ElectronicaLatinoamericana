/* Nombre: Camara.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

package Productos.Dispositivos;
import Productos.Producto;
import Productos.Interfaces.*;

public class Camara extends Producto implements TomarFoto, ReproducirVideo, Portable{
    public Camara(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Camara", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Reproduccion de Videos");
        this.agregarFuncionalidad("Toma de Fotografias");
    }
    public String portable() {
        return "La camara " + this.getNombre() + " es portatil! Cabe perfectamente en el estuche incluido :). *la guarda*";
    }
    public String reproducir() {
        return "*reproduciendo video capturado con mi camara " + this.getNombre() + "* PERO VEAN ESA CALIDAD!";
    }
    public String tomarFoto() {
        return "Say CHEESE :D *le toma la foto con la camara " + this.getNombre() + "* SE VE GENIAL!";
    }
    public String probar(String funcion, String destino) { //EL ORDEN ES DETERMINADO POR getFuncionalidades
        switch(funcion){
            case "portabilidad":
                return this.portable();
            case "reproducirVideo":
                return this.reproducir();
            case "tomarFoto":
                return this.tomarFoto();
            default:
                return "Algo salio mal al intentar probar la camara. Intente de nuevo";
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
        return false;
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
        return true;
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
