package model;

public class Radius<T extends Number> {
    private T radius;
    public Radius(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }
}
