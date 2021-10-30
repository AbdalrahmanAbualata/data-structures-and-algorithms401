package trees;

public class BinarySearchTree<T> extends BinaryTree{
    @Override
    public void add(Object value) {
        numOfNodes++;
        Node newNode = new Node(value);
        if(isNotEmpty()){
            Node current = root;
            try{
                while(current != null){
                    if(  (int) value <= (int) current.value  ){
                        if(current.left == null){
                            current.left = newNode;
                            return;
                        }
                        current = current.left;
                    }
                    else{
                        if(current.right == null){
                            current.right = newNode;
                            return;
                        }
                        current = current.right;
                    }
                }
            }
            catch (ClassCastException e){
                System.out.println("error.. search tree must be on Integers values only\n"+e.getMessage());
                numOfNodes--;
                return;
            }
        }
        root = newNode;
    }

    public boolean contains(T value){
        if(isNotEmpty()){
            Node current = root;
            try{
                while(current != null){
                    if((int) value == (int) current.value)
                        return true;
                    if(  (int) value < (int) current.value  ){
                        current = current.left;
                    }
                    else{
                        current = current.right;
                    }
                }
            }
            catch (ClassCastException e){
                System.out.println("error.. search tree must be on Integers values only\n"+e.getMessage());
                numOfNodes--;
                return false;
            }
        }
        return false;
    }
}
