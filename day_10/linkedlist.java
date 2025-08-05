//question-2
package day_10;
import java.util.LinkedList;
import java.util.ListIterator;



import java.util.Collections;
import java.util.Iterator;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList <String>list=new LinkedList<>();
        list.add("Karthik");
        list.add("Ragupathi");
        list.add("Esakki Arumugam");
        list.add("Sri");
        list.add("Makesh");
        System.out.println("b.) iterate through all elements in a linked list.");
        System.out.println("**************************************************");
        ListIterator <String> s=list.listIterator();
        while(s.hasNext()){
            System.out.print(s.next()+",");
        }
        System.out.println("");
        System.out.println("c.) iterate through all elements in a linked list starting at the specified position.");
        System.out.println("*******************************************************************************************");
        ListIterator <String> a=list.listIterator(1);
        while(a.hasNext()){
            System.out.print(a.next()+",");
        }
         System.out.println("");
        System.out.println("d.) iterate a linked list in reverse order.");
        System.out.println("*********************************************");
        Iterator <String> rev=list.descendingIterator();
        while (rev.hasNext()) {
            System.out.print(rev.next()+",");
        }
         System.out.println("");
        System.out.println("e.) iterate a linked list in reverse order.");
        System.out.println("*********************************************");
        list.add(2,"Ananth");
        list.forEach((ans)->{
            System.out.print(ans+",");
        });
         System.out.println("");
        System.out.println("f.) insert elements into the linked list at the first and last position.");
        System.out.println("***************************************************************************");
        list.addFirst("Pon Malar");
        list.addLast("Mani Barathi");
        list.forEach((c)->{
            System.out.print(c+",");
        });
         System.out.println("");
        System.out.println("g.) insert the specified element at the front of a linked list.");
        System.out.println("***************************************************************");
        list.offerFirst("Firtadd");
        list.forEach(f->System.out.print(f+","));
         System.out.println("");
        System.out.println("h.) insert the specified element at the end of a linked list.");
        System.out.println("***************************************************************");
        list.offerLast("Lastadd");
        list.forEach(m->System.out.print(m+","));
         System.out.println("");
        System.out.println("i. insert some elements at the specified position into a linked list.");
        System.out.println("***************************************************************");
        LinkedList <String> bike=new LinkedList<>();
        bike.add("Tvs");
        bike.add("Yamaha");
        bike.add("Ktm");
        bike.addAll(3,list);
        bike.forEach(aa->System.out.print(aa+","));
         System.out.println("");
         System.out.println("j.) get the first and last occurrence of the specified elements in a linked list.");
         System.out.println("************************************************************************************");
         System.out.println("First Element: "+list.peekFirst());
         System.out.println("Last Element: "+list.peekLast());
    }
}
