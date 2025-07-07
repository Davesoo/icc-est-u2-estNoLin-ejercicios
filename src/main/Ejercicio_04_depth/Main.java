package main.Ejercicio_04_depth;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(4);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(8);

        System.out.println("Ejercicio 04: Profundidad de un árbol binario");
        int profundidad = tree.maxDepth(tree.root);
        System.out.println("Profundidad máxima del árbol: " + profundidad);
    }
}
