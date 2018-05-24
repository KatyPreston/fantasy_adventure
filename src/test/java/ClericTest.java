import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric(200, RegenTools.BLUEPOTION);
    }

    @Test
    public void canGetHealth(){
        assertEquals(200, cleric.getHealth());
    }

    @Test
    public void canGetRegenTool(){
        assertEquals(RegenTools.BLUEPOTION, cleric.getRegenTools());
    }


    }
