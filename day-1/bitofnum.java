public class bitofnum {
    public static void main(String arg[]){
        int a=18;
        int binary=0;
        while(a>0){
            binary=(a%2)+binary;
            a=a/2;
        }
        System.err.println("hello world");
        System.out.println(binary);
    }
    
}
