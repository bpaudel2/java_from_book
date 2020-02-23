package OOP.step2;

public class GuitarSpec {

    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private String model;
    private int numString;


    public GuitarSpec(Builder builder, Type type, Wood backWood, Wood topWood, String model, int numString) {
        super();
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model = model;
        this.numString = numString;
    }

    public Builder getBuilder() {
        return builder;
    }

    public int getNumString()
    {
        return numString;
    }


    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((backWood == null) ? 0 : backWood.hashCode());
        result = prime * result + ((builder == null) ? 0 : builder.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + numString;
        result = prime * result + ((topWood == null) ? 0 : topWood.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GuitarSpec other = (GuitarSpec) obj;
        if (backWood != other.backWood)
            return false;
        if (builder != other.builder)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (numString != other.numString)
            return false;
        if (topWood != other.topWood)
            return false;
        if (type != other.type)
            return false;
        return true;
    }

}