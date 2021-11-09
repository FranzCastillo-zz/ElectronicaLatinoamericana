import Productos.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;     
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;

public class ElectronicaLatinoamericana {
    private ArrayList<Producto> productos;
    private Carrito carrito;
    private Vista v;
    private String[] lecturaProductos;
    private String[] lecturaSucursales;
    private File archivoProductos;
    private File archivoSucursales;
    ArrayList<Sucursal> sucursales;
    private Sucursal sucursalActual;
    Random rnd;

    public ElectronicaLatinoamericana(){
        archivoProductos = new File("Productos.txt");
        archivoSucursales = new File("Sucursales.txt");
        sucursales = new ArrayList<>();
        productos = new ArrayList<>();
        carrito = new Carrito();
        v = new Vista();
        rnd = new Random();
    }
    public void ejecutar(){
        leerProductos();
        leerSucursales(); 
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
                    mostrarCarrito();
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

    private void leerProductos()
    {
        //validación
        try 
        {    
            Scanner lector = new Scanner(archivoProductos); //leer archivo
            while (lector.hasNextLine()) //analizar archivo linea por linea
            {
                lecturaProductos = lector.nextLine().split(";");
                //convertir datos del archivo a objetos de clase Dispositivo
                if (lecturaProductos[0].equals("Camara"))
                {
                    productos.add(new Productos.Dispositivos.Camara(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
                }
                else if (lecturaProductos[0].equals("Celular"))
                {
                    productos.add(new Productos.Dispositivos.Celular(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
                }
                else if (lecturaProductos[0].equals("Desktop"))
                {
                    productos.add(new Productos.Dispositivos.Desktop(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
                }
                else if (lecturaProductos[0].equals("Laptop"))
                {
                    productos.add(new Productos.Dispositivos.Laptop(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
                }
                else if (lecturaProductos[0].equals("Smartphone"))
                {
                    productos.add(new Productos.Dispositivos.Smartphone(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
                }
                else if (lecturaProductos[0].equals("SmartTV"))
                {
                    productos.add(new Productos.Dispositivos.SmartTV(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
                }
                else if (lecturaProductos[0].equals("Smartwatch"))
                {
                    productos.add(new Productos.Dispositivos.Smartwatch(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
                }
                else if (lecturaProductos[0].equals("Tablet"))
                {
                    productos.add(new Productos.Dispositivos.Tablet(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
                }
                else if (lecturaProductos[0].equals("TelefonoFijo"))
                {
                    productos.add(new Productos.Dispositivos.TelefonoFijo(lecturaProductos[1], lecturaProductos[2], Integer.parseInt(lecturaProductos[3]), lecturaProductos[4], lecturaProductos[5], lecturaProductos[6] ));
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
            escribirArchivo(cadena, "Productos.txt"); //ingresar cadena al archivo

        }
        else //el precio NO es un int
        {
            v.mostrarOpcionInvalida();
        }               
    }
    private void escribirArchivo(String cadena, String archivo)
    {
        //validación
        try 
        {    
            FileWriter escritor = new FileWriter(archivo, true); //escritor append (concatena, no reescribe)
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
    private void mostrarCarrito(){
        boolean regresarMenuPrincipal = false;
        while(!regresarMenuPrincipal){
            int opcion = v.mostrarMenuMostrarCarrito();
            boolean ingresoValido = false;
            while(!ingresoValido){
                switch(opcion){
                    case 1: // VER PRODUCTOS
                        v.mostrarProductosCarrito(carrito.getProductos());
                        ingresoValido = true;
                    break;
                    case 2: // FINALIZAR COMPRA
                        finalizarCompra();
                        ingresoValido = true;
                    break;
                    case 3: // REGRESAR
                        ingresoValido = true;
                        regresarMenuPrincipal = true;
                    break;
                    default:
                        v.mostrarOpcionInvalida();
                        ingresoValido = true;
                    break;
                }
            }
        }
    }
    private void finalizarCompra()
    {
        boolean sucursalSeleccionada = false;
        while(sucursalSeleccionada == false){
            int opcion = v.menuSucursales();
            switch(opcion){
                case 1: //crear sucursal    
                //Pedir datos sucursal
                String direccion = v.pedirDireccion();
                int codigo = v.pedirCodigo();
                String pais = v.pedirPais();
                String ciudad = v.pedirCiudad();
                String nombreSucursal = v.pedirNombreSucursal();        
                sucursalActual = new Sucursal(direccion, codigo, pais, ciudad, nombreSucursal); //crear sucursal y agregar al array
                sucursales.add(sucursalActual);
                String cadena = direccion + ";" + Integer.toString(codigo) + ";" + pais + ";" + ciudad + ";" + nombreSucursal;
                escribirArchivo(cadena, "Sucursales.txt");
                sucursalSeleccionada = true;
                break;
                case 2: //usar sucursal del sistema
                    sucursalActual = v.mostrarSeleccionDeSucursal(sucursales);
                    sucursalSeleccionada = true;
                break;
                default:
                    v.mostrarOpcionInvalida();
                break;
            }
        }

        //Pedir datos de la factura
        String nombreCliente = v.pedirNombreCliente();
        String nit = v.pedirNIT();
        String fechaEmision = v.pedirFechaFactura();
        int numeroFactura = rnd.nextInt(99999);
        int montoTotal = getMontoTotal();
        v.mostrarFactura(sucursalActual, nombreCliente, nit, fechaEmision, numeroFactura, montoTotal);

        //El programa finaliza
        v.fin();
        System.exit(1);
    }
    private int getMontoTotal()
    {
        int total = 0;
        for (int i = 0; i < carrito.getProductos().size(); i++)
        {
            total += carrito.getProductos().get(i).getPrecio();
        }
        return total;
    }
    // AQUI TIENE QUE AGREGAR CADA SUCURSAL AL ARRAYLIST SUCURSALES
    // SE GUARDAN EN EL ARCHIVO DE LA SIGUIENTE MANERA
    // direccion;codigo;pais;ciudad;nombreSucursal
    private void leerSucursales()
    {
        //validación
        try 
        {    
            Scanner lector = new Scanner(archivoSucursales); //leer archivo
            while (lector.hasNextLine()) //analizar archivo linea por linea
            {
                lecturaSucursales = lector.nextLine().split(";");
                //convertir datos del archivo a objetos de clase Sucursal
                sucursales.add(new Sucursal(lecturaSucursales[0], Integer.parseInt(lecturaSucursales[1]), lecturaSucursales[2], lecturaSucursales[3], lecturaSucursales[4]));
            }
            lector.close(); //cerrar archivo
        } 
        catch (FileNotFoundException e) //no encuentra el archivo
        {
            v.mostrarErrorArchivo();
        }
    }
}
