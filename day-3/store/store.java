package store;

public class store {
    int prodictid;
    String prodictname;
    int price;
    int quentity;
   

     public void prodictdeatials(int prodictid,String prodictname,int price,int quentity){
         this.prodictid=prodictid;
         this.prodictname=prodictname;
         this.price=price;
         this.quentity=quentity;    
     
    }
    public void display(){
        System.out.println("prodict Id: "+prodictid);
        System.out.println("Prodect name : "+prodictname);
        System.out.println("price: "+price);
        System.out.println("Quentity: "+quentity);
        System.out.println("--------------------------------------------------");
    }

  
}
