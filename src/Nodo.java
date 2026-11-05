public class Nodo<T> {

    // 1. Carga util almacenada en el nodo
    public T dato;

    // 2. Referencia (puntero) hacia el siguiente nodo enlazado
    public Nodo<T> siguiente;

    // Constructor que inicializa el dato y deja el siguiente en null
    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // Constructor para inicializar dato y siguiente en un solo paso
    public Nodo(T dato, Nodo<T> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "[" + this.dato + "]";
    }
}
