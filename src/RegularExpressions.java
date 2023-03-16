import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class RegularExpressions {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);

        //input to search
        System.out.print("Input to search: ");
        String test = obj.nextLine();

        //use the input setence to search in pattern
        Matcher matcher = pattern.matcher(test);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
