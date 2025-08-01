package vehical;

import java.util.ArrayList;



public class vehicalcarbike {
    public static void main(String[] args) {
        Audi car1=new Audi();
        Ford car2=new Ford();
        bajaj bike1=new bajaj();
        tvs bike2=new tvs();
        car1.audicar(16.3, 450000.54, 5000000.99, (byte)10,(byte)6,fueltype.diesel,"Audi Q7");
        car1.audidisplay(); 
        car2.Fordcar(15.4, 56434678.44, 6574938292.23, (byte)3, (byte)10, fueltype.petrol, "Ford Ecosport");
        car2.forddisplay();
        bike1.bajajbike(39.4, 2554489.98, (byte)2, (byte)6, cooling_type.oil, weeltype.alloys, 15.3);
        bike1.bajajdisplay();
        bike2.tvsjbike(55.4, 130000.3, (byte)1, (byte)4, cooling_type.air, weeltype.spokes, 9.3);
        bike2.tvsdisplay();

       
        
    }
}
