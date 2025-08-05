//question-1

class singlelen{
    static singlelen singlelenobj=null;
    private singlelen(){

    }
    public static singlelen createsinglenenclass(){
        if(singlelenobj==null)
        singlelenobj=new singlelen();
        return singlelenobj;
    }
}
class check{
   static void chicking(){
        singlelen obj3=singlelen.createsinglenenclass();
        System.out.println(obj3);
        
    }
}
public class singlelenclass {
    public static void main(String[] args) {
        singlelen obj1=singlelen.createsinglenenclass();
        singlelen obj2=singlelen.createsinglenenclass();
        if(obj1==obj2){
            System.out.println(obj1);//same reference
            System.out.println(obj2);
        }
        check.chicking();   //same reference
    }
}
