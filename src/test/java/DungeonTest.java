import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Wizard boss;
    IFight iFight;
    Knight knight;

    @Before
    public void before(){
        boss = new Wizard("Harry", SpellType.FIREBALL, 200, 0);
        dungeon = new Dungeon(boss, 100);
        iFight = new Dwarf("Dwarf", WeaponType.AXE, 100, 0);
        knight = new Knight("Knight", WeaponType.SWORD, 100, 0);

    }

    @Test
    public void canGetBoss(){
        assertEquals(boss, dungeon.getBoss());
    }

    @Test
    public void canGetGold(){
        assertEquals(100, dungeon.getGold(), 0.1);
    }

    @Test
    public void canExitDungeon(){
        assertEquals("Well done, you beat the Boss! You are free to go.", dungeon.exitDungeon());
    }

    @Test
    public void canDefeatBoss(){
        dungeon.fight(knight);
        assertEquals(0, boss.getHealth());
        assertEquals(100, knight.getRiches(), 0.1 );
        assertEquals(0, dungeon.getGold(), 0.1);
    }
}
