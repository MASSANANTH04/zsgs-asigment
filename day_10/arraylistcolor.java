 package day_10;
//question-1
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;
public class arraylistcolor {
    public static void main(String[] args) {
        ArrayList <String> color=new ArrayList<>();
        color.add("Blue");
        color.add("Green");
        color.add("Red");
        color.add("Yellow");
        color.add("Orange");
       ListIterator <String> s1=color.listIterator();
       System.out.println("b) List iterate Using");
       System.out.println("**** ******* *****");
       
       while (s1.hasNext()) {
        System.out.print(s1.next()+",");
       }
       color.add(0,"Black");
       System.out.println();
       System.out.println("c) First Element adding ");
       System.out.println("***** ******* ******");
       color.forEach((x)->{
        System.out.print(x+",");
       });
        System.out.println();
        System.out.println("d) Intex specified");
        System.out.println("***** *********");
        System.out.println(color.get(2));
        color.set(0, "White");
        System.out.println("e) Update");
        System.out.println("******");
        System.out.print(color);
        System.out.println();
        System.out.println("f) Remove Element");
        System.out.println("****** *******");
        color.remove(2);
        System.out.println(color);
        System.out.println("g) Search Element");
        System.out.println("****** *******");
        System.out.println("Creen is Search: "+color.contains("Green"));
        System.out.println("h) sort arrayList");
        System.out.println(" *****************");
       Collections.sort(color);
       System.out.println(color);
       ArrayList <String>color2=new ArrayList<>();
       color2.addAll(color);
       System.out.println("i) to copy one array list into another");
       System.out.println("**************************************");
       System.out.println(color2);
       System.out.println("j) Shuffle element");
       Collections.shuffle(color2);
       System.out.println(color2);
    }
}
