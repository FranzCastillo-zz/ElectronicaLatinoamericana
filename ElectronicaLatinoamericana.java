import Productos.*;
import java.util.ArrayList;

public class ElectronicaLatinoamericana {
    private ArrayList<Producto> productos;
    private Carrito carrito;
    private Vista v;

    public ElectronicaLatinoamericana(){
        productos = new ArrayList<>();
        carrito = new Carrito();
        v = new Vista();
    }
    public void ejecutar(){
        productos.add(new Productos.Dispositivos.Smartphone("iPhone", "Apple", 1200, "11", "11/6/2021", "ARMSDMJD"));
        v.inicio();
        while(true){
            int opcion = v.mostarMenuPrincipal();
            switch(opcion){
                case 1: //CREAR UN PRODUCTO
                    /*Camara c = new Camara();
                    productos.add(c);
                    guardarProducto(c);*/
                break;
                case 2: //VER PRODUCTO
                    verProducto();
                break;
                case 3: //MOSTAR CARRITO DE COMPRA
                break;
                case 4: //SALIR
                    v.fin();
                    System.exit(1);
                break;
                default:
                    v.mostrarOpcionInvalida();
                break;
            }
        }
    }
    private void verProducto(){
        boolean regresarMenuPrincipal = false;
        while(!regresarMenuPrincipal){
            Producto productoActual = v.seleccionarProducto(productos); //DEVUELVE NULL SI EL USUARIO DESEA SALIR
            if(productoActual == null){
                regresarMenuPrincipal = true; //TERMINARIA EL CICLO DE LA FUNCION AL NO CUMPLIR CON EL WHILE
            }else{
                boolean regresarSeleccionDeProducto = false;
                while(!regresarSeleccionDeProducto){
                    int opcionProducto = v.mostrarMenuVerProducto();
                    switch(opcionProducto){
                        case 1: // PROBAR
                            productoActual.probar();
                        break;
                        case 2: // AGREGAR AL CARRITO
                            carrito.agregarAlCarrito(productoActual);
                            v.mostrarAgregadoAlCarrito(productoActual);
                        break;
                        case 3: // REGRESAR A SELECCIONAR PRODUCTO
                            regresarSeleccionDeProducto = true;
                        break;
                        default:
                            v.mostrarOpcionInvalida();
                        break;
                    }
                }
            }
        }
    }
    private void guardarProducto(Producto producto){ //GUARDAR EN EL ARCHIVO

    }
}
