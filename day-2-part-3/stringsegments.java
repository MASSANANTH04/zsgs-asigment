//auestion-7
public class stringsegments {
    public static void main(String[] args) {
        String name="My name is Ananth i am study in BCA";
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)!=' ' &&(i==0 || name.charAt(i-1)==' ')){
                count++;
            }
        }
        System.out.println("segments  is: "+count);
    }
}
