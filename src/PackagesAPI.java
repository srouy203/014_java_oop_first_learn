import java.util.Scanner;

public class PackagesAPI {
    private String username;
    private String password;

    public String getUsername () {
        return username;
    }
    public String getPassword () {
        return password;
    }

    public void setUsernameAndPassword (String username, String password){
        this.username = username;
        this.password = password;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        PackagesAPI pack = new PackagesAPI();

        System.out.println("Please input username and password");
        System.out.print("Enter useName: ");
        String username = obj.nextLine();
        System.out.print("Enter password: ");
        String password = obj.nextLine();

        pack.setUsernameAndPassword(username, password);

        System.out.println("Username" + pack.getUsername() + " Password: " + pack.getPassword());
    }
}
