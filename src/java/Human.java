public class Human{

    private int health = 100;
    private int power = 50;
    private int strength = 100;
    private int hunger = 0;

    public void setHealth(int num)
    {
        health = num;
    }

    public int getHealth()
    {
        return health;
    }

    public void setPower(int num)
    {
        power = num;
    }

    public int getPower()
    {
        return power;
    }

    public void setStrength(int num)
    {
        strength = num;
    }

    public int getStrength()
    {
        return strength;
    }

    public void setHunger(int num)
    {
        hunger = num;
    }

    public int getHunger()
    {
        return hunger;
    }

    public Human()
    {
        health = 100;
        strength = 50;
        hunger = 0;
    }
}
