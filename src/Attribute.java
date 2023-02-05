import org.w3c.dom.Attr;

public class Attribute {
    public static class Test{
        int x = 10;
    }

    String name = "Ang LeangSrouy", sex = "Male";
    int age = 20;

    public static void main(String[] args){
        Test obj1 = new Test();
        Test obj2 = new Test();
        obj2.x = 20;                    //modify attribute
        System.out.println(obj1.x);
        System.out.println(obj2.x);

        Attribute obj = new Attribute();                //Multiple attributes
        System.out.println("My name is: " + obj.name);
        System.out.println("Sex: " + obj.sex);
        System.out.println("Age: " + obj.age );

    }

}
