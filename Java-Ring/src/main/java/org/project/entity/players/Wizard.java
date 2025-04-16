package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.armors.MagicRobe;
import org.project.object.weapons.MagicStaff;

public class Wizard extends Player
{
    private static final int FIREBALL_COST = 30;
    private static final int FIREBALL_DAMAGE = 35;
    public Wizard(String name)
    {
        super(name, 70, 100, new MagicStaff(), new MagicRobe());
    }
    @Override
    public void useSpecialAbility(Entity target)
    {
        if (mp >= FIREBALL_COST)
        {
            mp -= FIREBALL_COST;
            System.out.println("🔥 " + name + " casts Fireball!");
            target.takeDamage(FIREBALL_DAMAGE);
        }
        else
        {
            System.out.println("❌ Not enough mana to cast Fireball!");
        }
    }
}
