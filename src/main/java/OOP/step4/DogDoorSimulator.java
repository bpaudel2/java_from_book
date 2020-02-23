package OOP.step4;

public class DogDoorSimulator
{


    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Tiger barks to go outside...");
        remote.pressButton();
        System.out.println("Tiger has gone outside...");
        System.out.println("Tiger is all done...");
        System.out.println("Tiger is back inside...");

        //alternate path
        DogDoor door1 = new DogDoor();
        Remote remote1 = new Remote(door1);
        System.out.println("Tiger barks to go outside...");
        remote1.pressButton();
        System.out.println("Tiger has gone outside...");
        System.out.println("Tiger is all done...");
        try
        {
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e)
        {
            //Don't know what to do
        }
        System.out.println("..but Tiger is stuck outside...");
        System.out.println("Tiger starts barking...");
        System.out.println("Gina grabs the remote control");
        remote1.pressButton();
        System.out.println("Tiger is back inside...");
        //*/
    }



}
