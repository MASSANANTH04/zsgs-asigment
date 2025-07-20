class firstclass{
    String state="Tamil Nadu";
    String name="Ananth";
    void yourstate(){
        System.out.println("your name is: "+name);
        System.out.println("your state: "+state);
    }
}
    class secclass extends firstclass{
         String state="Tamil Nadu";
    String name="Ananth";
    void hello(){
        System.out.println("your name is: "+name);
        System.out.println("your state: "+state);
        
    }
}
class third extends secclass{

}
public class objectquestion10 {
public static void main(String[] args){
System.out.println("object create firstclass");
         //first class
firstclass one=new firstclass();
System.out.println(one instanceof firstclass);   //true
System.out.println(one instanceof secclass);     //false
System.out.println(one instanceof third);        //false

System.out.println("object create secclass");
            //sec class
secclass two =new secclass();
System.out.println(two instanceof firstclass);  //true
System.out.println(two instanceof secclass);   //true
System.out.println(two instanceof third);      //false

System.out.println("object create in third class");
third third3=new third();
             //third class
System.out.println(third3 instanceof firstclass);  //true
System.out.println(third3 instanceof secclass);    //true
System.out.println(third3 instanceof third);       //true




}
}
