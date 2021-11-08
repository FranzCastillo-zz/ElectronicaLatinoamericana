import Productos.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;     
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class ElectronicaLatinoamericana {
    private ArrayList<Producto> productos;
    private Carrito carrito;
    private Vista v;
    private String[] lectura;
    private File archivo = new File("Productos.txt");

    public ElectronicaLatinoamericana(){
        productos = new ArrayList<>();
        carrito = new Carrito();
        v = new Vista();
    }
    public void ejecutar(){
        leerArchivo(); 
        v.inicio();
        while(true){
            int opcion = v.mostarMenuPrincipal();
            switch(opcion){
                case 1: //CREAR UN PRODUCTO                
                    crearProducto();
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

    private void leerArchivo()
    {
        //validación
        try 
        {    
            Scanner lector = new Scanner(archivo); //leer archivo
            while (lector.hasNextLine()) //analizar archivo linea por linea
            {
                lectura = lector.nextLine().split(";");
                //convertir datos del archivo a objetos de clase Dispositivo
                if (lectura[0].equals("Camara"))
                {
                    productos.add(new Productos.Dispositivos.Camara(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
                else if (lectura[0].equals("Celular"))
                {
                    productos.add(new Productos.Dispositivos.Celular(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
                else if (lectura[0].equals("Desktop"))
                {
                    productos.add(new Productos.Dispositivos.Desktop(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
                else if (lectura[0].equals("Laptop"))
                {
                    productos.add(new Productos.Dispositivos.Laptop(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
                else if (lectura[0].equals("Smartphone"))
                {
                    productos.add(new Productos.Dispositivos.Smartphone(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
                else if (lectura[0].equals("SmartTV"))
                {
                    productos.add(new Productos.Dispositivos.SmartTV(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
                else if (lectura[0].equals("Smartwatch"))
                {
                    productos.add(new Productos.Dispositivos.Smartwatch(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
                else if (lectura[0].equals("Tablet"))
                {
                    productos.add(new Productos.Dispositivos.Tablet(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
                else if (lectura[0].equals("TelefonoFijo"))
                {
                    productos.add(new Productos.Dispositivos.TelefonoFijo(lectura[1], lectura[2], Integer.parseInt(lectura[3]), lectura[4], lectura[5], lectura[6] ));
                }
            }
            lector.close(); //cerrar archivo
        } 
        catch (FileNotFoundException e) //no encuentra el archivo
        {
            v.mostrarErrorArchivo();
        }
    }
    private void crearProducto()
    {
        //pedir datos
        String tipo = v.pedirTipo();
        String nombre = v.pedirNombre();
        String marca = v.pedirMarca();
        int precio = v.pedirPrecio();
        if (precio != -1) //el precio SI es un int
        {
            String serie = v.pedirSerie(); //sigue pidiendo datos
            String fecha = v.pedirFecha();
            String ar = v.pedirMarcador();
             //crear e ingresar producto
            if (tipo.equals("Camara"))
            {
                productos.add(new Productos.Dispositivos.Camara(nombre, marca, precio, serie, fecha, ar));
            }
            else if (tipo.equals("Celular"))
            {
                productos.add(new Productos.Dispositivos.Celular(nombre, marca, precio, serie, fecha, ar));
            }
            else if (tipo.equals("Desktop"))
            {
                productos.add(new Productos.Dispositivos.Desktop(nombre, marca, precio, serie, fecha, ar));
            }
            else if (tipo.equals("Laptop"))
            {
                productos.add(new Productos.Dispositivos.Laptop(nombre, marca, precio, serie, fecha, ar));
            }
            else if (tipo.equals("Smartphone"))
            {
                productos.add(new Productos.Dispositivos.Smartphone(nombre, marca, precio, serie, fecha, ar));
            }
            else if (tipo.equals("SmartTV"))
            {
                productos.add(new Productos.Dispositivos.SmartTV(nombre, marca, precio, serie, fecha, ar));
            }
            else if (tipo.equals("Smartwatch"))
            {
                productos.add(new Productos.Dispositivos.Smartwatch(nombre, marca, precio, serie, fecha, ar));
            }
            else if (tipo.equals("Tablet"))
            {
                productos.add(new Productos.Dispositivos.Tablet(nombre, marca, precio, serie, fecha, ar));
            }
            else if (tipo.equals("TelefonoFijo"))
            {
                productos.add(new Productos.Dispositivos.TelefonoFijo(nombre, marca, precio, serie, fecha, ar));
            }
            //cadena con los datos
            String cadena = tipo + ";" + nombre + ";" + marca + ";" + Integer.toString(precio) + ";" + serie + ";" + fecha + ";" + ar;
            escribirProducto(cadena); //ingresar cadena al archivo

        }
        else //el precio NO es un int
        {
            v.mostrarOpcionInvalida();
        }               
    }
    private void escribirProducto(String cadena)
    {
        //validación
        try 
        {    
            FileWriter escritor = new FileWriter("Productos.txt", true); //escritor append (concatena, no reescribe)
            escritor.write("\n"); //escribir salto de linea
            escritor.write(cadena); //escribir cadena
            escritor.close();
        } 
        catch (IOException e) //no encuentra el archivo
        {
            v.mostrarErrorArchivo();
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
                            probarProducto(productoActual);
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
    private void probarProducto(Producto producto){
        boolean regresarSeleccionDeProducto = false;
        while(!regresarSeleccionDeProducto){
            int funcion = v.mostrarMenuProbarProducto(producto);
            switch(funcion){
                case 1: // Videojuego
                    if(producto.ejecutaVidejouegos()){
                        v.mostrarPrueba(producto.probar("ejecutarVideojuego", v.pedirJuego()));
                        
                    }else{
                        v.mostrarProductoNoPuedeHacerFuncion();
                    }
                break;
                case 2: // Llamar
                    if(producto.haceLlamadas()){
                        v.mostrarPrueba(producto.probar("llamar", v.pedirNumero()));
                    }else{
                        v.mostrarProductoNoPuedeHacerFuncion();
                    }
                break;
                case 3: // Internet
                    if(producto.navegaInternet()){
                        v.mostrarPrueba(producto.probar("navegarInternet", v.pedirLink()));
                    }else{
                        v.mostrarProductoNoPuedeHacerFuncion();
                    }                
                break;
                case 4: // Portable
                    if(producto.esPortatil()){
                        v.mostrarPrueba(producto.probar("portabilidad", ""));
                    }else{
                        v.mostrarProductoNoPuedeHacerFuncion();
                    }                
                break;
                case 5: // Video
                    if(producto.reproduceVideos()){
                        v.mostrarPrueba(producto.probar("reproducirVideo", ""));
                    }else{
                        v.mostrarProductoNoPuedeHacerFuncion();
                    }                
                break;
                case 6: // Foto
                    if(producto.tomaFotos()){
                        v.mostrarPrueba(producto.probar("tomarFoto", ""));
                    }else{
                        v.mostrarProductoNoPuedeHacerFuncion();
                    }                
                break;
                case 7: // Salir
                    regresarSeleccionDeProducto = true;
                break;
                default:
                    v.mostrarOpcionInvalida();
                break;
            }
        }
    }
    private void guardarProducto(Producto producto){ //GUARDAR EN EL ARCHIVO

    }
}
