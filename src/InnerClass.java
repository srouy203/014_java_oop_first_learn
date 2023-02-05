class Outer{
    int num = 15;

    class Inner {
        public void show() {
            System.out.println("HELLO INNER");
        }
        public int getNum(){
            return num;
        }
    }
}

public class InnerClass {

    public static void main(String[] args){
        Outer outerObj = new Outer();
        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.show();

        //Access from inner to outer class
        System.out.println(innerObj.getNum());

    }
}
