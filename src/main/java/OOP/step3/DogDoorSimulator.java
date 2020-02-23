package OOP.step3;

public class DogDoorSimulator
{
    public static void main(String[] args)
    {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Tiger barks to go outside...");
        remote.pressButton();
        System.out.println("Tiger has gone outside...");
        remote.pressButton();
        System.out.println("Tiger is all done...");
        remote.pressButton();
        System.out.println("Tiger is back inside...");
        remote.pressButton();
    }

}
