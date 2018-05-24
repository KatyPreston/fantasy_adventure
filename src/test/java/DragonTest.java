import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Dragon", 80);
    }

    @Test
    public void canGetType(){
        assertEquals("Dragon", dragon.getType());
    }

    @Test
    public void canGetHealth(){
        assertEquals(80, dragon.getHealth());
    }
}
