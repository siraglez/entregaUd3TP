import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Clase Desafio para mostrar los desafíos de programación
class Desafio {
    String nombre;

    public Desafio(String nombre) {
        this.nombre = nombre;
    }

    public String resolver() {
        if (nombre.equals("loop")) {
            //Lógica para resolver el desafío de loop
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un número: ");
            int numero = scanner.nextInt();

            //Imprimir números del 1 al n
            StringBuilder resultado = new StringBuilder("Resultado del desafío: ");
            for (int i = 1; i <= numero; i++) {
                resultado.append(i).append(" ");
            }
            return resultado.toString();
        } else if (nombre.equals("condicional")) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese un número: ");

                //Leer el número ingresado por el usuario
                int numero = scanner.nextInt();

                //Determinar si el número es par o impar
                String resultado = (numero % 2 == 0) ? "El número es par" : "El número es impar";

                //Devolver el resultado como String
                return resultado;
        } else {
            return "Resultado del desafío no implementado";
        }
        //Aquí habría que implementar la lógica para resolver el resto de desafíos implementados en el videojuego
    }
}

//Clase Nivel para mostrar un nivel de dificultad y su lista de desafíos
class Nivel {
    int dificultad;
    List<Desafio> desafios;

    public Nivel(int dificultad, List<Desafio> desafios) {
        this.dificultad = dificultad;
        this.desafios = desafios;
    }
}
public class VideojuegoEducativo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Crear desafíos
        Desafio loop = new Desafio("loop");
        Desafio condicional = new Desafio("condicional");

        //Crear nivel con desafíos
        List<Desafio> desafiosNivel1 = new ArrayList<>();
        desafiosNivel1.add(loop);
        desafiosNivel1.add(condicional);

        Nivel nivel = new Nivel(1, desafiosNivel1);

        //Jugar el nivel
        jugarNivel(nivel);

        //Permitir que el usuario cree sus propios desafíos
        System.out.println("¿Quieres crear tu propio desafío? (si/no): ");
        String respuesta = scanner.nextLine().toLowerCase();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese el nombre del desafío: ");
            String nombreDesafio = scanner.nextLine();
            Desafio nuevoDesafio = new Desafio(nombreDesafio);

            //Agregar el desafío personalizado al juego
            agregarDesafio(nivel, nuevoDesafio);
        }
    }

    public static void jugarNivel(Nivel nivel) {
        for (Desafio desafio : nivel.desafios) {
            String resultado = desafio.resolver();
            System.out.println("Desafío: " + desafio.nombre + " - Resultado: " + resultado);
        }
    }

    public static void agregarDesafio(Nivel nivel, Desafio nuevoDesafio) {
        nivel.desafios.add(nuevoDesafio);
        System.out.println("Desafío personalizado agregado con éxito.");
    }
}
