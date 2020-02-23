package OOP.step1;

public class FindGuitarTester {

    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar whatErinLikes = new Guitar("",0,"fender",
                "Stratocoaster", "electric","Alder","Alder");
        Guitar guitar = inventory.search(whatErinLikes);
        if(guitar != null)
        {
            System.out.println("Erin, you might like this "+
                    guitar.getBuilder() +" "+guitar.getModel() +
                    " "+guitar.getType() + "guitar:\n "+
                    guitar.getBackWood()+" back and sides, \n "+
                    guitar.getTopWood()+" top, \n You can have it for only $" +
                    guitar.getPrice()+" !");
        }else
        {
            System.out.println("Sorry, Erin, We have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory)
    {
        //ADD guitars to inventory ...
        inventory.addGuitar("V95693",1499.99 , "Fender", "Stratocaster", "electric", "alder", "alder");

    }
}

