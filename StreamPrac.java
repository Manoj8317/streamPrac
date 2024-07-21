import java.util.*;

public class StreamPrac {
    public static void main(String[] args) {
        List<Integer> li=Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,4,6,9,2);
        li.stream().limit(5).forEach(System.out::println);
        Optional<Integer> minVal=li.stream().min((x1,x2)->{return x1.compareTo(x2);});
        System.out.println(minVal.get());
        Optional<Integer> maxVal=li.stream().max((x1,x2)->{return x1.compareTo(x2);});
        System.out.println(maxVal.get());
        System.out.println(li.stream().count());
        Object[] arr=li.stream().toArray();
        System.out.println(arr[0]);
        System.out.println(li.stream().distinct().count());
    }
}
