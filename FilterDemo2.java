import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> nameList=Arrays.asList("manoj","loves","monika","ni","ji","krishanaraju","family");
        //nameList.stream().filter(nam->nam.length()>2&&nam.length()<8).forEach(System.out::println);
        // List<String> finalList= nameList.stream().filter(nam->nam.length()>2&&nam.length()<8).collect(Collectors.toList());
        // System.out.println(finalList);
        nameList.stream().filter(nam->nam.length()>2&&nam.length()<8).forEach(nam->System.out.println(nam));
    }
}
