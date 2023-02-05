import java.util.ArrayList;
import java.util.Collections;

public class ArrayLoop {
    public static void main(String[] args){
        ArrayList<String> car = new ArrayList<String>();
        car.add("Lamboghini");
        car.add("Roll Royc");
        car.add("Toyota");
        car.add("Prius");

        //for loop
        for(int i=0; i<car.size(); i++){
            System.out.println("-" + car.get(i));
        }

        //for Each
        for(String item : car) {
            System.out.println(item);
        }

        //sort array
        Collections.sort(car);
        System.out.println(car);

    }

}
