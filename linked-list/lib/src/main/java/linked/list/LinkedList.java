package linked.list;

public class LinkedList<T> {
    Node head = null;

    public void  insert (T value){ // add at the first of the linkedList
        Node<T> newNode = new Node<T> (value);
        newNode.next =head ;
        head=newNode;
    }

    public boolean includes(T value) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }


    @Override public String toString() {
        String output = "";
        Node currentNode = head;
        while (currentNode != null) {

            output +=" { "+currentNode.value+" } --> ";

            currentNode = currentNode.next;
        }
        output += "NULL";
        return output;
    }
}

