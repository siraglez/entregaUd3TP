import java.util.ArrayList;
import java.util.List;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

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
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();

        //Obtener el uso de CPU con carga promedio
        double cpu = osBean.getSystemLoadAverage();

        //Obtener el uso de memoria
        MemoryUsage heapMemoryUsage = memoryBean.getHeapMemoryUsage();
        double memoria = ((double) heapMemoryUsage.getUsed() / heapMemoryUsage.getMax()) * 100;

        return new Rendimiento(cpu, memoria);
    }

    //Función para obtener la lista de aplicaciones
    private static List<Aplicacion> obtenerAplicaciones() {
        //Aquí se podría implementar la lógica real para obtener la lista de aplicaciones
        //Ejemplo creando algunas aplicaciones de prueba
        List<Aplicacion> aplicaciones = new ArrayList<>();
        aplicaciones.add(new Aplicacion("App 1"));
        aplicaciones.add(new Aplicacion("App 2"));
        aplicaciones.add(new Aplicacion("App 3"));
        return aplicaciones;
    }

    public static void main(String[] args) {
        List<Aplicacion> aplicaciones = obtenerAplicaciones();
        for (Aplicacion aplicacion : aplicaciones) {
            monitorearAplicacion(aplicacion);
        }
    }
}
