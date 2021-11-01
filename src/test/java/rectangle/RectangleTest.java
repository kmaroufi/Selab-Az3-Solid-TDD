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
}
