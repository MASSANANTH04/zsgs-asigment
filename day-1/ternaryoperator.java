public class ternaryoperator {

    int maxnumber(int num1,int num2){
        int maxnum=num1>num2?num1:num2;
        return maxnum;
    }
    public static void main(String []args){
        //first method
        int number1=234;//min number
        int number2=327;//max number
        long maxinum_number=number1>number2?number1:number2; //using ternary number
        System.out.println("maxnume number is:"+maxinum_number); // max number is :327


        //secound method
        ternaryoperator object =new ternaryoperator();
        
        System.out.println("Max number is:"+object.maxnumber(20 ,90));


    }
    
}
