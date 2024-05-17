package generalprograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

    Integer empNumber;

    public EmployeeComparable(Integer empNumber) {
        this.empNumber = empNumber;
    }

    public static void main(String[] args) {

        EmployeeComparable e1 = new EmployeeComparable(122);
        List<EmployeeComparable> eList = Arrays.asList(e1, new EmployeeComparable(12), new EmployeeComparable(1));
        System.out.println(eList);
        Collections.sort(eList);
        System.out.println("After sort :" + eList);

    }

    @Override
    public int compareTo(EmployeeComparable o) {
        return this.empNumber - o.empNumber;
    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "empNumber=" + empNumber +
                '}';
    }
}
