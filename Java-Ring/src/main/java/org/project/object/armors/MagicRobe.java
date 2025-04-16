package org.project.object.armors;

public class MagicRobe extends Armor
{
    public MagicRobe()
    {
        super("Magic Robe", 5, 20);
    }
    @Override
    public void activateBonus()
    {
        System.out.println("🔮 The robe pulses with arcane energy, slightly increasing mana regeneration!");
    }
}
