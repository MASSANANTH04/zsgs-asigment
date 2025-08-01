//question-2

package day_5.override;
class private1{
    private void acces(){
        String name="Ananth";
        int age=21;
    }
}
class private2 extends private1{
   private void acces(){
        String name="No Acces private method";
        System.out.println(name);
        // super.acces();
    }

}
//private method visible within a class,, 
//not override private methodl

public class privatemethodoveride{
    public static void main(String[] args) {
        private2 obj=new private2();
        // obj.acces();

    }
}
