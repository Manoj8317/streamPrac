import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(10,20,35,71,2,6,77);
        //list.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
        // List<Integer> evenList=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        // System.out.println(evenList);
        list.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
