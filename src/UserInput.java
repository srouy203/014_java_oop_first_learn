import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String username = obj.nextLine();

        System.out.print("Enter age: ");
        int age = obj.nextInt();

        System.out.print("Enter salary: ");
        float salary = obj.nextFloat();

        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
