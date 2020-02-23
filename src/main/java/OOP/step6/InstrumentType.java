package OOP.step6;

public enum InstrumentType {

    GUITAR, MANDOLIN, DOBRO, FIDDLE, BASS;

    public String toString()
    {
        switch(this)
        {
            case GUITAR: return "Guitar";
            case MANDOLIN: return "Mandolin";
            case DOBRO: return "Dobro";
            case FIDDLE: return "Fiddle";
            case BASS: return "Bass";
            default: return "Unspecified";
        }
    }

}
