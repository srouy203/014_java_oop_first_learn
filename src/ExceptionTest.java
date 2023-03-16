public class ExceptionTest {
<<<<<<< HEAD
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
=======
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4};
        try {
            System.out.println(a[2]);
        }catch (Exception e){
            System.out.println("Array have only 4 in length");
        }finally {
            System.out.println("Exception have finish");
        }

>>>>>>> 0661e0c6e0693992deac7c5617fbc48bcd1d25cc
    }
}
