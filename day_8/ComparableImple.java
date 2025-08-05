
import java.util.ArrayList;
import java.util.Collections;
//question-3
class student implements Comparable<student>{
    String name;
    int age;
    int classno;
    student(String name,int age,int classno){
        this.name=name;
        this.age=age;
        this.classno=classno;
    }
    public int compareTo(student o){
       return this.name.compareTo(o.name);
    }

}
public class ComparableImple {
    public static void main(String[] args) {
    ArrayList <student> studentdeatiles=new ArrayList<>();
    studentdeatiles.add(new student("viji", 11, 4));
    studentdeatiles.add(new student("ananth", 5, 1));
    studentdeatiles.add(new student("karthik", 27, 12));
    studentdeatiles.add(new student("arumugam", 16, 11));
    Collections.sort(studentdeatiles);
    System.out.println("Name Sort");
    System.out.println();
    for(student s:studentdeatiles){
        System.out.println("NAME :"+s.name+"\nAGE: "+s.age+"\nClASS: "+s.classno);
        System.out.println();
    }


    }
}
