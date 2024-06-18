public class Nodo implements Accion {
    private int numero;
    Nodo siguiente;

    public Nodo(int numero) {
        this.numero = numero;
        this.siguiente = null;
    }

    public int mover_Derecha() {
        // Lógica de mover derecha (puede ser ajustar referencias en un árbol binario)
        return numero + 1;  // Ejemplo simple
    }

    public int mover_Izquierda() {
        // Lógica de mover izquierda (puede ser ajustar referencias en un árbol binario)
        return numero - 1;  // Ejemplo simple
    }

    public int cambiar_Raiz() {
        // Lógica para cambiar la raíz (puede involucrar reasignar nodos en un árbol binario)
        return numero;  // Ejemplo simple
    }

    @Override
    public int agregar_Nodo() {
        // Implementar lógica para agregar nodo
        return 0;
    }

    @Override
    public int eliminar_Nodo() {
        // Implementar lógica para eliminar nodo
        return 0;
    }

    @Override
    public int insertar_Nodo() {
        // Implementar lógica para insertar nodo
        return 0;
    }

    @Override
    public int buscar_Nodo() {
        // Implementar lógica para buscar nodo
        return numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
