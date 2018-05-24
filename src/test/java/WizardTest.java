import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {
    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Harry", SpellType.FIREBALL, 150);
    }

    @Test
    public void canGetName(){
        assertEquals("Harry", wizard.getName());
    }

    @Test
    public void canGetSpell(){
        assertEquals(SpellType.FIREBALL, wizard.getSpell());
    }

    @Test
    public void canGetHealth(){
        assertEquals(150, wizard.getHealth());
    }
}
