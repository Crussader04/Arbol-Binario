import java.util.ArrayList;
import java.util.List;

public class Grafo {
    private List<Nodo> nodos;

    public Grafo() {
        this.nodos = new ArrayList<>();
    }

    public void generarGrafo() {
        // Lógica para generar un grafo
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        nodos.add(nodo1);
        nodos.add(nodo2);
    }

    public void presentarGrafo() {
        // Lógica para presentar un grafo
        for (Nodo nodo : nodos) {
            System.out.println("Nodo: " + nodo.getNumero());
        }
    }
}
