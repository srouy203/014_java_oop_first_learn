//Interface
interface car {
    public void showCar();
}
interface moto {
    public void showMoto();
}

class Test implements car, moto{
    public void showCar(){
        System.out.println("Roll Royce");
    }
    public void showMoto(){
        System.out.println("Honda");
    }
}

public class Interface {
    static public void main(String[] args){
        Test obj = new Test();
        obj.showCar();
        obj.showMoto();
    }

}

