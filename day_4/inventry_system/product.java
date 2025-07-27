package inventry_system;

public class product {
    int productid;
    String name;
    int price;
    int quentity;
    product(int productid,String name,int price,int quentity){
        this.productid=productid;
        this.name=name;
        this.price=price;
        this.quentity=quentity;
    }
   void productdisplay(){
        System.out.println("************************************");
        System.out.println("Product id: "+productid);
        System.out.println("Name :"+name);
        System.out.println("price: "+price);
        System.out.println("Quentity: "+quentity);
        System.out.println("************************************");
    }
}
