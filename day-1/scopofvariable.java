public class scopofvariable{
    //static variable
     static {
        String name="Ananth";
        System.out.println("My name is:"+name);
}
     //instance variable
     int age=10;
     {
      
      System.out.println("----------------------------");
     }

        public static void main(String[] args){
 
        //instance variable acces crating object to acces
        scopofvariable obj=new scopofvariable();
        System.out.println("My age is:"+obj.age);
        //local variable;
        int mark1=89, mark2=90,mark3=89,mark4=78;
        float total=mark1+mark2+mark3+mark4;
        System.out.println("Average mark:"+total/4);
        //final variable
        final String Schoolname="S.S.V.Hr Sec School";
       // mymarkis=20; //can not change value;
        System.out.println("Scohool name:"+Schoolname);
        //bloac level vareiable
        {
            String welcome="Thank You Student";
            System.out.println(welcome);//access this block
        }
        //System.out.println(welcome);   //do not access 


        

    }
}