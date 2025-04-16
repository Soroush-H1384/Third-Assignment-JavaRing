package org.project.object.weapons;

import org.project.entity.Entity;

public class TwinDaggers extends Weapon
{
    public TwinDaggers()
    {
        super("Twin Daggers", 12, 10, 15, 20, false);
    }
    @Override
    public void uniqueAbility(Entity target)
    {
        System.out.println("🔪 Twin Daggers strike twice!");
        target.takeDamage(6);
        target.takeDamage(6);
    }
}
