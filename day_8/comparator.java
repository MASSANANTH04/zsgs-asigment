
//question-2
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class studentdetails{
    String name;
    int age;
    double mark;
    studentdetails(String name,int age,double mark){
        this.name=name;
        this.age=age;
        this.mark=mark;
    }
}
class compareobject implements Comparator<studentdetails>{
    public int compare(studentdetails s,studentdetails t){
        return s.age-t.age;
    }
}
public class comparator {   
    public static void main(String[] args) {
        ArrayList <studentdetails> list=new ArrayList<>();
        list.add(new studentdetails("Ananth", 21, 89.7));
        list.add(new studentdetails("Karthik", 27, 90.5));
        list.add(new studentdetails("Esakki Arumugam", 19, 78.3));
        list.add(new studentdetails("Sri Rengan", 28, 89.3));
        Collections.sort(list,new compareobject());
        System.out.println("Age Sorting");
        for(studentdetails s:list){
            System.out.println("Student name: "+s.name+"\n Student age: "+s.age+"\n Mark :"+s.mark);
            System.out.println();
        }
        Collections.sort(list,(a,b)->a.name.compareTo(b.name));
        System.out.println("Name Sorting");
        for(studentdetails s:list){
            System.out.println("Student name: "+s.name+"\n Student age: "+s.age+"\n Mark :"+s.mark);
            System.out.println();
        }
        list.sort((a,b)->(int)a.mark-(int)b.mark);
        System.out.println("Mark sorting");
         for(studentdetails s:list){
            System.out.println("Student name: "+s.name+"\n Student age: "+s.age+"\n Mark :"+s.mark);
            System.out.println();
        }
   }
}
