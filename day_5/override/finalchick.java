//question-2



package day_5.override;
class final1{
    final void chick(){
        int num1=10;
        int num2=90;
        int ans=num1+num2;
        System.out.println("Answer is :"+ans);
    }
}
class final2 extends final1{
    // final void chick(){
    //     System.out.println("noo");   //final method not override
    // }
}
//can not overide final method and variable

public class finalchick {
    final1 obj =new final1();
}
