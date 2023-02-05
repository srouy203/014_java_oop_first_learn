//Interface 2

interface play{
    public void playGuitar();
    public void playBass();
}
interface learn{
    public void learnDrum();
}
class guitar implements play{

    @Override
    public void playGuitar() {
        System.out.println("I play guitar");
    }

    @Override
    public void playBass() {
        System.out.println("I play Bass");
    }
}
class bass implements play, learn{

    @Override
    public void playGuitar() {

    }

    @Override
    public void playBass() {

    }

    @Override
    public void learnDrum() {
        System.out.println("I'm learning drum");
    }
}


public class Interface2Class {
    static public void main(String[] args){
        guitar gui = new guitar();
        bass newBass = new bass();

        gui.playGuitar();
        gui.playBass();
        newBass.learnDrum();
    }
}
