import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> li=Arrays.asList("Manoj","Monika","Reddy","Janu","Divya","Aruna","Ramamohan");
        //we will use stream to convert every thing into uppercase Strings
       // List<String> upperCaseli=new ArrayList<>();
        // upperCaseli=li.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        // System.out.println(upperCaseli);
        // li.stream().map(name->name.toUpperCase()).forEach(System.out::println);
        li.stream().map(name->name.toUpperCase()).forEach(name->System.out.println(name));
    }
}
