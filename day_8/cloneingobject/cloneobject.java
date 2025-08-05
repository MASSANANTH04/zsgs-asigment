//questin-8
//shallow copy
package cloneingobject;
class Studentss{
    String name;
    int rollno;
    String department;
   
    Studentss(String name,int rollno ,String department){
        this.name=name;
        this.rollno=rollno;
        this.department=department;
    }
}
class department implements Cloneable{
    Studentss s;
    department(Studentss s){
       
        this.s=s;
       
    }
    void display(){
        System.out.println("Name: "+s.name);
        System.out.println("Rollno: "+s.rollno);
        System.out.println("Department: "+s.department);
        
    }
    protected Object clone(){
        try{
        return (department)super.clone();
        }
        catch(CloneNotSupportedException c){
            return null;
        }
    }
}


public class cloneobject {
    public static void main(String[] args) {
    Studentss obj=new Studentss("Ananth", 22661,"BCA");
    department d1=new department( obj);
    department d2=(department)d1.clone();
    d2.s.name="kavin";
    d2.s.rollno=12;
    d1.display();
    d2.display();
    }
}
