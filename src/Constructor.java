//Constructor

public class Constructor {
    String name;
    int age;

    public Constructor(int age, String name){
        this.age = age;
        this.name = name;
    }
    public static void main(String[] args){
        Constructor obj = new Constructor(20, "Ang LeangSrouy");
        Constructor obj1 = new Constructor(90, "Hello");
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
        System.out.println("Number: " + obj1.age);
        System.out.println("Text: " + obj1.name);
    }
}
