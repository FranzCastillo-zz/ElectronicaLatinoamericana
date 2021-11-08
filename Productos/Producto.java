/*

    Francisco Castillo 21562 y Fernanda Esquivel 21548
    Producto.java
    Clase madre que modela todos los productos.

*/

package Productos;

import java.util.ArrayList;

public abstract class Producto {
    private String nombre;
    private String marca;
    private int precio;
    private String serie;
    private String fechaDeFabrticacion;
    private String marcadorAR;
    private String tipo;
    private ArrayList<String> funcionalidades;

    public Producto(String tipo, String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        this.tipo = tipo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.serie = serie;
        this.fechaDeFabrticacion = fechaDeFabricacion;
        this.marcadorAR = marcadorAR;

    }
    
    /** 
     * @return String El nombre del producto
     */
    protected String getNombre(){
        return this.nombre;
    }
    
    /** 
     * @return String La marca del producto
     */
    protected String getMarca(){
        return this.marca;
    }
    
    /** 
     * @return int El precio del producto
     */
    protected int getPrecio(){
        return this.precio;
    }
    
    /** 
     * @return String La serie del producto
     */
    protected String getSerie(){
        return this.serie;
    }
    
    /** 
     * @return String La fecha de fabricacion del producto
     */
    protected String getFechaDeFabricacion(){
        return this.fechaDeFabrticacion;
    }
    
    /** 
     * @return String El Marcador AR del producto
     */
    protected String getMarcadorAR(){
        return this.marcadorAR;
    }
    
    /** 
     * @return String Los detalles enteros del producto.
     */
    public String getDetalles(){
        String detalles = "";
        detalles += "Nombre: " + this.nombre + "\tMarca: " + this.marca + "\n";
        detalles += "Precio: Q." + this.precio + "\n";
        detalles += "Marcador AR: " + this.marcadorAR + "\tSerie: " + this.serie + "\n";
        detalles += "Fabricado el: " + this.fechaDeFabrticacion;
        return detalles;
    }
    
    /** 
     * @return String El resumen del producto para mostrar en la opcion de seleccionar producto
     */
    public String getResumen(){
        String resumen = "";
        resumen = this.tipo + " || " + this.nombre + " || " + this.marca + " || Q." + this.precio;
        return resumen;
    }

    protected void agregarFuncionalidad(String funcionalidad){
        this.funcionalidades.add(funcionalidad);
    }

    public abstract String probar(int funcion);
    public ArrayList<String> getFuncionalidades(){
        /*

        Portabilidad
        Reproduccion de Videos
        Toma de Fotografias
        Realizar Llamadas

        */
        return this.funcionalidades;
    }
}
