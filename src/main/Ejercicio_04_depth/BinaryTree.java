package main.Ejercicio_04_depth;

public class BinaryTree {
    Node root;

    public void insert(int value) {
        root = insertRec(root, value);
    }

    private Node insertRec(Node aux, int value) {
        if (aux == null) {
            return new Node(value);
        }

        if (value < aux.value) {
            aux.left = insertRec(aux.left, value);
        } else if (value > aux.value) {
            aux.right = insertRec(aux.right, value);
        }
        return aux;
    }

    public int maxDepth(Node node) {
        if (node == null) {
            return 0;
        }

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
