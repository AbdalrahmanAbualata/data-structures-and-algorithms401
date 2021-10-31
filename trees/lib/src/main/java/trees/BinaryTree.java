package trees;
import java.util.*;

public class BinaryTree <T>{
    Node root=null;
    int numOfNodes = 0;

    public boolean isEmpty() {
        return root == null;
    }

    public boolean isNotEmpty(){
        return root != null;
    }

    public void add(T value){
        numOfNodes++;
        Node newNode = new Node(value);
        if( this.isEmpty()){
            root = newNode;
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node currentNode = queue.poll(); // represent the root every time

            if(currentNode.left == null){
                currentNode.left = newNode;
                return;
            }
            if(currentNode.right == null){
                currentNode.right = newNode;
                return;
            }
            queue.add(currentNode.left);
            queue.add(currentNode.right);

        }
    }


    public List<T> preOrder(Node root){
        List <T> tree = new ArrayList<>();
        if(!isEmpty()){
            tree.add((T) root.value);
            if(root.left != null)
                tree.addAll(preOrder(root.left));
            if(root.right != null)
                tree.addAll(preOrder(root.right));
        }
        return tree;
    }

    public List<T> inOrder(Node root){
        List <T> tree = new ArrayList<>();
        if(!isEmpty()){

            if(root.left != null)
                tree.addAll(inOrder(root.left));

            tree.add((T) root.value);

            if(root.right != null)
                tree.addAll(inOrder(root.right));
        }
        return tree;
    }
    public List<T> postOrder(Node root){
        List <T> tree = new ArrayList<>();

        if(!isEmpty()){

            if(root.left != null)
                tree.addAll(postOrder(root.left));

            if(root.right != null)
                tree.addAll(postOrder(root.right));

            tree.add((T) root.value);
        }
        return tree;
    }
    public int findMaximumValue(Node root){
//       return (int) Collections.max(this.postOrder(root)); use the array list with build in methods
        if(this.isNotEmpty()){
            int max =(int) root.value;
            int left = max;
            int right = max;

            if(root.left == null && root.right == null)
                return (int) root.value;
            if(root.left != null)
                left = findMaximumValue(root.left);
            if(root.right != null)
                right = findMaximumValue(root.right);
            if( left > max)
                max = left;
            if(right > max)
                max = right;
            return max;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                " root=" + root +
                "numOfNodes=" + numOfNodes +
                '}';
    }
}
