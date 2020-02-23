package OOP.step5;

public class DogDoorSimulator
{


    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark("rowlf"));
        door.addAllowedBark(new Bark("roooowlf"));
        door.addAllowedBark(new Bark("rawlf"));
        door.addAllowedBark(new Bark("rawlfff"));
        door.addAllowedBark(new Bark("woolf"));
        Remote remote = new Remote(door);
        BarkRecognizer recognizer = new BarkRecognizer(door);

        //Simulate the hardware hearing a bark
        System.out.println("Tiger starts barking...");
        recognizer.recognize(new Bark("rowlf"));

        System.out.println("Tiger has gone outside...");


        try
        {
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e)
        {
            //Don't know what to do
        }
        System.out.println("Tiger is all done...");

        System.out.println("..but Tiger is stuck outside...");

        //simulate hardware hearing a bark not Tiger
        System.out.println("A small dog starts barking...");
        recognizer.recognize(new Bark("yip"));

        try
        {
            Thread.currentThread().sleep(5000);
        }
        catch(InterruptedException e){}

        //simulate hardware hearing bark again.
        System.out.println("Tiger starts barking");
        recognizer.recognize(new Bark("roooowlf"));
        System.out.println("Tiger is inside");
        //*/
    }



}
