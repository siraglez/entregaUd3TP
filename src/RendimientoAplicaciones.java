import java.util.ArrayList;
import java.util.List;

//Clase para representar el rendimiento de una aplicación
class Rendimiento {
    double cpu;
    double memoria;

    public Rendimiento(double cpu, double memoria) {
        this.cpu = cpu;
        this.memoria = memoria;
    }
}

//Clase para representar una aplicación
class Aplicacion {
    String nombre;

    public Aplicacion(String nombre) {
        this.nombre = nombre;
    }
}

//Clase principal con la lógica del sistema de monitoreo del rendimiento de las aplicaciones
public class RendimientoAplicaciones {

    //Función para monitorear una aplicación y mostrar el rendimiento
    public static void monitorearAplicacion(Aplicacion aplicacion) {
        Rendimiento rendimiento = obtenerRendimiento(aplicacion);
        System.out.println("Aplicación: " + aplicacion.nombre + " - CPU: " + rendimiento.cpu + " - Memoria: " + rendimiento.memoria);
    }

    //Función para obtener el rendimiento de una aplicación
    private static Rendimiento obtenerRendimiento(Aplicacion aplicacion) {

    }

    //Función para obtener la lista de aplicaciones
    private static List<Aplicacion> obtenerAplicaciones() {

    }

    public static void main(String[] args) {
        List<Aplicacion> aplicaciones = obtenerAplicaciones();
        for (Aplicacion aplicacion : aplicaciones) {
            monitorearAplicacion(aplicacion);
        }
    }
}
