package vehical;

public class vechical{
    double mileage;
    double price;
    
}
enum fueltype{
        diesel,petrol;
    }
class car extends vechical{
    double ownership_cost;
    byte warrant;
    byte seating_capacity;
    fueltype type1;
    
}
enum cooling_type{
        air,liquid,oil;
    }  
    enum weeltype{
        alloys,spokes;

    }
class bike extends vechical{
    byte numberof_cylinder;
    byte numberof_gears;  
    cooling_type cool;
    weeltype weel;
    double fueltank_size;
}
class Audi extends car{
    String  modultype;
   void audicar(double mileage,double price,double ownership_cost,byte warrant,byte seating_capacity,fueltype type1 ,String modultype){
        this.mileage=mileage;
        this.price=price;
        this.ownership_cost=ownership_cost;
        this.warrant=warrant;
        this.seating_capacity=seating_capacity;
        this.type1=type1;
        this.modultype=modultype;
    }
    void audidisplay(){
        System.out.println("*******************************************************************");
        System.out.println("AUDI.................");
        System.out.println(" Car Mileage: "+mileage);
        System.out.println("Car Pricce: "+price);
        System.out.println("Owber Ship Cost: "+ownership_cost);
        System.out.println("Worrwnt per Year :"+warrant);
        System.out.println("Seating Cepacity :"+seating_capacity);
        System.out.println("Fuel Type : "+type1);
        System.out.println("*******************************************************************");
    }

}
class Ford extends car{
    String  modultype;
     void Fordcar(double mileage,double price,double ownership_cost,byte warrant,byte seating_capacity,fueltype type1 ,String modultype){
        this.mileage=mileage;
        this.price=price;
        this.ownership_cost=ownership_cost;
        this.warrant=warrant;
        this.seating_capacity=seating_capacity;
        this.type1=type1;
        this.modultype=modultype;
    }
    void forddisplay(){
        System.out.println("*******************************************************************");
        System.out.println("FORD................");
        System.out.println("Car Mileage: "+mileage);
        System.out.println("Car Pricce: "+price);
        System.out.println("Owber Ship Cost: "+ownership_cost);
        System.out.println("Worrwnt per Year :"+warrant);
        System.out.println("Seating Cepacity :"+seating_capacity);
        System.out.println("Fuel Type : "+type1);
        System.out.println("Modul: "+modultype);
        System.out.println("*******************************************************************");
    }
}
class bajaj extends bike{
   void bajajbike(double mileage,double price,byte numberof_cylinder,byte numberof_gears,cooling_type cool,weeltype weel,double fueltank_size){
    this.mileage=mileage;
    this.price=price;
    this.numberof_cylinder=numberof_cylinder;
    this.numberof_gears=numberof_gears;
    this.cool=cool;
    this.weel=weel;
    this.fueltank_size=fueltank_size;
   }
   void bajajdisplay(){
    System.out.println("*******************************************************************");
    System.out.println("Bajaj...................................");
    System.out.println("Milege :"+mileage);
    System.out.println("price: "+price);
    System.out.println("How Many Cylinder: "+numberof_cylinder);
    System.out.println("How Many Gears :"+numberof_gears);
    System.out.println("Engin Cooling Type: "+cool);
    System.out.println("Weel Type :"+weel);
    System.out.println("Fule Tank Size: "+fueltank_size);
    System.out.println("*******************************************************************");
   }
}
class tvs extends bike{
    void tvsjbike(double mileage,double price,byte numberof_cylinder,byte numberof_gears,cooling_type cool,weeltype weel,double fueltank_size){
    this.mileage=mileage;
    this.price=price;
    this.numberof_cylinder=numberof_cylinder;
    this.numberof_gears=numberof_gears;
    this.cool=cool;
    this.weel=weel;
    this.fueltank_size=fueltank_size;
   }
   void tvsdisplay(){
    System.out.println("*******************************************************************");
    System.out.println("TVS...........................");
    System.out.println("Milege :"+mileage);
    System.out.println("price: "+price);
    System.out.println("How Many Cylinder: "+numberof_cylinder);
    System.out.println("How Many Gears :"+numberof_gears);
    System.out.println("Engin Cooling Type: "+cool);
    System.out.println("Weel Type :"+weel);
    System.out.println("Fule Tank Size: "+fueltank_size);
    System.out.println("*******************************************************************");
   }
}
