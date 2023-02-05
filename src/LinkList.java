import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<String>();

        list.add("List1");  list.add("list2"); list.add("List3"); list.add("List4");    list.add("List5");
        list.addFirst("FirstList");
        System.out.println(list);       //[FirstList, List1, list2, List3, List4, List5]

        list.removeLast();
        System.out.println(list);       //[FirstList, List1, list2, List3, List4]

        String text = list.getFirst();
        System.out.println(text);         //FirstList
    }
}
