Link al repositorio: https://github.com/siraglez/entregaUd3TP.git

# Ejercicio 1: Análisis de Datos de Redes Sociales

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

# Pseudocódigo

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

# Ejercicio 2: Sistema de Recomendación de Libros

Este código en Java implementa un programa simple para recomendar libros a usuarios basándose en sus intereses y calificaciones proporcionadas. Aquí está la explicación del código:

## 1. Datos Simulados:

- `interesesUsuarios`: Un mapa que almacena los intereses de los usuarios. La clave es el nombre del usuario, y el valor es una lista de libros de interés para ese usuario.
- `calificacionesUsuarios`: Un mapa anidado que almacena las calificaciones dadas por los usuarios para cada libro. La clave externa es el nombre del usuario, la clave interna es el nombre del libro, y el valor es la calificación dada por ese usuario para ese libro.

## 2. Método `main`:

- El punto de entrada del programa.
- Solicita al usuario que ingrese su nombre.
- Llama a `almacenarDatos` para que el usuario pueda ingresar libros que le hayan gustado y sus calificaciones.
- Luego, llama a `recomendarLibros` para obtener y mostrar las recomendaciones de libros.

## 3. Método `obtenerUsuarioActual`:

- Utiliza un objeto `Scanner` para obtener el nombre de usuario desde la entrada estándar.

## 4. Método `almacenarDatos`:

- Solicita al usuario si desea almacenar libros que le hayan gustado.
- En un bucle, permite al usuario ingresar libros y calificaciones.
- Almacena los datos en `calificacionesUsuarios` asociándolos al usuario actual.

## 5. Método `recomendarLibros`:

- Obtiene los libros de interés del usuario.
- Obtiene las calificaciones del usuario.
- Itera sobre los libros de interés y agrega a la lista de recomendaciones aquellos libros que no han sido calificados por el usuario.

## 6. Método `obtenerLibrosInteresantes`:

- Devuelve la lista de libros de interés para un usuario dado.

## 7. Método `obtenerCalificaciones`:

- Devuelve el mapa de calificaciones para un usuario dado.

## 8. Comentarios adicionales:

- El código asume una interacción de consola para ingresar datos. Las respuestas del usuario se obtienen a través de la entrada estándar utilizando `Scanner`.
- Las funciones `obtenerLibrosInteresantes` y `obtenerCalificaciones` actualmente devuelven listas y mapas vacíos, respectivamente, si no se encuentran datos para un usuario en particular. Esto puede ser modificado según el comportamiento deseado.
- Se menciona que las funciones relacionadas con la base de datos están incompletas y se asume que se utilizarían para comparar y seleccionar las mejores recomendaciones basadas en una amplia variedad de libros almacenados.

# Pseudocódigo

```python
función recomendarLibros(usuario):
    libros_interesantes = obtenerLibrosInteresantes(usuario)
    calificaciones = obtenerCalificaciones(usuario)
    recomendaciones = []
    para cada libro en libros_interesantes:
        si libro no está en calificaciones:
            recomendaciones.agregar(libro)
    return recomendaciones

usuario_actual = obtenerUsuarioActual()
recomendaciones = recomendarLibros(usuario_actual)
imprimir("Recomendaciones: ", recomendaciones)
```
