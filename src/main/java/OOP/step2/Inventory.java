package OOP.step2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Guitar> guitars;

    public Inventory()
    {
        guitars = new LinkedList<Guitar>();
    }

    public void addGuitar(String serialNumber, double price, GuitarSpec spec)
    {
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber)
    {
        for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = i.next();
            if(guitar.getSerialNumber().contentEquals(serialNumber))
            {
                return guitar;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec)
    {
        List<Guitar> matchingGuitars = new LinkedList<Guitar>();
        for(Iterator<Guitar> i = guitars.iterator(); i.hasNext();)
        {
            Guitar guitar = i.next();
            //Ignore serialNumber and price because they are unique
            if(guitar.getSpec().equals(searchSpec))
            {
                matchingGuitars.add(guitar);
            }

        }
        return matchingGuitars;

    }



}
