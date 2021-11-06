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
     * @return String
     */
    public String getDireccion(){
        return this.direccion;
    }
    
    /** 
     * @return int
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /** 
     * @return String
     */
    public String getPais(){
        return this.pais;
    }
    
    /** 
     * @return String
     */
    public String getCiudad(){
        return this.ciudad;
    }
    
    /** 
     * @return String
     */
    public String getNombreSucursal(){
        return this.nombreSucursal;
    }
}
