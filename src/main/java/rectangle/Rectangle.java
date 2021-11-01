package rectangle;

public class Rectangle {
    public float width;
    public float height;

    public Rectangle(float width, float height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException();

        this.width = width;
        this.height = height;
    }

    public float computeArea() {
        return width * height;
    }
}
