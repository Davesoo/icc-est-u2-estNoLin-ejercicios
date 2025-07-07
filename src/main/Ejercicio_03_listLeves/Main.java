package main.Ejercicio_03_listLeves;

import java.util.LinkedList;
import java.util.List;

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

        List<LinkedList<Integer>> niveles = tree.listLevels(tree.root);

        int nivel = 1;

        System.out.println("Ejercicio 03: Listar los niveles de un árbol binario de búsqueda");
        for (LinkedList<Integer> lista : niveles) {
            System.out.print("Nivel " + nivel +  ": ");
            for (int value : lista) {
                System.out.print(value);
                if (value < lista.getLast()) {
                    System.out.print(" -> ");
                }
            }
            System.out.println(" ");
            nivel++;
        }
    }
}
