package org.project.object.armors;

public class LightArmor extends Armor
{
    public LightArmor()
    {
        super("Light Armor", 8, 25);
    }
    @Override
    public void activateBonus()
    {
        System.out.println("🌀 Light Armor lets you dodge slightly more easily!");
    }
}
