import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WizardTest {
    Wizard wizard;
    Dragon dragon;

    @Before
    public void before(){
        wizard = new Wizard("Harry", SpellType.FIREBALL, 150, 0);
        dragon = new Dragon("Dragon", 50);
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

    @Test
    public void canGetRiches(){
        assertEquals(0, wizard.getRiches(), 0.1);
    }

    @Test
    public void canChangeSpell(){
        wizard.setSpell(SpellType.WATERBLAST);
        assertEquals(SpellType.WATERBLAST, wizard.getSpell());
    }

    @Test
    public void canCallFamiliar(){
        wizard.callFamiliar(dragon);
        assertEquals(dragon, wizard.getFamiliar());
    }

    @Test
    public void canAddFamiliarToHealth(){
        wizard.callFamiliar(dragon);
        assertEquals(200, wizard.getHealth());
    }

    @Test
    public void onlyAddsHealthIfHaveFamiliar(){
        assertEquals(150, wizard.getHealth());
    }
}
