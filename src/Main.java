public class Main {

    public static void main(String[] args) {

        System.out.println("=======================================================================");
        System.out.println("            DEMOSTRACION: LISTAS ENLAZADAS SIMPLES EN JAVA             ");
        System.out.println("=======================================================================\n");

        // --------------------------------------------------------------------
        // PASO 1: Creacion de la Lista y Verificacion Inicial
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 1: Creacion de la Lista y Verificacion Inicial");
        ListaEnlazadaSimple<Integer> listaEnteros = new ListaEnlazadaSimple<>();
        System.out.println("  ¿La lista esta vacia al inicio?: " + listaEnteros.estaVacia());
        listaEnteros.mostrarLista();
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 2: Insercion al Inicio - Operacion O(1)
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 2: Insercion al Inicio (Operacion O(1))");
        System.out.println("  Insertaremos: 30, luego 20, luego 10");
        listaEnteros.insertarAlInicio(30);
        listaEnteros.insertarAlInicio(20);
        listaEnteros.insertarAlInicio(10);
        System.out.println("  Observa el resultado: el ultimo insertado al inicio queda primero:");
        listaEnteros.mostrarLista();
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 3: Insercion al Final - Operacion O(N)
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 3: Insercion al Final (Operacion O(N))");
        System.out.println("  Insertaremos: 40, luego 50 al final");
        listaEnteros.insertarAlFinal(40);
        listaEnteros.insertarAlFinal(50);
        listaEnteros.mostrarLista();
        System.out.println("  Total de nodos en la lista: " + listaEnteros.getCantidad());
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 4: Busqueda Lineal de Elementos
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 4: Busqueda Lineal de Elementos");
        System.out.println();

        System.out.println("  1. Buscando el numero 30 (que si existe):");
        boolean encontrado30 = listaEnteros.buscar(30);
        System.out.println("     Resultado obtenido: " + encontrado30 + " | Esperado: true");

        System.out.println("\n  2. Buscando el numero 99 (que no existe):");
        boolean encontrado99 = listaEnteros.buscar(99);
        System.out.println("     Resultado obtenido: " + encontrado99 + " | Esperado: false");
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 5: Eliminacion al Inicio - Demostracion de Garbage Collector O(1)
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 5: Eliminacion al Inicio (Demostracion de Garbage Collector)");
        listaEnteros.eliminarAlInicio();
        System.out.println("  Lista tras eliminar el nodo inicial:");
        listaEnteros.mostrarLista();
        System.out.println();

        // --------------------------------------------------------------------
        // PASO 6: Lista Enlazada con Cadenas (String) - Ejemplo Clasico
        // --------------------------------------------------------------------
        System.out.println(">>> PASO 6: Lista Enlazada con Cadenas (String) - Ejemplo Clasico");
        ListaEnlazadaSimple<String> listaFrutas = new ListaEnlazadaSimple<>();
        listaFrutas.insertarAlFinal("Manzana");
        listaFrutas.insertarAlFinal("Banana");
        listaFrutas.insertarAlFinal("Naranja");
        listaFrutas.insertarAlInicio("Fresa");
        listaFrutas.mostrarLista();

        System.out.println("\n  Buscando 'Banana' en la lista de frutas:");
        listaFrutas.buscar("Banana");
        System.out.println();

        System.out.println("=======================================================================");
        System.out.println("                     FIN DE LA DEMOSTRACION                            ");
        System.out.println("=======================================================================");
    }
}
