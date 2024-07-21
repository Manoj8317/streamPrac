import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_Filter_demo {
    public static void main(String[] args) {
        List<Employee> list=Arrays.asList(new Employee(1,"manoj",100000)
                                        ,new Employee(2,"monika",140000)
                                        ,new Employee(3,"divya",90000)
                                        ,new Employee(4,"karunakar",300000)
                                        ,new Employee(5,"aruna",20000));
        List<Employee> list1=new ArrayList<>();
        list.stream().filter(emp->emp.salary>=100000).map(emp->emp.empName).forEach(sal->System.out.println(sal));
    }
}

class Employee{
    int empId;
    String empName;
    int salary;
    Employee(int empId,
    String empName,
    int salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }
}
