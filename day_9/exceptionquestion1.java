package day_9;
//question-1
public class exceptionquestion1 {
    public static void main(String[] args) {
        int arr[]={2,5,1,4,0,7};
        int ans=0;
        try{
         ans=arr[7]/arr[4];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Intex low please chek the index");
        }
        catch(ArithmeticException e){
            System.out.println("Zero not divide any number"+e);
        }
        catch(Exception e){
            System.out.println("Please chick code");
        }

    
    }
}
