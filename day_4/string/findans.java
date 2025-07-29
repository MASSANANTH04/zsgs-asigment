package string;

import day_6.payment.privatedata;

public class findans {
    void  strlength(String a){
        int ans=0;
        for(int i=1;i<=a.length();i++){
            ans=i;
        }
        System.out.println("Length is: "+ans);
    }
    void strintdex(String a,int b){
        char ch[]=new char[a.length()+1];
        for(int i=0;i<a.length();i++){
            ch[i]=a.charAt(i);
        }
        System.out.println("Index: "+ch[b]);
    }
    void strequalornat(String a,String b){
        boolean ans=true;
        if(a.length()!=b.length()){
            ans=false;
            System.out.println("Two String is Equal or not:"+ans);
        }
        if(a.length()==b.length()){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                ans=true;
            }
            else{
                ans=false;
            }
        }
    
        System.out.println("Two String is Equal or not:"+ans);
    }
    }


    void struppercase(String a){
        String ans="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='a'){
                ans+= (char)(a.charAt(i)-32);
            }
            else{
                ans+=a.charAt(i);
            }
        }
        System.out.println("String ToUpperCase: "+ans);

    }
    void strlowercase(String a){
        String ans="";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='A'  && a.charAt(i)<='Z'){
                ans+=(char)(a.charAt(i)+32);
            }
            else{
                ans+=a.charAt(i);
            }
        }
        System.out.println("String ToLowerCase:"+ans);
    }
    void strsubstring(String a,int start,int end){
        String ans="";
        int i=start;
        int j=end;
        for( i=start;i<end;i++){
            ans+=a.charAt(i);
        }
        System.out.println("SubString :"+ans);
    }
    void strconcat(String first,String sec){
        System.out.println("String Concat: "+first+sec);
    }
    void strcontains(String str1,String str2){
        boolean ans=false;
        int t=0;
        for(int i=0;i<str1.length();i++){
            t=0;
            for(int j=i;j<i+str2.length();j++){
                if(str1.charAt(j)==str2.charAt(t)){
                    t++;
                    
                }
                else{
                    break;
                }
            }
            if(t==str2.length()){
                ans=true;
            }
        }
        System.out.println("String contains : "+ans);
    }
    void strcharreturnindex(String a,char ch){
        int ans=0;
        
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==ch){
                ans=i;
                break;
            }
            else continue;

        }
        System.out.println("Index: "+ans);
    }
    void strreplace(String str,char old,char newc){
        String ans="";
        for(int i=0;i<str.length();i++){
            if(old==str.charAt(i)){
                ans+=newc;
            }
            else{
                ans+=str.charAt(i);
            }
        }
        System.out.println("String Replace Char:"+ans);
    }
}
