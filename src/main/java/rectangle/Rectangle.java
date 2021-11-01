package rectangle;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException();

        this.width = width;
        this.height = height;
    }

    public float computeArea() {
        return width * height;
    }

    public void setWidth(float width) {
        if (width <= 0) throw new IllegalArgumentException();

        this.width = width;
    }

    public void setHeight(float height) {
        if (height <= 0) throw new IllegalArgumentException();

        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
