package day_6.packageapplication.string;

public class stringmethod {
    public void addtwostring(String x,String y){
        System.out.println("String Concatenating: "+(x+y));
    }
    public void streversestring(String a){
        String ans="";
        for(int i=a.length()-1;i>=0;i--){
            ans+=a.charAt(i);
        }
        System.out.println("String reverse: "+ans);
    }
    public void findstringlengt(String qq){
        int ans=0;
        for(int i=1;i<=qq.length();i++){
            ans=i;
        }
        System.out.println("String length :"+ans);
    }
}
