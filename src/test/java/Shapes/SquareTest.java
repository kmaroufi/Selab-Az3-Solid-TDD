package Shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class SquareTest {

    Square square = new Square(3);

    @Test
    public void computeArea() {
        assertEquals(9,square.computeArea());
    }


    @Test
    public void setSide() {
        square.setSide(4);
        assertEquals(4,square.getSide());
    }

    @Test
    public void getSide() {
        assertEquals(3,square.getSide());
    }

}
