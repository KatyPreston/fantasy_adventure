import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Wizard boss;
    IFight iFight;

    @Before
    public void before(){
        boss = new Wizard("Harry", SpellType.FIREBALL, 200);
        dungeon = new Dungeon(boss);
        iFight = new Dwarf("Dwarf", WeaponType.AXE, 100);
    }

    @Test
    public void canGetBoss(){
        assertEquals(boss, dungeon.getBoss());
    }

    @Test
    public void canExitDungeon(){
        assertEquals("Well done, you beat the Boss! You are free to go.", dungeon.exitDungeon());
    }

    @Test
    public void canDefeatBoss(){
        dungeon.fight(iFight);
        assertEquals(0, boss.getHealth());
    }
}
