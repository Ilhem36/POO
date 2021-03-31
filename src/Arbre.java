import java.util.LinkedList;
import java.util.Queue;

public class Arbre {
    Node root;

    public Arbre() {
        this.root = null;
    }

    public Arbre(int key) {
        root = new Node(key);
    }

    // affichage de l'arbre :
    void printNodes(Node root, int start, int end) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        Node current = null;
        int level = 0;// le niveau
        // parcourir l'arbre
        while (!queue.isEmpty()) {// while list is not empty
            level++;
            int size = queue.size();
            while (size != 0) {
                current = queue.peek(); // on récupére le premier élément de la liste Queue sans le supprimer
                queue.poll(); // on le supprime dans ce cas
                if (level >= start && level <= end) {
                    System.out.println(current.key + " ");
                }
                if (current.left != null) {
                    queue.add(current.left);
                    // on ajoute le fils droit
                    queue.add(current.right);
                    size--;
                }// end of while
                if (level >= start && level <= end) {
                    System.out.println();


                }

            }


        }
    }
}
