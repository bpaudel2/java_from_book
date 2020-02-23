package OOP.step6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List<Instrument> inventory;

    public Inventory()
    {
        inventory = new LinkedList<Instrument>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec)
    {
        inventory.add(new Instrument(serialNumber, price, spec));
    }

    public Instrument get(String serialNumber)
    {
        for(Iterator<Instrument> i = inventory.iterator(); i.hasNext();)
        {
            Instrument instrument = i.next();
            if(instrument.getSerialNumber().equals(serialNumber))
            {
                return instrument;
            }
        }
        return null;
    }

    public List<Instrument> search(InstrumentSpec searchSpec)
    {
        List<Instrument> matchingInstruments = new LinkedList<Instrument>();
        for(Iterator<Instrument> i = inventory.iterator(); i.hasNext();)
        {
            Instrument instrument = i.next();
            //Ignore serialNumber and price because they are unique
            if(instrument.getSpec().equals(searchSpec))
            {
                matchingInstruments.add(instrument);
            }

        }
        return matchingInstruments;

    }



}
