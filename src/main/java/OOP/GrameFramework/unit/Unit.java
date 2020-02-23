package OOP.GrameFramework.unit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unit
{
    private String type;
    private int id;
    private String name;
    private List weapons;
    private Map properties;

    public Unit(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    public void addWeapon(Weapon weapon)
    {
        if(weapons == null)
        {
            weapons = new LinkedList();
        }
        weapons.add(weapon);
    }

    */
    public List getWeapons()
    {
        return weapons;
    }

    public void setProperty(String property, Object value)
    {
        if(properties == null)
        {
            properties = new HashMap();
        }
        properties.put(property, value);
    }

    public Object getProperty(String property)
    {
        if(properties == null)
        {
            /*
            Why are we throwing a RuntimeException, and not a checked exception, like
            IllegalAccessException?
            If we used a checked exception, code that calls get Property() would have to
            check for that exception in try/catch blocks. That is not what the client wanted
            we agreed to contract that would let them code without having to catch for
            any exceptions.
            */
            //throw new IllegalAccessException("What are you doing? No properties !");
            throw new RuntimeException("No properties for this Unit.");

        }
        Object value = properties.get(property);
        if(value == null)
        {
            //throw new IllegalAccessException("You are screwing up! No property value.");
            throw new RuntimeException("Request for non-existent property.");

        }
        return value;
    }
}
