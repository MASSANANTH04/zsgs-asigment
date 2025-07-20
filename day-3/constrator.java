public class constrator {
    String name;
    int rollno;
    long phonenum;
    String address;
    constrator(String name,int rollno,long phonenum,String address){
        this.name=name;
        this.rollno=rollno;
        this.phonenum=phonenum;
        this.address=address;

    }
    constrator(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void displaydeatial(){
        System.out.println("name: "+name);
        System.out.println("Roll Number: "+rollno);
        System.out.println("Phone number: "+phonenum);
        System.out.println("Address: "+address);
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("Roll number: "+rollno);
    }

    public static void main(String args[]){
        constrator a=new constrator("Ananth",22669,9600493192l,"Vadamalaipatty");
        constrator b=new constrator("Sri Rengan",22662,7708218970l,"Ambai" );
        constrator c=new constrator("Malar",2442 );
        a.displaydeatial();
        System.out.println("-----------------------------------------------");
        b.displaydeatial();
        System.out.println("-----------------------------------------------");
        c.display();
        System.out.println("-----------------------------------------------");
    }
    
}
