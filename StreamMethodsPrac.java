//sorted

//anyMatch
//noneMatch
//allMatch

//findAny
//findFirst


//Concat

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsPrac {
    public static void main(String[] args) {
        List<String> li=Arrays.asList("karumakr","aruna","divya","monika","janu","manoj");
        List<String> li2=Arrays.asList("bujji","majji","choti","kaarana","jiva","mariy");
        List<String> li1=li.stream().sorted().collect(Collectors.toList());
        System.out.println(li1);
        List<Integer> lis=Arrays.asList(72,36,99,72,36,89);

        lis.stream().sorted(Comparator.reverseOrder()).forEach(num->System.out.print(num+" "));
        System.out.println();
        lis.stream().sorted().forEach(num->System.out.print(num+" "));


        boolean r=li.stream().anyMatch(str->{return str.startsWith("kar");});
        System.out.println(r);
        r=li.stream().allMatch(str->{return str.startsWith("kar");});
        System.out.println(r);
        r=li.stream().noneMatch(str->{return str.startsWith("zz");});
        System.out.println(r);

        Optional<Integer> m=lis.stream().findAny();
        System.out.println(m.get());
        m=lis.stream().findAny();
        System.out.println(m.get());
        Stream<String> st=li.stream();
        Stream<String> st1=li2.stream();

        li=Stream.concat(st, st1).collect(Collectors.toList());
        System.out.println(li);

    }
}
