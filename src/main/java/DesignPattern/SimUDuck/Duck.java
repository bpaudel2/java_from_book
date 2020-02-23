package DesignPattern.SimUDuck;

public abstract class Duck
{
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck()
    {

    }

    public void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb)
    {
        quackBehavior = qb;
    }

    public abstract void display();


    public void performFly()
    {
        flyBehavior.fly();
    }

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void swim()
    {
        System.out.println("All ducks float, even decays!");
    }
}