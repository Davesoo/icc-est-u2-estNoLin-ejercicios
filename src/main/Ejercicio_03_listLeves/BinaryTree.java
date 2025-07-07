package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public void insert (int value) {
        root = insertRec(root, value);
    }

    public Node insertRec(Node aux, int value){
        if (aux == null){
            return new Node(value);
        }

        if (value < aux.value){
            aux.left = insertRec(aux.left, value);
        }else if( value > aux.value){
            aux.right = insertRec(aux.right, value);
        }

        return aux;
    }

    public List<LinkedList<Integer>> listLevels(Node root) {
        List<LinkedList<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> auxLevel = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                Node node = queue.poll();
                auxLevel.add(node.value);

                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }

            result.add(auxLevel);
        }

        return result;
    }
}
