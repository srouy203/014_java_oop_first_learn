public class Method {

    static void TestStatic () {
        System.out.println("Hello Static");
    }

    public void TestPublic (int x, int y) {
        System.out.println("Public: " + (x + y));
    }

    public static void main(String[] args){
        TestStatic();
        Method obj = new Method();
        obj.TestPublic(5,6);
    }
}
