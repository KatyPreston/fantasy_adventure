import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;
    Knight knight;

    @Before
    public void before(){
        cleric = new Cleric(200, RegenTools.BLUEPOTION, 0);
        knight = new Knight("Knight", WeaponType.SWORD, 100, 0);
    }

    @Test
    public void canGetHealth(){
        assertEquals(200, cleric.getHealth());
    }

    @Test
    public void canGetRegenTool(){
        assertEquals(RegenTools.BLUEPOTION, cleric.getRegenTools());
    }

    @Test
    public void canGetRiches(){
        assertEquals(0, cleric.getRiches(), 0.1);
    }

    @Test
    public void canChangeRegenTool(){
        cleric.setRegenTool(RegenTools.REDPOTION);
        assertEquals(RegenTools.REDPOTION, cleric.getRegenTools());
    }

    @Test
    public void canHealAlly(){
        knight.takeDamage(55);
        cleric.attack(knight);
        assertEquals(95, knight.getHealth());
    }

    @Test
    public void canWinRiches(){
        cleric.winRiches(10);
        assertEquals(10, cleric.getRiches(), 0.1);
    }


    }
