package Shapes;

public class Square extends Shape {

    private float side;

    public Square (float side) {
        this.side = side;
    }

    @Override
    float computeArea() {
        return side*side;
    }
}