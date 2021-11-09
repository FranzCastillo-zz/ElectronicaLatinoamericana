/* Nombre: Sucursal.java
 * Programadores: Fernanda Esquivel y Francisco Castillo
 * Lenguaje: Java
 * Recursos: Visual Studio Code
 * Historial: Finalizado el 05.11.2021
              Modificado el 08.11.2021 */

public class Sucursal {
    private String direccion;
    private int codigo;
    private String pais;
    private String ciudad;
    private String nombreSucursal;

    public Sucursal(String direccion, int codigo, String pais, String ciudad, String nombreSucursal){
        this.direccion = direccion;
        this.codigo = codigo;
        this.pais = pais;
        this.ciudad = ciudad;
        this.nombreSucursal = nombreSucursal;
    }
    
    /** 
     * @return String La direccion de esta sucursal
     */
    public String getDireccion(){
        return this.direccion;
    }
    
    /** 
     * @return int el codigo de esta sucursal
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /** 
     * @return String el pais de ubicacion de esta sucursal
     */
    public String getPais(){
        return this.pais;
    }
    
    /** 
     * @return String la ciudad donde se encuentra esta sucursal
     */
    public String getCiudad(){
        return this.ciudad;
    }
    
    /** 
     * @return String el nombre de esta sucursal
     */
    public String getNombreSucursal(){
        return this.nombreSucursal;
    }
    
    /** 
     * @return String Los detalles de la sucursal (Nombre y direccion)
     */
    public String getDetalles(){
        return "Sucursal: " + this.getNombreSucursal() + " || Direccion: " + this.getDireccion();
    }
}
