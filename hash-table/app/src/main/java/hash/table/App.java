/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hash.table;
import repeatedWord.RepeatedWord;
import treeIntersection.TreeIntersection;
import trees.BinaryTree;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Hashtable<Integer> ids = new Hashtable();

        ids.add("Mohamad",11);
        ids.add("Mohamad",15);
        ids.add("Mohamad2",11);
        ids.add("Yaser",22);
        ids.add("cdd",33);
        ids.add("abc",44);
        System.out.println(ids.toString());
        System.out.println(ids.get("Mohammad"));
        System.out.println(ids.get("Mohamad"));
        System.out.println(ids.get("Mohamad2"));
        System.out.println(ids.get("Yaser"));



        BinaryTree<Integer> tree1 = new BinaryTree();
        BinaryTree<Integer> tree2 = new BinaryTree();
        TreeIntersection treeIntersection = new TreeIntersection();

        tree1.add(3);
        tree1.add(5);
        tree1.add(7);
        tree1.add(2);
        tree1.add(9);
        tree1.add(6);
        tree1.add(4);
        tree1.add(1);


        tree2.add(3);
        tree2.add(5);
        tree2.add(7);
        tree2.add(2);
        tree2.add(9);
        tree2.add(6);
        tree2.add(4);
        tree2.add(1);
        tree2.add(11);



        System.out.println(treeIntersection.findCommonValuesInTwoBinaryTrees(tree1,tree2));



        // code challenge 33

        Hashtable hash1 = new Hashtable();
        Hashtable hash2 = new Hashtable();

        hash1.add("found","enamored");
        hash1.add("wrath","anger");
        hash1.add("diligent","employed");
        hash1.add("outift","guard");
        hash1.add("guide","usher");

        hash2.add("found","averse");
        hash2.add("wrath","delight");
        hash2.add("diligent","idle");
        hash2.add("flow","jam");
        hash2.add("guide","follow");

        System.out.println(hash1.leftJoin(hash2));

String test = "I love cats";
        System.out.println(RepeatedWord.uniqueCaracters(test));
    }
}
