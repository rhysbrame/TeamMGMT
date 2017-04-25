package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.Sex.*;
import static junit.framework.Assert.assertEquals;

public class PersonTest {

    Person newPerson;

    @Before
    public void before() {
        newPerson = new Person("Kenneth Zohore", 25, MALE);
    }

    @Test
    public void testPersonSetup() {
        assertEquals("Kenneth Zohore", newPerson.getPersonName());
        assertEquals(MALE, newPerson.getSex());
        assertEquals(25, newPerson.getPersonAge());
    }

    @Test
    public void testSetPersonName() {
        newPerson.setPersonName("Craig Bellamy");
        assertEquals("Craig Bellamy", newPerson.getPersonName());
    }

    @Test
    public void testSetPersonAge() {
        newPerson.setPersonAge(35);
        assertEquals(35, newPerson.getPersonAge());
    }

    @Test
    public void testSetSex() {
        newPerson.setSex(OTHER);
        assertEquals(OTHER, newPerson.getSex());
    }
}
