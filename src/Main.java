import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {

        //Ejemplo de uso
        String textoejemplo = "Menudo día de mierda. Me siento fatal";
        //String textoejemplo2 = "Qué gran día. Me siento maravilloso";
        String categoriaSentimiento = analizarSentimiento(textoejemplo);
        System.out.println("Sentimiento: " + categoriaSentimiento);
    }

    public static String analizarSentimiento(String texto) {
        //Análisis del texto para obtener una puntuación de sentimiento
        int puntuacionSentimiento = analizarTexto(texto);

        //Definición de umbrales
        int umbralPositivo = 60;
        int umbralNegativo = 40;

        //Clasificar Sentimientos
        if (puntuacionSentimiento >= umbralPositivo) {
            return "positivo";

        } else if (puntuacionSentimiento <= umbralNegativo) {
            return "negativo";

        } else {
            return "neutral";
        }

    }


    //Quitar bucles y usar hash code (clave y valor)
    private static int analizarTexto(String texto) {
        int palabrasPositivas = contarPalabrasPositivas(texto);
        int palabrasNegativas = contarPalabrasNegativas(texto);

        //Cálculo de Puntuación de Sentimiento
        int totalPalabras = palabrasPositivas + palabrasNegativas;
        return totalPalabras > 0 ? palabrasPositivas / totalPalabras : 50; //Valor por defecto si no existen palabras +-

    }

    private static int contarPalabrasPositivas(String texto) {
        String[] palabrasPositivas = {"feliz", "increíble", "maravilloso", "guapo", "positivo", "genial", "happy", "great", "amazing"};
        return contarPalabrasClave(texto, palabrasPositivas);
    }

    private static int contarPalabrasNegativas(String texto) {
        String[] palabrasNegativas = {"triste", "malo", "negativo", "horrible", "desastroso", "mierda", "fatal", "sad", "bad"};
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