package staticMethods;

public class StaticUtility implements T {
    public static void main(String[] args) {
        StaticUtility staticUtility = new StaticUtility();
        // staticUtility.test();//gives compilation issue
        T.test();//cannot override static methods of an interface.
    }
}

interface T {
    static void test() {
        System.out.println("inside static test method");
    }
}