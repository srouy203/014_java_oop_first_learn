public class Enum {
    enum test {
        MONADY,
        TUESDAY,
        WEDNESSDAY,
    }

    static public void main(String[] args){
        test myVar = test.MONADY;
        System.out.println(myVar);

        switch (myVar){
            case MONADY:
                System.out.println("MONDAY");
                break;
            case TUESDAY:
                System.out.println("TUEDAY");
            break;
            case WEDNESSDAY:
                System.out.println("WEDNESDAY");
            break;
        }
    }
}
