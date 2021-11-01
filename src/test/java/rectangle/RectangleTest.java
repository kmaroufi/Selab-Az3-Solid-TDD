package rectangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class RectangleTest {
    public Random random;

    @BeforeEach
    public void before() {
        random = new Random();
    }

    @Test
    public void testConstructor(){
        float width = random.nextFloat() * 10;
        float height = random.nextFloat() * 10f;
        Assertions.assertDoesNotThrow(() -> new Rectangle(width, height));
    }

    @Test
    public void testConstructorWithNonPositiveWidth(){
        float width = random.nextFloat() * -10f - 0.1f;
        float height = random.nextFloat() * 10f;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(width, height));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(0, height));
    }

    @Test
    public void testConstructorWithNonPositiveHeight(){
        float width = random.nextFloat() * 10f;
        float height = random.nextFloat() * -10f - 0.1f;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(width, height));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Rectangle(width, 0));
    }

    @Test
    public void testComputeArea() {
        float width = random.nextFloat() * 10f;
        float height = random.nextFloat() * 10f;
        Rectangle rectangle = new Rectangle(width, height);

        Assertions.assertEquals(rectangle.computeArea(), width * height);
    }

    @Test
    public void testSetAndGetWidth() {
        float width = random.nextFloat() * 10f;
        float height = random.nextFloat() * 10f;
        Rectangle rectangle = new Rectangle(width, height);

        float newWidth = random.nextFloat() * 10f;
        Assertions.assertDoesNotThrow(() -> rectangle.setWidth(newWidth));
        Assertions.assertEquals(rectangle.getWidth(), newWidth);
    }

    @Test
    public void testSetAndGetHeight() {
        float width = random.nextFloat() * 10f;
        float height = random.nextFloat() * 10f;
        Rectangle rectangle = new Rectangle(width, height);

        float newHeight = random.nextFloat() * 10f;
        Assertions.assertDoesNotThrow(() -> rectangle.setHeight(newHeight));
        Assertions.assertEquals(rectangle.getHeight(), newHeight);
    }

    @Test
    public void testSetWidthWithNonPositiveValue() {
        float width = random.nextFloat() * 10f;
        float height = random.nextFloat() * 10f;
        Rectangle rectangle = new Rectangle(width, height);

        float newWidth = random.nextFloat() * -10f - 0.1f;
        Assertions.assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(newWidth));

        Assertions.assertThrows(IllegalArgumentException.class, () -> rectangle.setWidth(0));
    }

    @Test
    public void testSetHeightWithNonPositiveValue() {
        float width = random.nextFloat() * 10f;
        float height = random.nextFloat() * 10f;
        Rectangle rectangle = new Rectangle(width, height);

        float newHeight = random.nextFloat() * -10f - 0.1f;
        Assertions.assertThrows(IllegalArgumentException.class, () -> rectangle.setHeight(newHeight));

        Assertions.assertThrows(IllegalArgumentException.class, () -> rectangle.setHeight(0));
    }
}
