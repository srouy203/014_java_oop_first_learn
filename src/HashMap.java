public class HashMap {
    public static void main(String[] args){
        java.util.HashMap<String, Integer> Person = new java.util.HashMap<String, Integer>();
        Person.put("Srouy", 20);
        Person.put("Hannah", 18);
        Person.put("Dara", 25);
        System.out.println(Person);

        for(String i : Person.keySet()){
            System.out.println(i + " " + Person.get(i));
        }
    }
}
