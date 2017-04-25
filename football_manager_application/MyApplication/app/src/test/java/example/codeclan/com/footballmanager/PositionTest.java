package example.codeclan.com.footballmanager;

import org.junit.Before;
import org.junit.Test;

import static example.codeclan.com.footballmanager.PositionType.ATTACKER;
import static example.codeclan.com.footballmanager.PositionType.GOALKEEPER;
import static junit.framework.Assert.assertEquals;

public class PositionTest {

    Position newPosition;

    @Before
    public void before() {
        newPosition = new Position(GOALKEEPER, 1);
    }

    @Test
    public void testPositionSetup() {
        assertEquals(GOALKEEPER, newPosition.getPositionType());
        assertEquals(1, newPosition.getPositionNumber());
    }

    @Test
    public void testSetPositionType() {
        newPosition.setPositionType(ATTACKER);
        assertEquals(ATTACKER, newPosition.getPositionType());
    }

    @Test
    public void testSetPositionNumber() {
        newPosition.setPositionNumber(10);
        assertEquals(10, newPosition.getPositionNumber());
    }
}
