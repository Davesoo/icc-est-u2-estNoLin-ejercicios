package main.Ejercicio_02_invert;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(4);
        tree.insert(2);
        tree.insert(7);
        tree.insert(1);
        tree.insert(3);
        tree.insert(6);
        tree.insert(9);

        System.out.println("Ejeercicio 02: Invertir un árbol binario");
        System.out.println("Recorrido original InOrder:");
        tree.inOrder(tree.root);
        System.out.println("");

        tree.invertTree(tree.root);

        System.out.println("Recorrido invertido InOrder:");
        tree.inOrder(tree.root);
    }
}
