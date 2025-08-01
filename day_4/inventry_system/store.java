package inventry_system;



import java.util.ArrayList;

public class store {
    static String storename;
    static String location;
    store(String storename,String location){
    this.storename=storename;
    this.location=location;
   }
   ArrayList <product> list=new ArrayList<>();
  public void displaystoredeatials(){
    System.out.println("---------------------------------------");
    System.out.println("Store Name: "+storename);
    System.out.println("Location :"+location);
    System.out.println("---------------------------------------");
    
   }
   public void  addproduct(product adding){
    list.add(adding);
   }
   public void displayAllproduct(){
    for(product o:list){
      o.productdisplay();
    }
   }
    }

