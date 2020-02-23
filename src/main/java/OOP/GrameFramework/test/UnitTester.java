package OOP.GrameFramework.test;

import OOP.GrameFramework.unit.Unit;

public class UnitTester
{
    public void testType(Unit unit, String type, String expectedOutputType)
    {
        System.out.println("Testing setting getting property");
        unit.setType(type);
        String outputType = unit.getType();
        if(expectedOutputType.equals(outputType))
        {
            System.out.println("Test passed.");
        }else
        {
            System.out.println("Test failed: "+outputType+ " did not match "+ expectedOutputType);
        }
    }


    public void testUnitSpecificProperty(Unit unit, String propertyName, Object inputValue, Object expectedOutputValue)
    {
        System.out.println("Testing setting/getting a unit specific property");
        unit.setProperty(propertyName, inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if(expectedOutputValue.equals(outputValue))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed: "+outputValue+ " did not match "+expectedOutputValue);
        }

    }

    public void testChangeProperty(Unit unit, String propertyName, Object inputValue, Object expectedOutputValue)
    {
        System.out.println("Testing changing an existing property's value");
        unit.setProperty(propertyName, inputValue);
        Object outputValue = unit.getProperty(propertyName);
        if(expectedOutputValue.equals(outputValue))
        {
            System.out.println("Test passed");
        }else
        {
            System.out.println("Test failed: "+outputValue+ " did not match "+ expectedOutputValue);

        }
    }

    public void testNonExistentProperty(Unit unit, String propertyName)
    {
        System.out.println("Testing getting a non-existent property's value");
        try
        {
            Object outputValue = unit.getProperty(propertyName);
        }catch(RuntimeException e)
        {
            System.out.println("Test Passed !!!");
        }
        System.out.println("Test failed ");

    }

    public static void main (String args[])
    {
        UnitTester tester = new UnitTester();
        Unit unit = new Unit(10000);
        tester.testType(unit, "infantry", "infantry");
        tester.testUnitSpecificProperty(unit, "hitPoints",new Integer(25), new Integer(25));
        tester.testChangeProperty(unit, "hitPoints", new Integer(15), new Integer(15));
        tester.testNonExistentProperty(unit, "strength");
    }

}