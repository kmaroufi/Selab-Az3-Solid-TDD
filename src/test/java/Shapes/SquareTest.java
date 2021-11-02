package Shapes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SquareTest {

    Square square = new Square(3);


    @Test
    public void testConstructor() {
        Assertions.assertDoesNotThrow(() -> new Square(6));
        Assertions.assertDoesNotThrow(() -> new Square(126.4f));


    }

    @Test
    public void testConstructorWithIllegalArqument() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Square(-4.3f));

    }

    @Test
    public void computeArea() {
        assertEquals(9, square.computeArea());
    }


    @Test
    public void setSide() {
        square.setSide(4);
        assertEquals(4, square.getSide());
    }

    @Test
    public void testSetSideWithIllegalArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                square.setSide(-10.5f));
    }

    @Test
    public void getSide() {
        assertEquals(3, square.getSide());
    }


}
