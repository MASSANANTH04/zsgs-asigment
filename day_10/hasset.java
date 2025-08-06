//question-3
package day_10;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import day_7.ticketbooking.booking;
public class hasset {
    public static void main(String[] args) {
        HashSet <Integer> hs=new HashSet<>();
        // a. append the specified element to the end of a hash set.
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println("a) :"+hs);
        //b. iterate through all elements in a hash list.
        Iterator <Integer> print=hs.iterator();
        
        while(print.hasNext()){
            System.out.print(print.next()+" ,");
        }
        System.out.println();
        //c. get the number of elements in a hash set
        System.out.println("c) :"+hs.size());
        //d. empty the hash set.

        hs.clear();
        System.out.println("d) :"+hs);
        //e. test a hash set is empty or not.
        System.out.println("e) :"+hs.isEmpty());
        //f. clone a hash set to another hash set.
        HashSet <Integer> hs2=new HashSet<>();
        hs2.add(100);
        hs2.add(200);
        hs2.add(300);
        hs2.add(400);
        hs.addAll(hs2);
        System.out.println("f) :"+hs);
        //g. convert a hash set to an array.
        Integer []array=hs.toArray(new Integer[0]);
        System.out.println("g) :"+Arrays.toString(array));
        //h. convert a hash set to a tree set.
        TreeSet <Integer> change=new TreeSet<>(hs);
        System.out.println("h) :"+change);
        //i. convert a hash set to a List/ArrayList.
        ArrayList <Integer> arraylist=new ArrayList<>(hs);
        System.out.println("i) :"+arraylist);
        //j. compare two hash set.
        HashSet <String> s1=new HashSet<>(List.of("Ananth","Arun","Karthi"+"mani"));
        HashSet <String> s2=new HashSet<>(List.of("Ananth","Arun","Karthi"+"mani"));
        boolean ans=s1.equals(s2);
        System.out.println("j) :"+ans);

        
    }
}
