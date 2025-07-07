package main.Ejercicio_02_invert;

public class BinaryTree {
    Node root;

    public void insert (int value){
        root = insertRec(root, value);
    }

    public Node insertRec (Node aux, int value){

        if (aux == null){
            return new Node(value);
        }

        if (value < aux.value){
            aux.left = insertRec(aux.left, value);
        }else if(value > aux.value){
            aux.right = insertRec(aux.right, value);
        }

        return aux;
    }

    public Node invertTree(Node node) {
        if (node == null) return null;

        Node temp = node.left;
        node.left = invertTree(node.right);
        node.right = invertTree(temp);

        return node;
    }

    public void inOrder(Node node){
        if (node != null){
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }


}
