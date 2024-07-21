import java.util.*;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args) {
        List<student> l1=Arrays.asList(new student(101,"Manoj",'A')
        ,new student(102,"Monika",'A')
        ,new student(103,"janu",'A'));
        List<student> l2=Arrays.asList(new student(104,"mmm",'b')
        ,new student(105,"zzz",'c')
        ,new student(106,"llll",'d'));
        List<List<student>> stLis=Arrays.asList(l1,l2);
        //before java 8 if want to get names from final list

        // for(List<student> l:stLis){
        //     for(student s:l){
        //         System.out.println(s.stdName);
        //     }
        // }
        List<String> res=stLis.stream().flatMap(s->s.stream().map(n->n.stdName)).collect(Collectors.toList());
        System.out.println(res);
    }
}

class student{
    int stId;
    String stdName;
    char grade;
    student( int stId,
    String stdName,
    char grade){
        this.stId=stId;
        this.grade=grade;
        this.stdName=stdName;
    }
}
