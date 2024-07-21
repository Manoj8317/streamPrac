import java.util.*;
import java.util.stream.Collectors;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> li=Arrays.asList("Manoj","Monika","Janu","Divya","Aruna");
       // li.stream().map(name->name.length()).forEach(len->System.out.println(len));
       //li.stream().map(name->name.length()).forEach(System.out::println);
       List<Integer> res=new ArrayList<>();
       res=li.stream().map(name->name.length()).collect(Collectors.toList());
       System.out.println(res);
    }
}
