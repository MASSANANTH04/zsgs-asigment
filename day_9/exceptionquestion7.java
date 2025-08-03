package day_9;
//question-7
class chick{
    void method3(){
        System.out.println("First process");
        int a=20;
        int b=0;
       int ans =a/b;

    }
    void method2(){
        method3();
        
    }
    void method1()throws ArithmeticException{
        try{
        method2();
        }
        catch(ArithmeticException h){
            System.out.println("Divided by zero....");
        }
    }
}
public class exceptionquestion7 {
    public static void main(String[] args) {
        chick obj=new chick();
        obj.method1();
    }
}
