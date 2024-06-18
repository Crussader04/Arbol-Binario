//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Nodo nodo1 = new Nodo(1);
        Nodo nodo2 = new Nodo(2);

        arbol.agregarNodo(nodo1);
        arbol.agregarNodo(nodo2);

        Grafo grafo = new Grafo();
        grafo.generarGrafo();
        grafo.presentarGrafo();
    }
}

