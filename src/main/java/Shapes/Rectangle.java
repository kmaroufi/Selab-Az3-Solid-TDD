package Shapes;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float width, float height) {
        if (width <= 0 || height <= 0) throw new IllegalArgumentException();

        this.width = width;
        this.height = height;
    }

    @Override
    public float computeArea(){
        return height * width;
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
