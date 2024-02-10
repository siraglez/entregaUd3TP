import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RecomendacionLibros {

  //Simulación de datos de libros, intereses y calificaciones
    private static Map<String, List<String>> interesesUsuarios = new HashMap<>();
    private static Map<String, Map<String, Double>> calificacionesUsuarios = new HashMap<>();

    public static void main(String[] args) {
        String usuarioActual = obtenerUsuarioActual();
        List<String> recomendaciones = recomendarLibros(usuarioActual);
        System.out.println("Recomendaciones: " + recomendaciones);
    }

    //Función para obtener el usuario actual
    private static String obtenerUsuarioActual() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de usuario: ");
        String usuario = scanner.nextLine();

        return usuario;
    }

    //Función principal para la recomendación de libros
    private static List<String> recomendarLibros(String usuario) {
        List<String> librosInteresantes = obtenerLibrosInteresantes(usuario);
        Map<String, Double> calificaciones = obtenerCalificaciones(usuario);
        List<String> recomendaciones = new ArrayList<>();

        for (String libro : librosInteresantes) {
            if (!calificaciones.containsKey(libro)) {
                recomendaciones.add(libro);
            }
        }

        return recomendaciones;
    }

    //Función para obtener los libros de interés del usuario
    private static List<String> obtenerLibrosInteresantes(String usuario) {
        return interesesUsuarios.getOrDefault(usuario, new ArrayList<>());
    }

    //Función para obtener las calificaciones del usuario
    private static Map<String, Double> obtenerCalificaciones(String usuario) {
        return calificacionesUsuarios.getOrDefault(usuario, new HashMap<>());
    }
}