import java.util.Arrays;
import java.util.List;

public class FilterDemo3 {
    public static void main(String[] args) {
        List<Product> li=
        Arrays.asList
        (new Product(1, "Hp Laptaop", 25000),
        new Product(2, "lenovo Laptaop", 15000),
        new Product(3, "mac Laptaop", 100000),
        new Product(4, "Acess Laptaop", 60000));
        li.stream().filter(p->p.price>25000).forEach(p->System.out.println(p.prodName+" "+p.price+" "+p.id));
    }
}


class Product{
    int id;
    String prodName;
    int price;
    Product(int id,String prodName,int price){
        this.id=id;
        this.prodName=prodName;
        this.price=price;
    }
}