package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static junit.framework.Assert.assertEquals;

public class ManagerTest {

    Manager newManager;

    @Before
    public void before() {
        newManager = new Manager("Neil Warnock", 65, MALE, 0.80);
    }

    @Test
    public void testManagerSetup() {
        assertEquals("Neil Warnock", newManager.getPersonName());
        assertEquals(65, newManager.getPersonAge());
        assertEquals(MALE, newManager.getSex());
        assertEquals(0.8, newManager.getManagerForm());
    }

    @Test
    public void testSetManagerForm() {
        newManager.setManagerForm(0.85);
        assertEquals(0.85, newManager.getManagerForm());
    }

    @Test
    public void testSetManagerName() {
        newManager.setPersonName("Rhys Brame");
        assertEquals("Rhys Brame", newManager.getPersonName());
    }
}
