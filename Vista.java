import Productos.Producto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Vista {
    private Scanner scan;
    public Vista(){
        scan = new Scanner(System.in);
    }
    private void prnt(String texto){
        System.out.println(texto);
    }
    public void inicio(){
        prnt("Bienvenido a Electronica latinoamericana! Donde tenemos a la venta sus electronicos favoritos y prestamos el servicio se realidad aumentada\n\n");
    }
    public void fin(){
        prnt("Gracias por visitar Electronica Latinoamericana. Vuelva Pronto!");
    }
    public void mostrarOpcionInvalida(){
        prnt("Ha ingresado una opcion invalida. Por favor, pruebe de nuevo");
    }
    public int mostarMenuPrincipal(){
        prnt("MENU PRINCIPAL:");
        prnt("Que desea hacer?\n");
        prnt("1. Crear un producto");
        prnt("2. Ver producto");
        prnt("3. Mostrar Carrito de Compras");
        prnt("4. Salir");
        try{
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        }catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
            scan.next();
            return -1;
        }
    }
    public Producto seleccionarProducto(ArrayList<Producto> productos){
        if(!productos.isEmpty() && productos != null){
            prnt("--------------------------------------------------------");
            prnt("Los productos que tenemos disponibles son:\n");
            int i = 1; // lleva la cuenta de la posicion del producto (Va 1 adelante de la verdadera posicion en en Arraylist)
            for (Producto producto : productos) {
                prnt(i++ + ") " + producto.getResumen());
            }
            prnt("--------------------------------------------------------");
            while(true){
                prnt("\nQue producto desea ver? (Ingrese una opcion entre 1 y " + (i - 1) + " o escriba 'salir' para regresar al menu principal)");
                String ingreso = scan.nextLine().toUpperCase();
                try{
                    int opcion = Integer.parseInt(ingreso) - 1;
                    if(opcion >= 0 && opcion <= (i - 1)){
                        return productos.get(opcion);
                    }else{ // SI NO ESTA EN EL RANGO
                        mostrarOpcionInvalida();
                    }
                }catch(Exception e){ // SI INGRESO ALGO QUE NO ES UN NUMERO
                    if(ingreso.equals("SALIR")){
                        return null;
                    }
                    mostrarOpcionInvalida();
                }
            }
    
        }else{ //EN CASO DE QUE PRODUCTOS NO TENGA NADA O SEA NULL
            prnt("No hay productos para mostrar.");
            return null;
        }
    }
    public int mostrarMenuVerProducto(){
        prnt("\nQue desea hacer con el producto?");
        prnt("1. Probar");
        prnt("2. Agregar al carrito");
        prnt("3. Regresar a seleccion de producto");
        try{
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        }catch(Exception e){
            scan.next();
            return -1;
        }
    }
    public void mostrarAgregadoAlCarrito(Producto producto){
        prnt("Se ha agregado exitosamente al carrito:");
        prnt("\t- " + producto.getResumen());
    }
    public int mostrarMenuProbarProducto(Producto producto){
        prnt(producto.getDetalles());
        prnt("-----------------------------------------------------------");
        prnt("Este producto cuenta con las siguientes funcionalidades: ");
        // CONVIERTE EL ARRAY DE FUNCIONALIDADES DE LOS PRODUCTOS EN UN ARRAYLIST
        ArrayList<String> funcionalidades = new ArrayList<>(producto.getFuncionalidades());
        int i = 1; // LLEVA EL NUMERO DE LA FUNCION
        for (String funcion : funcionalidades) {
            prnt(i++ + ") " + funcion);
        }
        prnt("-----------------------------------------------------------");
        while(true){
            prnt("\nQue funcionalidad desea probar? (Ingrese una opcion entre 1 y " + (i - 1) + " o escriba 'salir' para regresar a la seleccion de productos)");
            String ingreso = scan.nextLine().toUpperCase();
            try{
                int opcion = Integer.parseInt(ingreso) - 1;
                if(opcion >= 0 && opcion <= (i - 1)){
                    return opcion;
                }else{ // SI NO ESTA EN EL RANGO
                    mostrarOpcionInvalida();
                }
            }catch(Exception e){ // SI INGRESO ALGO QUE NO ES UN NUMERO
                if(ingreso.equals("SALIR")){
                    return -1;
                }
                mostrarOpcionInvalida();
            }
        }
    }
    public void mostrarPrueba(String resultadoFuncion){
        prnt(resultadoFuncion);
    }
}
