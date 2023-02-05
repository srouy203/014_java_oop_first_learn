public class Class1 {
    int x = 5;

    public static class Car {
        int y = 10;
    }

    public static void main(String[] args){
        Class1 obj1 = new Class1();
        Class2 obj2 = new Class2();     //Out class
        Car obj3 = new Car();
        obj2.y = 80;                    //modify attribute
        System.out.println(obj1.x);
        System.out.println(obj2.x);
        System.out.println(obj2.y);
        System.out.println(obj2.name);
        System.out.println(obj3.y);     //Static class
    }
}
