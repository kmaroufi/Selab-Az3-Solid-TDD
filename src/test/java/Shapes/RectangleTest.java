package Shapes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RectangleTest {
    @Test
    public void testConstructor() {
        Assertions.assertDoesNotThrow(() -> new Rectangle(3, 5));
        Assertions.assertDoesNotThrow(() -> new Rectangle(10.5f, 4.597f));
        Assertions.assertDoesNotThrow(() -> new Rectangle(0.1f, 0.7f));
        Assertions.assertDoesNotThrow(() -> new Rectangle(789000.567f, 657000.123f));
    }

    @Test
    public void testConstructorWithIllegalArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 10));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-57.6f, 3.5f));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 5.7f));

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -4));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(23.3f, -9.9f));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(5.7f, 0));

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-10, -8));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(-4.5f, -5.5f));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, 0));
    }

    @Test
    public void testComputeArea() {
        Assertions.assertEquals(new Rectangle(3, 4).computeArea(), 12);
        Assertions.assertEquals(new Rectangle(10.1f, 7.5f).computeArea(), 75.75f);
    }

    @Test
    public void testGetWidth() {
        Assertions.assertEquals(new Rectangle(5.5f, 10.5f).getWidth(), 5.5f);
    }

    @Test
    public void testSetWidth() {
        Rectangle rectangle = new Rectangle(5.5f, 10.5f);

        Assertions.assertDoesNotThrow(() -> rectangle.setWidth(15f));
        Assertions.assertEquals(rectangle.getWidth(), 15f);
    }

    @Test
    public void testSetWidthWithIllegalArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rectangle(5.5f, 10.5f).setWidth(-10.5f));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rectangle(5.5f, 10.5f).setWidth(0));
    }

    @Test
    public void testGetHeight(){
        Assertions.assertEquals(new Rectangle(20.5f, 33.1f).getHeight(), 33.1f);
    }

    @Test
    public void testSetHeight() {
        Rectangle rectangle = new Rectangle(20.5f, 33.1f);

        Assertions.assertDoesNotThrow(() -> rectangle.setHeight(57.7f));
        Assertions.assertEquals(rectangle.getHeight(), 57.7f);
    }

    @Test
    public void testSetHeightWithIllegalArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rectangle(5.5f, 10.5f).setHeight(-15.5f));
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Rectangle(5.5f, 10.5f).setHeight(0));
    }
}
