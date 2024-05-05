
public class MethodReferenceExample {

    public static void main(String[] args) {
        Car car = SUV::getCarType; // Method reference
        car.carType(); //instead of implementing lambda expression we will refer the existing lambda expression code reuseability
    }
}

@FunctionalInterface
interface Car {
    void carType();
}

class SUV {
    public static void getCarType() {
        Car car = () -> System.out.println("Car type is SUV");
        car.carType();
    }
}