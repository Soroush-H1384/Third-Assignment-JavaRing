package org.project.object.weapons;

import org.project.entity.Entity;

public class MagicStaff extends Weapon
{
    public MagicStaff()
    {
        super("Magic Staff", 15, 20, 10, 10, true);
    }
    @Override
    public void uniqueAbility(Entity target)
    {
        System.out.println("✨ Magic Staff releases a magic pulse!");
        target.takeDamage(10);
    }
}
