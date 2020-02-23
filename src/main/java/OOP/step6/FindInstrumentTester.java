package OOP.step6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


import OOP.step2.Builder;
import OOP.step2.Type;

public class FindInstrumentTester {

    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Map properties = new HashMap();
        properties.put("builder", Builder.GIBSON);
        properties.put("backWood", Wood.MAPLE);

        InstrumentSpec clientSpec = new InstrumentSpec(properties);
        List<Instrument> matchigInstruments = inventory.search(clientSpec);

        if(!matchigInstruments.isEmpty())
        {
            System.out.println("You might like thess instruments:");
            for(Iterator<Instrument> i = matchigInstruments.iterator(); i.hasNext();)
            {
                Instrument instrument = (Instrument)i.next();
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("We have a "+
                        spec.getProperty("instrumentType") +" with following properties: ");

                for(Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();)
                {
                    String propertyName = (String)j.next();
                    if(propertyName.equals("instrumentType"))
                    {
                        continue;
                    }
                    System.out.println("  "+propertyName + ": "+
                            spec.getProperty(propertyName));

                }
            }


        }else
        {
            System.out.println("Sorry, Erin, We have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory)
    {
        Map properties = new HashMap();
        properties.put("instrumentType",InstrumentType.GUITAR);
        properties.put("builder",Builder.COLLINGS);
        properties.put("model","CJ");
        properties.put("type",Type.ACOUSTIC);
        properties.put("numStrings",6);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood",Wood.MAPLE);
        inventory.addInstrument("11277", 399.99, new InstrumentSpec(properties));

        //Rather than creating bunch of variable, let's override existing ones rahter
        properties = new HashMap();
        properties.put("instrumentType",InstrumentType.GUITAR);
        properties.put("builder",Builder.GIBSON);
        properties.put("model","SG61");
        properties.put("type",Type.ELECTRIC);
        properties.put("numStrings",6);
        properties.put("topWood", Wood.MAPLE);
        properties.put("backWood",Wood.MAPLE);
        properties.put("numString", 6);
        inventory.addInstrument("11278", 299.99, new InstrumentSpec(properties));

        properties = new HashMap();
        properties.put("instrumentType",InstrumentType.BASS);
        properties.put("builder",Builder.GIBSON);
        properties.put("model","RB-3-5");
        properties.put("type",Type.ACOUSTIC);
        properties.put("topWood", Wood.INDIAN_ROSEWOOD);
        properties.put("backWood",Wood.MAPLE);
        inventory.addInstrument("11279", 199.99, new InstrumentSpec(properties));



    }
}
