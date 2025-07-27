package calculator;


public class advancecal {
    void power(int a,int b){
        int pow=1;
        for(int i=1;i<=b;i++){
            pow=pow*a;
        }
        System.out.println("Power: "+pow);
}
void modulo(int a,int b){
    System.out.println("Modulo: "+a%b);
}
void sqreroot(double a){
    if(a<0){
        System.out.println("Donot find Square root");
    }
    else{
        System.out.println("Squrroot: "+Math.sqrt(a));
    }
}
}
