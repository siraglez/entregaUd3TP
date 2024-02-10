Link al repositorio: https://github.com/siraglez/entregaUd3TP.git


# Ejercicio 1: Análisis de Sentimientos en Java

Este código Java implementa un simple análisis de sentimientos en un texto dado. La idea es asignar una puntuación de sentimiento basada en la presencia de palabras clave positivas y negativas en el texto.

## 1. Clase Principal: `AnalisisSentimientos`

La función `main` se utiliza para realizar un ejemplo de uso. Se proporciona un ejemplo de texto (`textoejemplo`), y se pasa a la función `analizarSentimiento`. El resultado se imprime en la consola.

## 2. Método: `analizarSentimiento`

- Recibe un texto como parámetro y llama a `analizarTexto` para obtener una puntuación de sentimiento.
- Define umbrales (`umbralPositivo` y `umbralNegativo`) para clasificar el sentimiento como positivo, negativo o neutral.
- Devuelve la clasificación del sentimiento como una cadena ("positivo", "negativo" o "neutral").

## 3. Método: `analizarTexto`

- Utiliza la función `contarPalabrasClave` para contar las palabras clave positivas y negativas en el texto.
- Calcula la puntuación de sentimiento como un porcentaje de palabras positivas respecto al total de palabras (positivas y negativas).
- Devuelve 50 como valor predeterminado si no se encuentran palabras clave en el texto.

## 4. Método: `inicializarPalabrasSentimiento`

- Inicializa un `HashMap` llamado `palabrasSentimiento` que contiene palabras clave con sus respectivas puntuaciones de sentimiento (1 para positivo, -1 para negativo).

## 5. Método: `contarPalabrasClave`

- Cuenta la frecuencia de aparición de palabras clave positivas o negativas en el texto.
- Utiliza expresiones regulares para encontrar coincidencias de palabras clave, y la variable `esPositiva` determina si se deben contar palabras clave positivas o negativas.

En resumen, este código proporciona una forma básica de determinar el sentimiento de un texto basándose en la presencia de palabras clave positivas y negativas. La puntuación se calcula como un porcentaje de palabras positivas en relación con el total de palabras (positivas y negativas).

# Análisis de Sentimientos en Pseudocódigo

```plaintext
función analizarSentimiento(texto):
    sentimiento = analizarTexto(texto)
    si sentimiento > umbral_positivo 
        return "positivo"
    si sentimiento < umbral_negativo 
        return "negativo"
    return "neutral"

para cada publicación en red_social:
    sentimiento = analizarSentimiento(publicación.texto)
    imprimir("Publicación: ", publicación.texto, " - Sentimiento: ", sentimiento)
```
