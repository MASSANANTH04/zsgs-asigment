//question-6
class student1{
    String name;
    static void changename(student1 s){
    s.name="Ananth";
}
}
public class passbyvalue {
   void changeage(int age){
    age=80;
    
    }
    public static void main(String[] args) {
        passbyvalue obj1=new passbyvalue();
        int age=10;
        obj1.changeage(age);
        student1 obj2=new student1();
        System.out.println("Age: "+age);
        obj2.name="Sri Rengan";
        System.out.println(obj2.name);
        student1.changename(obj2);
        System.out.println(obj2.name);

    }
}
