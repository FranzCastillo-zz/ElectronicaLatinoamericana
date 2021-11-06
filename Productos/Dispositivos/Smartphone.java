package Productos.Dispositivos;

import Productos.Interfaces.*;

public class Smartphone implements HacerLlamadas, TomarFoto, NavegarInternet, ReproducirVideo, Portable {
    public String portable() {
        return null;
    }
    public String reproducir() {
        return null;
    }
    public String navegar(String link) {
        return null;
    }
    public String tomarFoto() {
        return null;
    }
    public String llamar(int numero) {
        return null;
    }
    
}
