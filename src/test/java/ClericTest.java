import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;
    Knight knight;

    @Before
    public void before(){
        cleric = new Cleric(200, RegenTools.BLUEPOTION);
        knight = new Knight("Knight", WeaponType.SWORD, 100);
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


    }
