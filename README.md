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

# Ejercicio 3: Simulación de Redes de Computadores

Este código en Java simula el comportamiento de una red de computadoras. Aquí hay una explicación de cada parte del código:

## 1. Definición de las Clases `Nodo` y `Red`:

- `Nodo`: Representa un nodo en la red y tiene dos atributos: `id` para identificar el nodo y `trafico` para almacenar la cantidad de tráfico que tiene el nodo en la simulación.
- `Red`: Representa la red en sí y contiene una lista de nodos.

## 2. Función `crearRed(int numNodos)`:

- Esta función crea una red con un número específico de nodos. Cada nodo tiene un identificador único y se inicializa con un valor de tráfico inicial de 0.

## 3. Funciones `simularTrafico(Nodo nodo, double tasaDeTrafico)` e `imprimirNodo(Nodo nodo)`:

- `simularTrafico`: Genera un valor de tráfico aleatorio para un nodo dado, multiplicando un número aleatorio entre 0 y 1 por la tasa de tráfico proporcionada.
- `imprimirNodo`: Imprime en la consola la información del nodo, incluyendo su identificador y el tráfico generado.

## 4. Función `simularRed(List<Nodo> nodos, double tasaDeTrafico)`:

- Simula el tráfico en la red al llamar a `simularTrafico` para cada nodo y luego imprime la información del nodo utilizando `imprimirNodo`.

## 5. Función `main`:

- Solicita al usuario ingresar el número de nodos y la tasa de tráfico, luego crea una red con los nodos correspondientes y simula el tráfico.

En resumen, este programa Java permite al usuario simular el tráfico en una red de computadoras al ingresar el número de nodos y la tasa de tráfico. Luego, muestra la información del tráfico generado por cada nodo en la red.

# Pseudocódigo

```python
def simularRed(nodos, tasa_de_tráfico):
    red = crearRed(nodos)
    for nodo in red:
        simularTrafico(nodo, tasa_de_tráfico)
        imprimir("Nodo: ", nodo.id, " - Tráfico: ", nodo.trafico)

nodos = generarNodos(10)
tasa_de_tráfico = 0.5
simularRed(nodos, tasa_de_tráfico)
```

# Ejercicio 4: Desarrollo de un Videojuego Educativo

Este código representa un programa simple de un videojuego educativo en Java que introduce desafíos de programación, niveles de dificultad y la capacidad para que los usuarios creen sus propios desafíos.

## 1. Clase `Desafio`

- Representa un desafío de programación con un nombre asociado.
- Implementa un método `resolver()` que proporciona la lógica para resolver el desafío, específicamente para los desafíos "loop" y "condicional".
  - El desafío "loop" solicita al usuario ingresar un número y luego imprime los números del 1 al n.
  - El desafío "condicional" solicita al usuario ingresar un número y determina si es par o impar.

## 2. Clase `Nivel`

- Representa un nivel de dificultad con una lista de desafíos asociados.

## 3. Clase `VideojuegoEducativo`

- Contiene el método `main` que inicia la ejecución del programa.
- Crea dos desafíos predefinidos ("loop" y "condicional") y un nivel con esos desafíos.
- Llama a la función `jugarNivel` para jugar el nivel, que a su vez utiliza el método `resolver` de la clase `Desafio` para mostrar los resultados de cada desafío.
- Pregunta al usuario si quiere crear un desafío personalizado. Si la respuesta es afirmativa, solicita el nombre del desafío al usuario y crea un nuevo desafío personalizado.
- Llama a la función `agregarDesafio` para agregar el desafío personalizado al nivel.

En resumen, el programa simula un videojuego educativo que permite a los usuarios jugar niveles con desafíos predefinidos y crear sus propios desafíos personalizados para agregar al juego. La lógica para resolver los desafíos se encuentra en la clase `Desafio`.

# Pseudocódigo

```python
class Nivel:
    def __init__(self, dificultad, desafios):
        self.dificultad = dificultad
        self.desafios = desafios

función jugarNivel(nivel):
    para cada desafío en nivel.desafios:
        resultado = resolverDesafio(desafio)
        imprimir("Desafío: ", desafio, " - Resultado: ", resultado)

nivel = Nivel(dificultad = 1, desafios = ["loop", "condicional"])
jugarNivel(nivel)
```


# Ejercicio 5: Sistema de Monitoreo de Rendimiento de Aplicaciones

Este código en Java implementa un sistema básico de monitoreo del rendimiento de aplicaciones en un servidor. Aquí está una explicación detallada de lo que hace:

## 1. Clases Rendimiento y Aplicacion:

### - Rendimiento:

Esta clase tiene dos campos, `cpu` y `memoria`, que representan el rendimiento de una aplicación en términos de uso de CPU y memoria, respectivamente. Tiene un constructor para inicializar estos campos.

### - Aplicacion:

Esta clase representa una aplicación con un único campo `nombre`. También tiene un constructor para inicializar el nombre de la aplicación.

## 2. Clase RendimientoAplicaciones:

- `monitorearAplicacion(Aplicacion aplicacion)`: Esta función toma una instancia de la clase `Aplicacion`, obtiene su rendimiento mediante la función `obtenerRendimiento`, y luego imprime información sobre el rendimiento en la consola.
- `obtenerRendimiento(Aplicacion aplicacion)`: Esta función utiliza las clases `OperatingSystemMXBean` y `MemoryMXBean` del paquete `java.lang.management` para obtener información sobre el rendimiento del sistema. Obtiene la carga promedio del sistema como uso de CPU y el uso de memoria en términos de porcentaje.
- `obtenerAplicaciones()`: Esta función simula la obtención de una lista de aplicaciones en ejecución. En este caso, simplemente crea tres aplicaciones de prueba y las devuelve en una lista.
- `main(String[] args)`: La función principal crea una lista de aplicaciones llamando a `obtenerAplicaciones()`, y luego itera sobre esta lista llamando a `monitorearAplicacion()` para cada aplicación.

En resumen, el código simula un sistema de monitoreo de aplicaciones que imprime en la consola información sobre el uso de CPU y memoria de cada aplicación en una lista predefinida. Ten en cuenta que para un entorno de producción, necesitarías adaptar estas funciones para obtener información más precisa y realista sobre el rendimiento de las aplicaciones.


# Pseudocódigo

```python
función monitorearAplicación(aplicación):
    rendimiento = obtenerRendimiento(aplicación)
    imprimir("Aplicación: ", aplicacion.nombre, " - CPU: ", rendimiento.cpu, " - Memoria: ", rendimiento.memoria)

aplicaciones = obtenerAplicaciones()
para cada aplicación en aplicaciones:
    mnitorearAplicación(apliacción)
```
