import java.util.*;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(10,30,45,33,12);
       // li.stream().map(num->num*3).forEach(num->System.out.println(num));
       //li.stream().map(num->num*3).forEach(System.out::println);
       List<Integer> res=new ArrayList<>();
       res=li.stream().map(num->num*3).collect(Collectors.toList());
       System.out.println(res);
    }
}
