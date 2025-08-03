package day_9;
//question-3
public class exceptionquestion3 {
    public static void main(String[] args) {
       try{
        Class.forName("ananth");
       }
       catch(ClassNotFoundException e){
        System.out.println("This Class Not Found..");
       }


    }
}
