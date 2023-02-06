public class ExceptionTestAge {
    public static void testAge(int age){
        if(age < 13){
            throw new ArithmeticException("Age must bigger than 13");
        }else{
            System.out.println("Login");
        }
    }

    public static void main(String[] args){
        testAge(10);
    }
}
