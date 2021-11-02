package Shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class SquareTest {

    Square square = new Square(3);

    @Test
    public void getArea() {
        assertEquals(9,square.computeArea());
    }
}
