//Encapsulation

public class SetAndGetMethod {
    private String name = "John";

    //get method
    public String getName () {
        return name;
    }

    //set method
    public void setName (String newName) {
        name = newName;
    }

    //main method
    public static void main(String[] args) {
        SetAndGetMethod obj = new SetAndGetMethod();
        System.out.println(obj.name);
        obj.setName("Ang LeangSrouy");
        System.out.println(obj.getName());
    }
}
