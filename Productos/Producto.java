/* Nombre: Producto.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

package Productos;

import java.util.ArrayList;

public abstract class Producto implements Comparable<Producto> {
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
        this.funcionalidades = new ArrayList<>();
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
    public int getPrecio(){
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

    
    /** 
     * @param funcionalidad Se agrega a las funcionalidades del producto
     */
    protected void agregarFuncionalidad(String funcionalidad){
        this.funcionalidades.add(funcionalidad);
    }

    
    /** 
     * @param funcion La funcion que se desea probar
     * @return String El resultado de la accion de probar
     */
    public abstract String probar(String funcion, String destino);
    
    /** 
     * @return ArrayList<String> Las funcionalidades con las que cuenta el producto
     */
    public ArrayList<String> getFuncionalidades(){
        return this.funcionalidades;
    }
    public abstract boolean ejecutaVidejouegos();
    public abstract boolean haceLlamadas();
    public abstract boolean navegaInternet();
    public abstract boolean esPortatil();
    public abstract boolean tomaFotos();
    public abstract boolean reproduceVideos();
}
