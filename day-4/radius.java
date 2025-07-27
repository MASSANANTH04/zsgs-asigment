import java.util.Scanner;

class poinder{
    private int x;
    private int y;
   void setpoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    int getpointx(){
        return x;
    }
    int getpointy(){
        return y;
    }
}
class circul{
  private  double redius;
  void setredius(double redius){
    this.redius=redius;
  }
   double getRedius() {
      return redius;
  }
  double result(){
    return 3.14*redius*redius;
  }

}

public class radius {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        circul c1=new circul();
        poinder p1=new poinder();
        p1.setpoint(10,90);
        c1.setredius(7);
        double ans=c1.result();
        System.out.println("Area : "+ans);
        System.out.println("X value: "+p1.getpointx());
        System.out.println("Y valuue: "+p1.getpointy());
    }
}
