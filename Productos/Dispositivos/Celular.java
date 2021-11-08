package Productos.Dispositivos;

import java.util.ArrayList;

import Productos.Producto;
import Productos.Interfaces.*;

public class Celular extends Producto implements HacerLlamadas, Portable{
    public Celular(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        super("Celular", nombre, marca, precio, serie, fechaDeFabricacion, marcadorAR);
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Realizar Llamadas");
    }
    public String portable() {
        String esPortatil = "El celular + " + this.getNombre() + " es portatil! Cabe perfectamente en la bolsa de tu pantalon :). *lo guarda*";
        return esPortatil;
    }
    public String llamar(int numero) {
        String llamada = "*llamando al numero + " + numero + " con mi celular " + this.getNombre() + "*\n";
        llamada += "*El telefono al que intenta marcar no esta disponible en este momento*";
        return llamada;
    }
    /*public ArrayList<String> getFuncionalidades() {
        String[] funcionalidades = {"Portabilidad", "Realizar Llamadas"};
        return funcionalidades;
    }*/
    public String probar(int funcion) {
        switch(funcion){
            case 1:
                return this.portable();
            case 2:
                //return this.llamar(); //FALTA INGRESAR SU PARAMETRO
            default:
                return "Algo salio mal al intentar tomar la foto. Prueba de nuevo";
        }
    }
}
