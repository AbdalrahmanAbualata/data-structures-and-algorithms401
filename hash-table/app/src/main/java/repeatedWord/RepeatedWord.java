package repeatedWord;

import hash.table.Hashtable;

public class RepeatedWord {


    public static void main(String[] args) {
        String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        String test2="Once upon a time, there was a brave princess who...";
        String test3="It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        System.out.println(getFirstRepeatedWord(test));
        System.out.println(getFirstRepeatedWord(test2));
        System.out.println(getFirstRepeatedWord(test3));
    }

    public static String getFirstRepeatedWord(String book){
        Hashtable<Integer> dictionary = new Hashtable<>();
        book = book.toLowerCase();
        String[] words = book.split("(\\s+)|(,\\s*)");
        for (String word : words){
            if( dictionary.contains(word))
                return word;
            else
                dictionary.add(word,1);
        }
        return null;
    }




    // code challenge 34
    public static boolean uniqueCaracters(String string){
        Hashtable<Integer> dictionary = new Hashtable<>();
        string = string.toLowerCase();
        String[] words = string.split("(\\s+)|(,\\s*)");
        for (String word : words){
            if( dictionary.contains(word))
                return false;
            else
                dictionary.add(word,1);
        }
        return true;
    }
}
