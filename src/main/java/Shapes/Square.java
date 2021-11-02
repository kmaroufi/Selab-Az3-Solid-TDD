package Shapes;

public class Square extends Shape {

    private float side;

    public Square (float side) {
        if (side <= 0) throw new IllegalArgumentException();
        this.side = side;
    }

    @Override
    float computeArea() {
        return side*side;
    }


    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        if (side <= 0) throw new IllegalArgumentException();
        this.side = side;
    }



}