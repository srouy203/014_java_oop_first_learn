import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    public static void main(String[] args){
        Date dateNow = new Date();
        SimpleDateFormat newFormat = new SimpleDateFormat("MMMM/dd/yyyy");

        System.out.println(newFormat.format(dateNow));
    }
}
