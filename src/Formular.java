import java.util.Scanner;

public class Formular {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int i = 0;
        do {
            System.out.print("Enter first:");
            Float first = myObj.nextFloat();
            System.out.print("Enter second:");
            Float second = myObj.nextFloat();

            float result = calculateSecondPensionToPay(first, second);
            System.out.println(result);

            i++;
        }while(i<100);
    }

    private static float calculateSecondPensionToPay(float firstStatePension, float secondStatePension) {

        float totalStatePension = 24000, result = 0, condition = firstStatePension + secondStatePension;

        if(firstStatePension < totalStatePension){
            if(condition > totalStatePension)
                result = totalStatePension - firstStatePension;
            else if(condition <= totalStatePension)
                result = secondStatePension;
        }else if(firstStatePension >= totalStatePension){
            result = 0;
        }

        return result;
    }
}