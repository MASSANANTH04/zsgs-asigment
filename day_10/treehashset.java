//question-4
package day_10;

import java.util.List;
import java.util.TreeSet;
import java.util.Iterator;

public class treehashset {
    public static void main(String[] args) {
        //a. create a new tree set, add some colours (string) and print out the tree set.
        TreeSet <String> color=new TreeSet<>(List.of("Green","Yellow","Blue","Red","Orange"));
        System.out.print("a): "+color);
        System.out.println();
        //b. iterate through all elements in a tree set.
        Iterator <String> sort=color.iterator();
        System.out.print("b) :");
        while(sort.hasNext()){
            System.out.print(sort.next()+",");
        }
        System.out.println();
        //c. add all the elements of a specified tree set to another tree set.
        TreeSet <String> color2=new TreeSet<>(color);
        System.out.println("c) :"+color2);
        //d. create a reverse order view of the elements contained in a given tree set.
        Iterator <String> reverse=color.descendingIterator();
        System.out.print("d) :");
        while(reverse.hasNext()){
            System.out.print(reverse.next()+",");
        }
        System.out.println();
        //e. get the first and last elements in a tree set.
        System.out.print("e) :");
        System.out.print("First element: "+color.first()+",");
        System.out.print("Last Element: "+color.last());
        System.out.println();
        //f. clone a tree set list to another tree set.
        TreeSet <String> clone=(TreeSet<String>)color.clone();
        System.out.println("F): "+clone);
        //g. get the number of elements in a tree set.
        System.out.println("g) : Number Of Element :"+color.size());
        //h. compare two tree sets.
        TreeSet <Integer> a1=new TreeSet<>(List.of(32,33,11,3,22,11,23,32));
        TreeSet <Integer> a2=new TreeSet<>(List.of(232,33,11,3,22,11,23,32));
        System.out.println("h): "+a1.equals(a2));   


        //Create a TreeSet that stores a set of numbers,   

        //i. find the numbers less than 7 in a tree set.
        TreeSet <Integer> chick=new TreeSet<>(List.of(23,21,34,1,3,22,9,3,7,4));
        System.out.println(chick);
        System.out.println("i) :"+chick.headSet(7));
        //j. get the element in a tree set which is greater than or equal to the given element.
        System.out.println("j): "+chick.ceiling(8));
        //k. get the element in a tree set which is less than or equal to the given element.
        System.out.println("k): "+chick.floor(28));
        //l. get the element in a tree set which is strictly greater than or equal to the given element.
        System.out.println("l) :"+chick.higher(21));
        //m. get an element in a tree set which is strictly less than the given element.
        System.out.println("m): "+chick.lower(5));
        //n. retrieve and remove the first element of a tree set.
        chick.pollFirst();
        System.out.println("n): "+chick);
        //o. retrieve and remove the last element of a tree set.
        chick.pollLast();
        System.out.println("o) :"+chick);
        //p. remove a given element from a tree set.
        chick.clear();
        System.out.println("p): "+chick);
    }
}
