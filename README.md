# Guía del Taller Práctico para el Estudiante: Listas Enlazadas en Java

```text
========================================================================================
ESCUELA SUPERIOR POLITÉCNICA AGROPECUARIA DE MANABÍ MANUEL FÉLIX LÓPEZ (ESPAM MFL)
Carreta: Desarrollo de Software
Asignatura: Estructuras de Datos y Algoritmos
Docente:    Luiggi Alexander Jalca Saltos
Estudiante: Geovanny Francisco Ríos Rodríguez
Semestre:   Segundo Semestre "A"
Fecha: jueves 05 de noviembre de 2026
========================================================================================
```

---

## 📌 ¿Qué hace el código?

El proyecto implementa una estructura de datos dinámica de tipo **Lista Enlazada Simple genérica (`ListaEnlazadaSimple<T>`)** conectada mediante nodos individuales (`Nodo<T>`). Permite gestionar colecciones de datos en tiempo de ejecución con las siguientes operaciones:

1. **`estaVacia()`**: Verifica si la lista carece de elementos evaluando si el nodo inicial (`cabeza`) es `null` en complejidad $O(1)$.
2. **`insertarAlInicio(T dato)`**: Crea un nuevo nodo en memoria Heap y lo enlaza como primer elemento de la lista en tiempo constante $O(1)$.
3. **`insertarAlFinal(T dato)`**: Recorre la secuencia de nodos mediante enlaces sucesivos hasta encontrar el último elemento y conectar el nuevo nodo en complejidad lineal $O(N)$.
4. **`eliminarAlInicio()`**: Desconecta y retira el primer nodo de la estructura actualizando el puntero `cabeza` hacia su nodo siguiente en tiempo $O(1)$, dejando el nodo anterior disponible para el recolector de basura (*Garbage Collector*).
5. **`buscar(T valorBuscado)`**: Ejecuta un algoritmo de búsqueda lineal/secuencial recorriendo la lista desde `cabeza` hasta el final con un puntero auxiliar sin alterar la referencia original, comparando cada dato con `.equals()`.
6. **`mostrarLista()`**: Recorre e imprime secuencialmente el contenido de cada nodo en formato visual legible (`[dato] -> ... -> null`).

---

## 📤 ¿Qué devuelve el código?

| Método | Tipo de retorno | Descripción de lo que devuelve |
| :--- | :--- | :--- |
| `estaVacia()` | `boolean` | `true` si la lista no contiene nodos (`cabeza == null`), o `false` en caso contrario. |
| `getCantidad()` | `int` | El número entero total de nodos registrados actualmente en la lista. |
| `insertarAlInicio(T dato)` | `void` | No retorna valor; inserta el elemento y muestra por consola la confirmación del nodo insertado. |
| `insertarAlFinal(T dato)` | `void` | No retorna valor; agrega el nodo al final y muestra por consola la confirmación del proceso. |
| `eliminarAlInicio()` | `T` | El dato de tipo genérico `T` que estaba almacenado en el primer nodo eliminado (o `null` si la lista ya estaba vacía). |
| `buscar(T valorBuscado)` | `boolean` | `true` si encuentra una coincidencia en la lista (e imprime la posición donde se localizó); `false` si recorre toda la lista hasta `null` sin encontrarlo o si la lista está vacía. |
| `mostrarLista()` | `void` | No retorna valor; imprime la representación en consola de la lista enlazada (ej. `[10] -> [20] -> [30] -> null`). |
| `Main.main(String[] args)` | `void` | Punto de entrada ejecutable que corre las pruebas integradas y muestra en consola la salida detallada de cada paso. |
