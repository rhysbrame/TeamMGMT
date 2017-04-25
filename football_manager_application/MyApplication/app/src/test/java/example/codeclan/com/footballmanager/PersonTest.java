package example.codeclan.com.footballmanager;

import org.junit.Before;

import static example.codeclan.com.footballmanager.Sex.*;

public class PersonTest {

    Person newPerson;

    @Before
    public void before() {
        newPerson = new Person("Kenneth Zohore", 25, MALE);
    }

    @Test
}
