import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

class Nodo {
    int id;
    double trafico;

    Nodo(int id) {
        this.id = id;
        this.trafico = 0.0;
    }
}

class Red {
    List<Nodo> nodos;

    Red(List<Nodo> nodos) {
        this.nodos =nodos;
    }
}
public class RedesDeComputadores {

    public static Red crearRed(int numNodos) {
        List<Nodo> nodos = new ArrayList<>();
        for (int i = 0; i < numNodos; i++) {
            nodos.add(new Nodo(i + 1));
        }
        return new Red(nodos);
    }

    public static void simularTrafico(Nodo nodo, double tasaDeTrafico) {
        Random random = new Random();
        nodo.trafico = random.nextDouble() * tasaDeTrafico;
    }

    public static void imprimirNodo(Nodo nodo) {
        System.out.println("Nodo: " + nodo.id + " - Trafico: " + nodo.trafico);
    }

    public static void simularRed(List<Nodo> nodos, double tasaDeTrafico) {
        Red red = new Red(nodos);

        for (Nodo nodo : red.nodos) {
            simularTrafico(nodo, tasaDeTrafico);
            imprimirNodo(nodo);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de nodos: ");
        int numNodos = scanner.nextInt();

        List<Nodo> nodos = new ArrayList<>();
        for (int i = 0; i < numNodos; i++) {
            nodos.add(new Nodo(i + 1));
        }

        System.out.println("Ingrese la tasa de tráfico: ");
        double tasaDeTrafico = scanner.nextDouble();

        simularRed(nodos, tasaDeTrafico);
    }
}
