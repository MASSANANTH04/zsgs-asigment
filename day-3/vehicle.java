public class vehicle {
    private String vehicalname;
    private int number;
    private String brand;
    private int price;
    private   static int count=0;
    private int vehiclecound;
     vehicle(String vname,String brand,int price,int number){
        count++;
        vehicalname=vname;
        this.brand=brand;
        this.price=price;
        this.number=number;
        vehiclecound=count;
    }
    void display(){
        System.out.println(vehiclecound+" St Vehical");
        System.out.println("Vehical Name: "+vehicalname);
        System.out.println("Brand: "+brand);
        System.out.println("Vehical Price: "+price);
        System.out.println("Vehical number: "+number);
    }
    int count(){
        return count;
    }
    public static void main(String args[]){
        vehicle v1=new vehicle("R15 V4","YAMAHA" , 230000, 69080);
        vehicle v2=new vehicle("GT","ROYAL ENFIDENT",400000,3003);
        vehicle v3=new vehicle("MT","YAMAHA",240000,2134);
        System.out.println("----------------------------------------------------");
        v1.display();
        System.out.println("----------------------------------------------------");
        v2.display();
        System.out.println("----------------------------------------------------");
        v3.display();
        System.out.println("-----------------------------------------------------");
        System.out.println("**************************************************");
        System.out.println("Create vehical:"+v1.count);
        System.out.println("**************************************************");
    }
    
}
