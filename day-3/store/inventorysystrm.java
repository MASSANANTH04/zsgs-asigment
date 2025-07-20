package store;

public class inventorysystrm {
    public static void main(String[] args) {
        prodict p=new prodict("HYPER Market","chennai");
        store s=new store();
         s.prodictdeatials(1,"pencil",26,90);
         s.display();
         s.prodictdeatials(98, "Book", 299, 76);
         s.display();
         s.prodictdeatials(45, "Labtop", 45999, 7);
         s.display();

    }
}
