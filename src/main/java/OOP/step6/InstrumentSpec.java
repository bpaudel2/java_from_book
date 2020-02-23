package OOP.step6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec
{
    private Map properties;
    /*
    An example of properties:
    InstrumentType: InstrumentType.GUITAR
    builder: Builder.MARTIN
    Model: "OM-18"
    type: Type.ACOUSTIC
    BackWood: Wood.MAHDANY
    TopWood: Wood.SITKA
    NumString: 6
    Style: Style.F

    Note: When you have a set of properties that vary
    across your objects, use a collection, like Map, to store
    those properties dynamically.

    You will remove lots of methods from your classes, and avoid
    having to change your code when new properties are added to
    your app.

    */

    public InstrumentSpec(final Map properties) {
        if (properties == null) {
            this.properties = new HashMap();
        } else {
            this.properties = new HashMap(properties);
        }
        this.properties = properties;
    }

    public Map getProperties() {
        return properties;
    }

    public Object getProperty(final String propertyName) {
        return properties.get(propertyName);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((properties == null) ? 0 : properties.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final InstrumentSpec other = (InstrumentSpec) obj;
        if (properties == null) {
            if (other.getProperties()!= null)
                return false;
        } else {
            for (final Iterator i = other.getProperties().keySet().iterator(); i.hasNext();) {
                final String propertyName = (String) i.next();
                if(!properties.get(propertyName).equals(other.getProperty(propertyName)))
                {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

}