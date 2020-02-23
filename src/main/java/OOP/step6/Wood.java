package OOP.step6;

public enum Wood {

    INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD,
    MAPLE, COCOBOLO, CEDAR, ADIRONDACK;

    public String toString()
    {
        switch(this)
        {
            case INDIAN_ROSEWOOD:
                return "Indian_Rosewood";
            case BRAZILIAN_ROSEWOOD:
                return "Brazilian_Rosewood";
            case MAPLE:
                return "Maple";
            case COCOBOLO:
                return "Cocobolo";
            case CEDAR:
                return "Cedar";
            case ADIRONDACK:
                return "Adirondack";
            default:
                return null; //Don't know what to do
        }
    }
}
