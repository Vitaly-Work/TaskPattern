package shapes;

public abstract class Circle extends Shape{

    private int id;
    private double radius;

    @Override
    public abstract String Draw();
/*    private int radius;

    public void setRadius(int newRadius) {
        radius = newRadius;
    }

    public int getRadius() {
        return radius;
    }*/
}
