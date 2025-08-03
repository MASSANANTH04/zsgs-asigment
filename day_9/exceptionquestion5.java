package day_9;
//question-5
class chickfinalmethodcall{
     int chick(){
        try{
        int num1=10;
        int num2=2;
        int ans=num1/num2;
        return ans;
        }
        finally{
            System.out.println("Finally Block is Calling");
        }
    }
}
public class exceptionquestion5 {
    public static void main(String[] args) {
        chickfinalmethodcall obj=new chickfinalmethodcall();
        System.out.println("Answer is: "+obj.chick());
    }
}
