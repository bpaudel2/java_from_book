package OOP.step5;

public class BarkRecognizer
{
    private DogDoor door;

    public BarkRecognizer(DogDoor door)
    {
        this.door = door;
    }

    public void recognize(Bark bark)
    {
        System.out.println("BarkRecognizer: heard "+bark.getSound());
        if(door.getAllowedBark().contains(bark))
        {
            door.open();
        }else
        {
            System.out.println("The dog is not allowed.");
        }

    }

}
