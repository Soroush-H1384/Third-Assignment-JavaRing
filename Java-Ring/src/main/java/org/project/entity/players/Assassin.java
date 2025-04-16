package org.project.entity.players;

import org.project.entity.Entity;
import org.project.object.armors.LightArmor;
import org.project.object.weapons.TwinDaggers;

public class Assassin extends Player
{
    private static final int STRIKE_DAMAGE = 20;
    public Assassin(String name)
    {
        super(name, 80, 40, new TwinDaggers(), new LightArmor());
    }
    @Override
    public void useSpecialAbility(Entity target)
    {
        System.out.println("🗡️ " + name + " performs Shadow Strike!");
        int damage = Math.random() < 0.5 ? STRIKE_DAMAGE * 2 : STRIKE_DAMAGE;
        System.out.println("💥 Damage dealt: " + damage);
        target.takeDamage(damage);
    }
}
