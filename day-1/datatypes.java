public class datatypes {
    public static void main(String []args){
        String name="Ananth";
        char insial='S';
        byte mark1=23;//byte data type;
        short mark2=89;//short data type
        int mark3=100;//int data type
        long mark4=98;//long data type


        float average1=mark1+mark2+mark3+mark4; //float data type
        double average2=average1/4;  //double data type
        boolean passorfail=average1>300?true:false;    //boolean data type

        System.out.println("my name is:"+insial+" "+name);
        System.out.println("tamil mark is:"+mark1);
        System.out.println("english mark is:"+mark2);
        System.out.println("java mark is:"+mark3);
        System.out.println("html mark  is:"+mark4);

        System.out.println("total :"+average1);
        System.out.println("average:"+average2);
        System.out.println("true=pass  || false=fail: "+passorfail);
        
        System.out.println("your name is:"+name);
    }
}
