package day_6.employeedeatiles;

public class employsetget {
    private int employeeid;
    private String empname;
    private String designation;
    private String deportment;
    private double salary;
    private double annual_slary;
    void setempid(int employeeid){
        this.employeeid=employeeid;
    }
    int getempid(){
        return employeeid;
    }
    void setempname(String empname){
        this.empname=empname;
    }
    String getempname(){
        return empname;
    }
    void setdes(String designation){
        this.designation=designation;
    }
    String getdes(){
        return designation;
    }
    void setdep(String deportment ){
        this.deportment=deportment;
    }
    String getdep(){
        return deportment;
    }
    void setsal(double salary){
        this.salary=salary;
    
    }
    double getsal(){
        
        return salary;
    }
   
    


}
