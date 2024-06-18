public class ListaEnlazada {
    private Nodo head;

    public ListaEnlazada() {
        head = null;
    }

    public void avanzar_Nodo() {
        if (head != null) {
            head = head.siguiente;
        }
    }

    public void agregarNodo(Nodo nodo) {
        if (head == null) {
            head = nodo;
        } else {
            Nodo actual = head;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nodo;
        }
    }
}

