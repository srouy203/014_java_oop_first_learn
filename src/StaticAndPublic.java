//Modifiers

public class StaticAndPublic {

    static void staticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void publicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args){
        staticMethod();

        StaticAndPublic obj = new StaticAndPublic();
        obj.publicMethod();
    }
}
