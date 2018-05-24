import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class KnightTest {
        Knight knight;

        @Before
        public void before(){
            knight = new Knight("Knight", WeaponType.SWORD, 100);
        }

        @Test
        public void canGetType(){
            assertEquals("Knight", knight.getType());
        }

        @Test
        public void canGetWeapon(){
            assertEquals(WeaponType.SWORD, knight.getWeapon());
        }

        @Test
        public void canGetHealth(){
            assertEquals(100, knight.getHealth());
        }
    }

