    //question-8
    //deep copy
    package cloneingobject;
    class Studenttt{
        String name;
        int rollno;
        String department;
    
        Studenttt(String name,int rollno ,String department){
            this.name=name;
            this.rollno=rollno;
            this.department=department;
        }
    }
    class departmenttt implements Cloneable{
        Studenttt s;
        departmenttt(Studenttt s){
        
            this.s=s;
        
        }
        void display(){
            System.out.println("Name: "+s.name);
            System.out.println("Rollno: "+s.rollno);
            System.out.println("Department: "+s.department);
            
        }
        protected Object clone(){
            try{
                departmenttt d=(departmenttt)super.clone();
               return new departmenttt(new Studenttt(s.name, s.rollno, s.department));
            }
            catch(CloneNotSupportedException c){
                return null;
            }
        }
    }
    public class clonobjectdeep {
        public static void main(String[] args) {
        Studenttt obj=new Studenttt("Ananth", 22661,"BCA");
        departmenttt d1=new departmenttt( obj);
        departmenttt d2=(departmenttt)d1.clone();
        d2.s.name="changing";
        d1.display();
        d2.display();
        }
    }