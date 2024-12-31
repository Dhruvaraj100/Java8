package generalprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LowestSalariesAfterThirdHighestSalary {
    //Print all the employee details whose salary is less than 3rd highest salary
    public static void main(String[] args) {

        List<Emp> l = new ArrayList<Emp>();
        l.add(new Emp(1, 500));
        l.add(new Emp(2, 1000));
        l.add(new Emp(3, 1500));
        l.add(new Emp(4, 2000));
        l.add(new Emp(5, 3000));
        l.add(new Emp(6, 4000));
        l.add(new Emp(7, 5000));
        l.add(new Emp(8, 6000));
        l.add(new Emp(9, 7000));

        List<Emp> ll= l.stream().sorted( (e1, e2)-> (int)( e2.getSalary() - e1.getSalary())).skip(3)
                .collect(Collectors.toList());


        System.out.println(ll);

    }
}
class Emp {
    private Integer id;
    private Integer salary;

    Emp(Integer id, Integer salary){
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee [ id =" +id + ", salary =" + salary+ " ]" ;
    }

    public Integer getId(){
        return id;
    }

    public Integer getSalary(){
        return salary;
    }
}