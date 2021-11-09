import Productos.Producto;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;

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
    
    public void mostrarErrorArchivo()
    {
        prnt("Error de lectura del archivo. Por favor, pruebe de nuevo");
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
        prnt("-----------------------------------------------------------");
        prnt(producto.getResumen());
        prnt("-----------------------------------------------------------");
        prnt("Este producto cuenta con las siguientes funcionalidades: ");
        ArrayList<String> funcionalidades = new ArrayList<>(producto.getFuncionalidades());
        String funciones = "| ";
        for (String funcion : funcionalidades) {
            funciones += funcion + " | ";
        }
        prnt(funciones);
        prnt("-----------------------------------------------------------");
        prnt("Que funcionalidad desea probar?");
        prnt("1) Ejecutar un Videojuego");
        prnt("2) Hacer una llamada");
        prnt("3) Navegar por Internet");
        prnt("4) Portabilidad");
        prnt("5) Reproducir Video");
        prnt("6) Tomar Fotografia\n");
        prnt("7) Regresar a seleccion de producto");
        while(true){
            prnt("\nIngrese la opcion deseada:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion >= 1 && opcion <= 7){
                    return opcion;
                }else{
                    mostrarOpcionInvalida();
                }
            }catch(Exception e){
                scan.next();
                mostrarOpcionInvalida();
            }
        }
    }
    public void mostrarPrueba(String resultadoFuncion){
        prnt(resultadoFuncion);
    }
    public void mostrarProductoNoPuedeHacerFuncion(){
        prnt("Su producto no es apto para realizar la funcionalidad que desea probar.");
    }
    public String pedirLink(){
        prnt("Ingrese el URL que desea visitar:");
        return scan.nextLine();
    }
    public String pedirNumero(){
        while(true){
            prnt("Ingrese el numero telefonico al que desea llamar:");
            try{
                int numero = scan.nextInt();
                scan.nextLine();
                return Integer.toString(numero);
            }catch(Exception e){
                scan.next();
                mostrarOpcionInvalida();
            }
        }
    }
    public String pedirJuego(){
        prnt("Ingrese el juego que desa probar:");
        return scan.nextLine();
    }

    public String pedirTipo()
    {
        String nombres[] = {"Camara", "Celular", "Desktop", "Laptop", "Smartphone", "Smarttv", "Smartwatch", "Tablet", "Telefonofijo"}; //array con los tipos de dispositivos disponibles
        boolean bandera = false; //bandera para la validación
        while(true)
        {
            prnt("Ingrese el tipo de dispositivo (Camara/Celular/Desktop/Laptop/Smartphone/SmartTV/Smartwatch/Tablet/TelefonoFijo):");
            String nombre = scan.nextLine(); //leer linea
            if (nombre.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                nombre = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
                for (int i = 0; i < nombres.length; i++) //validación
                {
                    if(nombre.equals(nombres[i])) //si el nombre ingresado si está dentro del array
                    {
                        bandera = true;
                    }
                }
                if (nombre.equals(nombres[5]))
                {
                    nombre = "SmartTV";
                }
                if (nombre.equals(nombres[8]))
                {
                    nombre = "TelefonoFijo";
                }
                if(bandera == true) //el nombre es correcto
                {
                    return nombre;
                }
                else
                {
                    mostrarOpcionInvalida();
                }
            }
        }
    }
    public String pedirNombre()
    {
        while(true)
        {
            prnt("Ingrese el nombre del dispositivo:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public String pedirMarca()
    {
        while(true)
        {
            prnt("Ingrese la marca del dispositivo:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public int pedirPrecio()
    {
        prnt("Ingrese el precio del dispositivo:");
        try{
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        }catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
            scan.next();
            return -1;
        }
    }
    public String pedirSerie()
    {
        while(true)
        {
            prnt("Ingrese la serie del dispositivo:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public String pedirFecha(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        boolean ingresoValido = false;
        Date temp = null;
        while(!ingresoValido){
            prnt("Ingrese la fecha de publicacion (dd/MM/yyyy)");
            String fecha = scan.nextLine();
            try{
                temp = formato.parse(fecha);
                ingresoValido = true;
            }catch(Exception e){
                mostrarOpcionInvalida();
            }
        }
        // CONVIERTE DE DATE A STRING
        LocalDate localDate = temp.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String fecha = localDate.getDayOfMonth() + "/" + localDate.getMonthValue() + "/" + localDate.getYear();
        return fecha;
    }
    public String pedirMarcador()
    {
        while(true)
        {
            prnt("Ingrese el marcador AR del dispositivo:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public int mostrarMenuMostrarCarrito(){
        prnt("---------------------------------------------------------------------");
        prnt("Menu del Carrito:");
        prnt("1) Ver productos en el carrito");
        prnt("2) Finalizar Compra");
        prnt("3) Regresar a menu principal");
        prnt("---------------------------------------------------------------------");
        while(true){
            prnt("Que desea hacer?");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion >= 1 && opcion <= 3){
                    return opcion;
                }else{
                    mostrarOpcionInvalida();
                }
            }catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
                scan.next();
                mostrarOpcionInvalida();
            }
        }
    }
    public void mostrarProductosCarrito(ArrayList<Producto> productos){
        prnt("----------------- PRODUCTOS EN EL CARRITO -----------------");
        int i = 1;
        for (Producto producto : productos) {
            prnt(i++ + ") " + producto.getResumen());
        }
        prnt("-----------------------------------------------------------");
    }
    public Sucursal mostrarSeleccionDeSucursal(ArrayList<Sucursal> sucursales){
        prnt("---------------- SUCURSALES DISPONIBLES --------------------");
        int i = 1;
        for (Sucursal sucursal : sucursales) {
            prnt(i++ + ") " + sucursal.getDetalles() );
        }
        while(true){
            prnt("\nIngrese la sucursal deseada:");
            try{
                int opcion = scan.nextInt();
                scan.nextLine();
                if(opcion >= 1 && opcion <= i){
                    return sucursales.get(opcion - 1);
                }else{
                    mostrarOpcionInvalida();
                }
            }catch(Exception e){
                scan.next();
                mostrarOpcionInvalida();
            }
        }
    }

    public int menuSucursales()
    {
        prnt("Que desea hacer?");
        prnt("1) Ingresar sucursal");
        prnt("2) Utilizar sucursal del sistema");
        try{
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        }catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
            scan.next();
            return -1;
        }
    }
    public String pedirDireccion()
    {
        while(true)
        {
            prnt("Ingrese la dirreccion de la sucursal:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public int pedirCodigo()
    {
        prnt("Ingrese el código de la sucursal:");
        try{
            int opcion = scan.nextInt();
            scan.nextLine();
            return opcion;
        }catch(Exception e){ //SI INGRESA ALGO QUE NO ES NUMERO
            scan.next();
            return -1;
        }
    }
    public String pedirPais()
    {
        while(true)
        {
            prnt("Ingrese el pais de la sucursal:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public String pedirCiudad()
    {
        while(true)
        {
            prnt("Ingrese la ciudad de la sucursal:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public String pedirNombreSucursal()
    {
        while(true)
        {
            prnt("Ingrese el nombre de la sucursal:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public String pedirNombreCliente()
    {
        while(true)
        {
            prnt("\nIngrese el nombre para la factura:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public String pedirNIT()
    {
        while(true)
        {
            prnt("Ingrese el NIT para la factura:");
            String str = scan.nextLine();
            if (str.equals(""))
            {
                mostrarOpcionInvalida();
            }
            else
            {
                return str;
            }
        }
    }
    public String pedirFechaFactura(){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        boolean ingresoValido = false;
        Date temp = null;
        while(!ingresoValido){
            prnt("Ingrese la fecha para la factura (dd/MM/yyyy)");
            String fecha = scan.nextLine();
            try{
                temp = formato.parse(fecha);
                ingresoValido = true;
            }catch(Exception e){
                mostrarOpcionInvalida();
            }
        }
        // CONVIERTE DE DATE A STRING
        LocalDate localDate = temp.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        String fecha = localDate.getDayOfMonth() + "/" + localDate.getMonthValue() + "/" + localDate.getYear();
        return fecha;
    }

    public void mostrarFactura(Sucursal sucursal, String nombreCliente, String nit, String fechaEmision, int numeroFactura, int montoTotal)
    {
        prnt("---------------- FACTURA --------------------");
        prnt(sucursal.getDetalles());
        prnt("Nombre: " + nombreCliente);
        prnt("NIT: " + nit);
        prnt("Fecha de emision: " + fechaEmision);
        prnt("Factura No. " + numeroFactura);
        prnt("---------------------------------------------");
        prnt("Total a pagar: Q." + montoTotal);
        prnt("---------------------------------------------");
    }
}
