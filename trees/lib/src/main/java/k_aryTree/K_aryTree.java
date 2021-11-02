package k_aryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class K_aryTree<T> {
    Node root=null;
    int nodesnum = 0;
    int K=0;


    public K_aryTree(int k) {
        if(k<=1)
            k=2;
        this.K = k;
    }

    public boolean isEmpty() {

        return root == null;
    }

    public boolean isNotEmpty(){
        return root != null;
    }

    public void add(T value){
        nodesnum++;
        Node newNode = new Node(value);
        if( isEmpty()){
            root = newNode;
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){

            Node currentNode = queue.poll();
            if(currentNode.children.size() < this.K){
                currentNode.addChild(newNode);
                return;
            }
            else {
                queue.addAll(currentNode.children);
            }
        }
    }

    public List<T> breadthFirstSearch(){
        List <T> kAryTree = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(isNotEmpty()){
            queue.add(root);
            while(!queue.isEmpty()){

                Node currentNode = queue.poll();
                kAryTree.add((T)currentNode.value);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return kAryTree;
    }


    public int getSize(){
        return nodesnum;
    }

    public static K_aryTree<String> fizzBuzzTree(K_aryTree<Integer> kTree){
        K_aryTree<String> outTree = new K_aryTree(kTree.K);

        Queue<Node> queue = new LinkedList<>();
        if(kTree.isNotEmpty()){
            queue.add(kTree.root);
            while(!queue.isEmpty()){

                Node<Integer> currentNode = queue.poll();

                String currentValue="";
                if(currentNode.value % 3 == 0 && currentNode.value % 5 ==0 )
                    currentValue = "FizzBuzz";
                else if(currentNode.value % 3 == 0)
                    currentValue="Fizz";
                else if(currentNode.value % 5 == 0)
                    currentValue="Buzz";
                else
                    currentValue=currentNode.value.toString();

                outTree.add(currentValue);

                if(! currentNode.children.isEmpty())
                    queue.addAll(currentNode.children);
            }
        }
        return outTree;
    }
}
