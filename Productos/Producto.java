package Productos;

public abstract class Producto {
    private String nombre;
    private String marca;
    private int precio;
    private String serie;
    private String fechaDeFabrticacion;
    private String marcadorAR;

    public Producto(String nombre, String marca, int precio, String serie, String fechaDeFabricacion, String marcadorAR){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.serie = serie;
        this.fechaDeFabrticacion = fechaDeFabricacion;
        this.marcadorAR = marcadorAR;
    }
    public abstract String probar();
}
