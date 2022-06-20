public class Items {

    String[] item = {"Axe", "Sword", "Crossbow", "Healing Mushroom", "Bomb", "Potion"};
    private String weapon;
    private int weaponPower;
    private int healingAmount;

    public String getWeapon(int num)
    {
        //re-write this as switch
        if (num == 1)
        {
            return "Axe";
        }
        else if (num == 2)
        {
            return "Sword";
        }
        else if (num == 3)
        {
            return "Crossbow";
        }
        else if (num == 4)
        {
            return "Healing Mushroom";
        }
        else if (num == 5)
        {
            return "Bomb";
        }
        else if (num == 6)
        {
            return "Potion";
        }
        else
        {
            return "Empty";
        }
    }

    public int getWeaponPower(int num)
    {
        //r-write this as switch
        if (num == 1)
        {
            return 50;
        }
        else if (num == 2)
        {
            return 35;
        }
        else if (num == 3)
        {
            return 20;
        }
        else if (num == 5)
        {
            return 50;
        }
        else if (num == 6)
        {
            return 25;
        }
        else
        {
            return 0;
        }

    }

    public int getHealingAmount(int num)
    {
        switch (num)
        {
            case 4:
                return 50;
                break;
            case 6:
                return 25;
                break;
            default:
                return 0;
                break;
        }
    }

    public Items(int num)
    {
        weapon = getWeapon(num);
        weaponPower = getWeaponPower(num);
        healingAmount = getHealingAmount(num);
    }
}
