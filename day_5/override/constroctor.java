//question-2


package day_5.override;

class accesconstroctor1{
    String acces="Parent constructor";
    accesconstroctor1(){
        System.out.println("This is parent constructor: ");
    }
    
}
class accesconstroctor2 extends accesconstroctor1{
    accesconstroctor2(){
        super();
        System.out.println("child class");

        
    }
    accesconstroctor2(int a){
        System.out.println("age is: "+a);
    }
  
}
// constroctor ahh overload pannalam override panna mudiyathu
public class constroctor {
    public static void main(String[] args) {
        accesconstroctor2 obj=new accesconstroctor2();
        accesconstroctor2 obj1=new accesconstroctor2(21);
    }
}
