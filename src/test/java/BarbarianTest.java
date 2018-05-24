import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    IFight barbarian2;

    @Before
    public void before(){
        barbarian = new Barbarian("Barbarian", WeaponType.CLUB, 100);
        barbarian2 = new Barbarian( "Barbarian", WeaponType.CLUB, 100);
    }

    @Test
    public void canGetType(){
        assertEquals("Barbarian", barbarian.getType());
    }

    @Test
    public void canGetWeapon(){
        assertEquals(WeaponType.CLUB, barbarian.getWeapon());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void canTakeDamage(){
        barbarian.takeDamage(20);
        assertEquals(80, barbarian.getHealth());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.setWeapon(WeaponType.SWORD);
        assertEquals(WeaponType.SWORD, barbarian.getWeapon());
    }

    @Test
    public void dealDamage(){
        barbarian = new Barbarian("Barbarian", WeaponType.CLUB, 100);
        barbarian2.attack(barbarian);
        assertEquals(95, barbarian.getHealth());
    }
}
