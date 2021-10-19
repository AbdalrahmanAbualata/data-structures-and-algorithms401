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
            currentNode.next = newNode;
            size++;
        }
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
    //***************************************************************************************
    //    code challenge 08
    public static LinkedList zipLists(LinkedList linkedList1, LinkedList linkedList2){
        if (linkedList1.getSize() == 0) return linkedList2;
        if (linkedList2.getSize() == 0) return linkedList1;

        int numOfIterations = getLargerSize( linkedList1.getSize(), linkedList2.getSize());
        LinkedList zipeddList = new LinkedList();
        Node current1 = linkedList1.head;
        Node current2 = linkedList2.head;
        for(int i =0 ; i < numOfIterations; i++){
            if(current1 != null){
                zipeddList.append(current1.value);
                current1=current1.next;
            }
            if(current2 != null){
                zipeddList.append(current2.value);
                current2=current2.next;
            }
        }
        return zipeddList;
    }

    private static int getLargerSize(int size1, int size2){
        if(size1 >= size2)
            return size1;
        else
            return size2;
    }

}

