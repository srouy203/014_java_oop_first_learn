public class ExceptionTest {
    static void checkAge(int age){
        System.out.println(age);
        if(age < 18){
            throw new ArithmeticException("You must order than 18");
        }else{
            System.out.println("You and older enough");
        }
    }

    public static void main(String[ ] args){
        int []myNumber = {1, 3, 5};
        try{
            System.out.println(myNumber[1]);
        }catch (Exception e){
             System.out.println("Something went wrong");
        }finally {
            System.out.println("Code is executed");
        }

        checkAge(17);
    }
}
