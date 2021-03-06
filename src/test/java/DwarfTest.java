import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Dwarf", WeaponType.AXE, 100, 0);
    }

    @Test
    public void canGetType(){
        assertEquals("Dwarf", dwarf.getType());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(WeaponType.AXE, dwarf.getWeapon());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canGetRiches(){
        assertEquals(0, dwarf.getRiches(), 0.1);
    }

    @Test
    public void canWinRiches(){
        dwarf.winRiches(10);
        assertEquals(10, dwarf.getRiches(), 0.1);
    }
}
