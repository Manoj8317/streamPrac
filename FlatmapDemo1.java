import java.util.*;
import java.util.stream.Collectors;

public class FlatmapDemo1 {
    public static void main(String[] args) {
        List<String> team1=Arrays.asList("manoj","monika","ranga");
        List<String> team2=Arrays.asList("Rajesh","Sanjana","abhishek");
        List<String> team3=Arrays.asList("Raviteja","pavitra","Satya");
        List<List<String>> playersList=Arrays.asList(team1,team2,team3);
        List<String> res=new ArrayList<>();
       // playersList.stream().flatMap(p->p.stream()).forEach(System.out::println);
        res=playersList.stream().flatMap(p->p.stream()).collect(Collectors.toList());
        System.out.println(res);
    }
}
