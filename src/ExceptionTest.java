public class ExceptionTest {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4};
        try {
            System.out.println(a[2]);
        }catch (Exception e){
            System.out.println("Array have only 4 in length");
        }finally {
            System.out.println("Exception have finish");
        }

    }
}
