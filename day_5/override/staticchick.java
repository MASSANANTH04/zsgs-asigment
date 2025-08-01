//question-2



package day_5.override;

class static1{
    static void fixed(){
        String name="Ananth";
        String gmailid="asananth04@gmail.com";
        System.out.println(name);
        System.out.println(gmailid);
    }
}
class static2 extends static1{
    static void fixed(){
        String name ="not change";
        String gmailid=" not Chaing";
          System.out.println(name);
        System.out.println(gmailid);
    }
}
  //static method can not overide 
public class staticchick {
    public static void main(String[] args) {
        static1.fixed();
        static2.fixed();
    }
}
