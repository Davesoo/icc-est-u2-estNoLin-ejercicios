package main.Ejercicio_01_insert;

public class BinaryTreeSearch {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec (Node aux, int value){
        
        if (aux == null){
            return new Node(value);
        }

        if (value < aux.value) {
            aux.left = insertRec(aux.left, value);
        } else if (value > aux.value) {
            aux.rigth = insertRec(aux.rigth, value);
        }

        return aux;
    }

    public void inOrder(Node node){
        if (node != null){
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.rigth);
        }
    }
} 