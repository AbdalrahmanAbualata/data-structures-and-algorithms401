package linked.list;

public class LinkedList<T> {
    Node head = null;
    private int size =0;

    public void  insert (T value){ // add at the first of the linkedList
        Node<T> newNode = new Node<T> (value);
        newNode.next =head ;
        head=newNode;
        size++;
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
    public void append(T value) {
        Node currentNode = head;
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            size++;
        }else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
        }
        currentNode.next = newNode;
        size++;
    }


    public void insertBefore(T value, T newVal) {
        if (head == null) {
            System.out.println("The value " + value + " is not exist!");

        } else if (head.value == value) {
            this.insert(newVal);

        }else  {

            Node currentNode = head;

            while (currentNode.next != null) {
                if (currentNode.next.value == value) {
                    Node newNode = new Node(newVal);
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    size++;
                    return;
                }
                currentNode = currentNode.next;
            }
            System.out.println("The value " + value + " is not exist!");
        }
    }

    public void insertAfter(T value, T newVal) {
        if (head == null) {
            System.out.println("The value " + value + " is not exist!");
        }else {
            Node currentNode = head;
            while (currentNode != null) {
                if (currentNode.value == value) {
                    Node newNode = new Node(newVal);
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    size++;
                    return;
                }
                currentNode = currentNode.next;
            }

            System.out.println("The value " + value + " is not exist!");
        }
    }

//********************************************************************************************
//    code challenge 07
// size proparatie added to the linkedlist class

    public int getSize() {
        return size;
    }
    public int kthFromEnd(int k){
        System.out.println("the size of the Linkedlist ="+getSize());
        int index = this.size - k;
        if(k<0){
            System.out.println("K must be positive number");
            return -1;
        }else if (index > 0 ){
            Node currentNode = this.head;
            int count = 1;
            while(count!=index){
                currentNode = currentNode.next;
                count++;
            }
            return (int) currentNode.value;
        }
        else{
            System.out.println("K is larger than or equal the size of linked list..");
            return -1;
        }
    }
}

