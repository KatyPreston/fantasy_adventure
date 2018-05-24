import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonTest {

    Dungeon dungeon;
    Wizard boss;

    @Before
    public void before(){
        boss = new Wizard("Harry", SpellType.FIREBALL, 200);
        dungeon = new Dungeon(boss);
    }

    @Test
    public void canGetBoss(){
        assertEquals(boss, dungeon.getBoss());
    }
}
