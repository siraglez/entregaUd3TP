import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class AnalisisSentimientos {

    public static void main(String[] args) {

        //Ejemplo de uso
        String textoejemplo = "Menudo día de mierda. Me siento fatal";
        //String textoejemplo2 = "Qué gran día. Me siento maravilloso";
        String categoriaSentimiento = analizarSentimiento(textoejemplo);
        System.out.println("Publicación: " + textoejemplo + " - Sentimiento: " + categoriaSentimiento);
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


    //Función para analizar el texto, decidiéndo si es positivo, negativo o neutral
    private static int analizarTexto(String texto) {
        Map<String, Integer> palabrasSentimiento = inicializarPalabrasSentimiento();

        int palabrasPositivasCont = contarPalabrasClave(texto, palabrasSentimiento, true);
        int palabrasNegativasCont = contarPalabrasClave(texto, palabrasSentimiento, false);

        // Cálculo de Puntuación de Sentimiento
        int totalPalabras = palabrasPositivasCont + palabrasNegativasCont;
        return totalPalabras > 0 ? palabrasPositivasCont * 100 / totalPalabras : 50; // Valor por defecto si no existen palabras +-
    }

    //Hash map para almacenar distintas palabras positivas y negativas
    private static Map<String, Integer> inicializarPalabrasSentimiento() {
        Map<String, Integer> palabrasSentimiento = new HashMap<>();
        palabrasSentimiento.put("feliz", 1);
        palabrasSentimiento.put("increíble", 1);
        palabrasSentimiento.put("maravilloso", 1);
        palabrasSentimiento.put("guapo", 1);
        palabrasSentimiento.put("positivo", 1);
        palabrasSentimiento.put("genial", 1);
        palabrasSentimiento.put("happy", 1);
        palabrasSentimiento.put("great", 1);
        palabrasSentimiento.put("amazing", 1);

        palabrasSentimiento.put("triste", -1);
        palabrasSentimiento.put("malo", -1);
        palabrasSentimiento.put("negativo", -1);
        palabrasSentimiento.put("horrible", -1);
        palabrasSentimiento.put("desastroso", -1);
        palabrasSentimiento.put("mierda", -1);
        palabrasSentimiento.put("fatal", -1);
        palabrasSentimiento.put("sad", -1);
        palabrasSentimiento.put("bad", -1);

        return palabrasSentimiento;
    }

    //Función para determinar la puntuación de palabras positivas y negativas del texto analizado
    private static int contarPalabrasClave(String texto, Map<String, Integer> palabrasSentimiento, boolean esPositiva) {
        int contador = 0;
        for (String palabra : palabrasSentimiento.keySet()) {
            if ((esPositiva && palabrasSentimiento.get(palabra) > 0) || (!esPositiva && palabrasSentimiento.get(palabra) < 0)) {
                Pattern patron = Pattern.compile("\\b" + palabra + "\\b", Pattern.CASE_INSENSITIVE);
                Matcher matcher = patron.matcher(texto);
                while (matcher.find()) {
                    contador += Math.abs(palabrasSentimiento.get(palabra));
                }
            }
        }
        return contador;
    }
}
