public class staticandinitial{
   //Static block
  static String aim="Zoho job";
    static{
        String name="Ananth";
        String std="I Am Study in Zoho GStudys";
        System.out.println("My name is: "+name);
        System.out.println(std);
       
        
    }
    //initializer block
    {
        System.out.println("My Aim is:"+aim);
    }
    
    public static void main(String args[]){
        //fist Static tha call agum
        System.out.println("hello world");

        //create object to acces initialize block
       staticandinitial obj=new staticandinitial();
       

    }
}