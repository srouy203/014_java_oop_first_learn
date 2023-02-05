
class Inheritance extends Inheritance1 {
    private String grade = "SLS";

    public static void main (String[] args){
        Inheritance obj = new Inheritance();
        //Class Inheritance1
        System.out.println(obj.name);
        System.out.println(obj.age);
        obj.ShowAge();
        //Main Class
        System.out.println(obj.grade);
        //Class Inheritance2
        System.out.println(obj.salary + "$");
        obj.totalSalary();
    }
}
