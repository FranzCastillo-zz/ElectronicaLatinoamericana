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
        String esPortatil = "La camara + " + this.getNombre() + " es portatil! Cabe perfectamente en el estuche incluido :). *la guarda*";
        return esPortatil;
    }
    public String reproducir() {
        String video = "*reproduciendo video capturado con mi camara " + this.getNombre() + "* PERO VEAN ESA CALIDAD!";
        return video;
    }
    public String tomarFoto() {
        String foto = "Say CHEESE :D *le toma la foto con la " + this.getNombre() + "* SE VE GENIAL!";
        return foto;
    }
    public String probar(int funcion) { //EL ORDEN ES DETERMINADO POR getFuncionalidades
        switch(funcion){
            case 1:
                return this.portable();
            case 2:
                return this.reproducir();
            case 3:
                return this.tomarFoto();
            default:
                return "Algo salio mal al intentar probar la camara. Intente de nuevo";
        }
    }
}
