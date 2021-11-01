package rectangle;

public class Rectangle {
    public float width;
    public float height;

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float computeArea() {
        return width * height;
    }
}
