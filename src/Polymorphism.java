class Car {
    public void CarType() {
        System.out.print("The car is: ");
    }
}
class Toyota extends Car {
    public void CarType () {
        System.out.println("Toyota");
    }
}
class Prius extends Car {
    public void CarType () {
        System.out.println("Prius");
    }
}

public class Polymorphism {
    public static void main (String[] args) {
        Car obj = new Car();
        Car toyota = new Toyota();
        Car prius = new Prius();

        obj.CarType();
        toyota.CarType();
        obj.CarType();
        prius.CarType();
    }
}
