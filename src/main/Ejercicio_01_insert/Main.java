package main.Ejercicio_01_insert;

public class Main {
    public static void main(String[] args) {
        BinaryTreeSearch tree = new BinaryTreeSearch();

        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(2);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println("Ejercicio 01: Inserción en un árbol binario de búsqueda (BST)");
        System.out.println("Recorrido sin configuración de BST: ");
        System.out.println("5 3 7 2 4 6 8");
        System.out.println("Recorrido InOrder: ");
        tree.inOrder(tree.root);
    }
}
