import java.util.ArrayList;
import java.util.List;

public class ArbolBinario {
    private int altura;
    private String tipo;  // Usar String como ejemplo, Tipo_ArbolBinario no está definido
    private List<Nodo> nodoList;

    public ArbolBinario() {
        nodoList = new ArrayList<>();
    }

    public void recorrido_Inorden() {
        // Implementar recorrido inorden
        for (Nodo nodo : nodoList) {
            System.out.println(nodo.getNumero() + " ");
        }
    }

    public void recorrido_Postorden() {
        // Implementar recorrido postorden
        for (Nodo nodo : nodoList) {
            System.out.println(nodo.getNumero() + " ");
        }
    }

    public void recorrido_Preorden() {
        // Implementar recorrido preorden
        for (Nodo nodo : nodoList) {
            System.out.println(nodo.getNumero() + " ");
        }
    }

    public void agregarNodo(Nodo nodo) {
        nodoList.add(nodo);
    }

    public void eliminarNodo(Nodo nodo) {
        nodoList.remove(nodo);
    }

    public List<Nodo> getNodoList() {
        return nodoList;
    }
}
