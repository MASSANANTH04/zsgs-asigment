
public class empformat {
    String name;
    int year;
    String address;
     empformat( String name,int year,String address){
       this.name=name;
       this.year=year;
       this.address=address;
    }
    void display(){
        System.out.print("\n"+name+"\t\t\t"+year+"\t\t\t\t"+address);
       
    }
    void format(){
        System.out.println("*******************************************************************************************");
        System.out.println("Name \t\t\t year of joinning \t\t\t Address");
        System.out.println("-------------------------------------------------------------------------------------------");
    }
    
    public static void main(String[] args) {
        empformat obj=new empformat("Ananth",2024,"11/133 Vadamalaipatty");
       empformat obj2=new empformat("Sri Rengan", 2023, "12/60 Ambai");
       empformat obj3=new empformat("Mani Kandan", 2000, "44/90 Kadayam");
        obj.format();
        obj.display();
        obj2.display();
        obj3.display();
    }
    
}
