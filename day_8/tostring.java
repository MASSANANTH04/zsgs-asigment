


//question-7
class ananth{
    String name;
    int age;
    String address;
    double height;
    ananth(String name,int age,String address,double height){
        this.name=name;
        this.age=age;
        this.address=address;
        this.height=height;
    }
    public String toString(){
        return "Strudent name: "+name+ "|| Age: "+age+"|| Height :"+height+ "|| Address: "+address;
    }
}

public class tostring {
    public static void main(String[] args) {
        ananth obj=new ananth("Sri Rengan", 21, "22 main Road", 172.9);
        ananth obj2=new ananth("Pon Malar", 18, "190 mano ranjitha Street ", 145.2);
        System.out.println(obj.toString());
        System.out.println(obj2);
        
    }
}
