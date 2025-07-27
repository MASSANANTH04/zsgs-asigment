class twod{
    int x;
    int y;
    twod(){
        System.out.println("TowD Default constrator");
    }

}
class thirdd extends twod{
    int z;
    thirdd(){
        System.out.println("Third clss constructor");
    }
   
    void setmethid(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;

    }
    thirdd(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    double distance(thirdd obj1,thirdd obj2){
      double ans=Math.sqrt(Math.pow(obj2.x-obj1.x,2)+Math.pow(obj2.y-obj1.y,2)+Math.pow(obj2.z-obj1.z,2));
    return ans;
    }
}
public class distancecalcation {
    public static void main(String[] args) {
        thirdd obj1=new thirdd();
        obj1.setmethid(10,2,32);
        thirdd obj2=new thirdd(11,10,2);
        double ans=obj1.distance(obj1, obj2);
        System.out.println(ans);
       

    }
}
