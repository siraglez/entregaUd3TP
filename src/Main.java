import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {

        //Ejemplo de uso
        String textoejemplo = "Menudo día de cachimbero. Me siento como el culo";
        String categoriaSentimiento = analizarSentimiento(textoejemplo);
        System.out.println("Sentimiento: " + categoriaSentimiento);
    }

    public static String analizarSentimiento(String texto) {
        //Analiss del texto para obtener una puntuacion de sentimiento
        double puntuacionSentimiento = analizarTexto(texto);

        //Definicion de umbrales
        double umbralPositivo = 0.6;
        double umbralNegativo = 0.4;

        //Clasificar Sentimientos
        if (puntuacionSentimiento >= umbralPositivo) {
            return "positivo";

        } else if (puntuacionSentimiento <= umbralNegativo) {
            return "negativo";

        } else {
            return "neutral";
        }

    }

    private static double analizarTexto(String texto) {
        int palabrasPositivas = contarPalabrasPositivas(texto);
        int palabrasNegativas = contarPalabrasNegativas(texto);

        //Calculo de Puntuación de Sentimiento
        double totalPalabras = palabrasPositivas + palabrasNegativas;
        return totalPalabras > 0 ? palabrasPositivas / totalPalabras : 0.5; //Valor por defecto si no existen palabras +-

    }

    private static int contarPalabrasPositivas(String texto) {
        String[] palabrasPositivas = {"feliz", "increible", "maravilloso", "guapo", "positivo"};
        return contarPalabrasClave(texto, palabrasPositivas);
    }

    private static int contarPalabrasNegativas(String texto) {
        String[] palabrasNegativas = {"triste", "malo", "negativo", "repugnante", "desastroso", "cachimbero"};
        return contarPalabrasClave(texto, palabrasNegativas);
    }

    private static int contarPalabrasClave(String texto, String[] palabrasClave){
        int contador = 0;
        for (String palabra : palabrasClave){
            Pattern patron = Pattern.compile("\\b" + palabra + "\\b", Pattern.CASE_INSENSITIVE);
            Matcher matcher = patron.matcher(texto);
            while(matcher.find()){
                contador++;
            }
        }
        return contador;
    }
}