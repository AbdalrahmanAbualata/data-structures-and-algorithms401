package stackAndQueue;
import stackAndQueue.AnimalShelterPackage.Animal;
import stackAndQueue.AnimalShelterPackage.Cat;
import stackAndQueue.AnimalShelterPackage.Dog;

public class AnimalShelter {
    public  Queue<Animal> animalQueue = new Queue<>();
    public void enqueue(Animal animal){
        animalQueue.enqueue(animal);
    }

    public Animal dequeue(String pref){
        if(!animalQueue.isEmpty()){
            Node currentNode = animalQueue.front;
            if( isItDog(pref, currentNode) || isItCat(pref,currentNode) ){
                return animalQueue.dequeue();
            }

            while(currentNode.next != null){

                if( isItDog(pref , currentNode.next) || isItCat(pref, currentNode.next)){
                    Node temp = currentNode.next;
                    currentNode.next = currentNode.next.next;
                    temp.next = null;
                    animalQueue.size -=1;
                    return (Animal) temp.value;
                }

                currentNode = currentNode.next;
            }
        }
        return null;
    }
    public boolean isItDog(String pref, Node node){
        return pref.equalsIgnoreCase("dog") && node.value instanceof Dog;
    }
    public boolean isItCat(String pref, Node node){
        return pref.equalsIgnoreCase("cat") && node.value instanceof Cat;
    }

    public int getSize(){
        return animalQueue.size;
    }


    @Override
    public String toString() {
        return  animalQueue.toString() ;
    }
}