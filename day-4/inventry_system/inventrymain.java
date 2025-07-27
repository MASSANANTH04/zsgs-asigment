package inventry_system;


public class inventrymain {
 public static void main(String[] args) {
    store a=new store("Ananth","Tenkasi");
    a.displaystoredeatials();
    product p=new product(101, "Book", 899, 4);
    product p2=new product(102, "Pencil", 100, 20);
    product p3=new product(103, "pen", 10, 10);
    a.addproduct(p);
    a.addproduct(p2);
    a.addproduct(p3);
    a.displayAllproduct();
    
 }
}
