package OOP.GrameFramework.board;

import java.util.LinkedList;
import java.util.List;

import OOP.GrameFramework.unit.Unit;

public class Tile
{
    private List units;

    public Tile()
    {
        units = new LinkedList();
    }

    //protected because only classes in board package can access them.

    protected void addUnit(Unit unit)
    {
        units.add(unit);
    }

    protected void removeUnit(Unit unit)
    {
        units.remove(unit);
    }
}
