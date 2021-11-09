import Productos.Producto;
import java.util.ArrayList;
import java.util.Collections;

public class Carrito{
    private ArrayList<Producto> productos;

    public Carrito(){
        productos = new ArrayList<>();
    }
    /** 
     * @return Arraylist<Producto> Los productos que se encuentran actualmente en el carrito
     */
    public ArrayList<Producto> getProductos(){
        Collections.sort(productos);
        return this.productos;
    }
    
    /** 
     * @param nombreCliente El nombre del cliente a colocar en la factura (PUEDE SER C/F)
     * @param nit El NIT para la factura (PUEDE SER C/F)
     * @return String La factura
     */
    public String finalizarCompra(String nombreCliente, String nit){
        String factura = "";

        return factura;
    }
    
    /** 
     * @param producto El producto que se agregara al carrito
     */
    public void agregarAlCarrito(Producto producto){
        productos.add(producto);
    }
}