import java.util.ArrayList;

public class Array {
    public static void main(String[] args){
        ArrayList<String> book = new ArrayList<String>();
        //push array list
        book.add("Khmer");
        book.add("Math");
        book.add("History");
        System.out.println(book);               //[Khmer, Math, History]
        System.out.println(book.get(1));        //Math

        //modify array list
        book.set(2, "C#");
        System.out.println(book);               //[Khmer, Math, C#]

        //remove element from array
        book.remove(1);
        System.out.println(book);               //[Khmer, C#]

        //find arrayList size
        int sizeArray = book.size();
        System.out.println(sizeArray);          //2

        //remove all element form array list
        book.clear();
        System.out.println(book);               //[]

        //Other type
        ArrayList<Character> ch = new ArrayList<Character>();       //char
        ArrayList<Boolean> bool = new ArrayList<Boolean>();         //bool
        ArrayList<Double> doub = new ArrayList<Double>();           //double
        ArrayList<Float> fl = new ArrayList<Float>();               //float
        ArrayList<Integer> num = new ArrayList<Integer>();          //int
        num.add(20);
        num.add(98);
        System.out.println(num);                //[20, 98]

    }
}
