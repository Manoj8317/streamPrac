import java.util.*;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<Integer> li1=Arrays.asList(1,2);
        List<Integer> li2=Arrays.asList(3,4);
        List<Integer> li3=Arrays.asList(5,6);
        List< List<Integer>> finalList=Arrays.asList(li1,li2,li3);
        //before java8
        // for( List<Integer> l:finalList){
        //     for(int r:l){
        //         System.out.println(r);
        //     }
        // }
        finalList.stream().flatMap(l->l.stream().map(x->x+5)).forEach(System.out::println);
    }
}
