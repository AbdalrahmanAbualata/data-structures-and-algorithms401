package k_aryTree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    T value;
    List<Node> children = new ArrayList<>();

    public Node(T value) {
        this.value = value;
    }


    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        this.children.add(child);
    }

}
