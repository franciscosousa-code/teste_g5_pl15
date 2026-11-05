package pt.ul.fc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Toolbox854Test {

    @Test
    void amplifyWorks() {
        assertEquals(5 * 6, Toolbox854.amplify(5));
        assertEquals(0, Toolbox854.amplify(0));
    }

    @Test
    void areaOfWorks() {
        assertEquals(12, Toolbox854.areaOf(3, 4));
        assertEquals(35, Toolbox854.areaOf(5, 7));
    }

    @Test
    void addWorks() {
        assertEquals(7, Toolbox854.add(3, 4));
        assertEquals(0, Toolbox854.add(-2, 2));
    }

    @Test
    void isEven() {
        assertEquals(true, Toolbox854.even(2));
        assertEquals(true, Toolbox854.even(4));
        assertEquals(true, Toolbox854.even(6));
        assertEquals(true, Toolbox854.even(8));
        assertEquals(true, Toolbox854.even(10));
    }

    @Test
    void isMagnitude(){
        assertEquals(-2, Toolbox854.magnitude(2));
        assertEquals(-4, Toolbox854.magnitude(4));
        assertEquals(-6, Toolbox854.magnitude(6));
        assertEquals(-8, Toolbox854.magnitude(8));
        assertEquals(-10, Toolbox854.magnitude(10));
    }
}
