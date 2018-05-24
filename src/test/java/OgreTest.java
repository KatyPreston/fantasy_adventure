import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {
    Ogre ogre;

    @Before
    public void before(){
        ogre = new Ogre("Ogre", 50);
    }

    @Test
    public void canGetType(){
        assertEquals("Ogre", ogre.getType());
    }

    @Test
    public void canGetHealth(){
        assertEquals(50, ogre.getHealth());
    }
}
