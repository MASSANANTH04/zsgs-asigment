public class allconstrator {
    String Empname;
    int empid;
    String empteam;
    int empsalary;
    allconstrator(){
        System.out.println("***************************");
        System.out.println("this is default constrator ");
        System.out.println("***************************");
    }
    allconstrator(String Empname,int empid,String empteam,int empsalary){
        this.Empname=Empname;
        this.empid=empid;
        this.empteam=empteam;
        this.empsalary=empsalary;
    }
    allconstrator(allconstrator u){
        this.Empname="Sri";
        this.empid=1234;
        this.empteam="TCS";
        this.empsalary=60000;
    }
    void display(){
        System.out.println("Employee name : "+Empname);
        System.out.println("Employee Id: "+empid);
        System.out.println("Employee team: "+empteam);
        System.out.println("Employee Salary: "+empsalary);
    }
    public static void main(String args[]){
        allconstrator x=new allconstrator();
        allconstrator y=new allconstrator("Ananth",2442,"ZOHO",45000);
        System.out.println("***************************************************************************");
        y.display();
        System.out.println("***************************************************************************");
        allconstrator z=new allconstrator(y);
        System.out.println("***************************************************************************");
        z.display();
        System.out.println("***************************************************************************");
    }
    
}
