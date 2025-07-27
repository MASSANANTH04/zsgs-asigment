class shap{
    void print(){
        System.out.println("This Is A Shap");
}
}
class polygon extends shap{
    
    void print(){
        super.print();
        System.out.println("This is a polygon");
    }
}
class rectangle extends polygon{
    void print(){
        super.print();
        System.out.println("Recatangal is polygon");
    }
}
class triangle extends rectangle{
    void print(){
        super.print();
        System.out.println("Triangle is polygon");
    }
}
class square extends triangle{
    void print(){
        super.print();
        System.out.println("Square is triangle");
    }
}
public class shapsss {
    public static void main(String[] args) {
        square p=new square();
        
        p.print();
    }
}
