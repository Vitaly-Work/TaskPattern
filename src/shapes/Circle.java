package shapes;

public abstract class Circle extends Shape{


    private int id;
    private double radius;

    @Override
    public abstract String Draw();

    @Override
    public String toString() {
        return super.toString() + " whit radius: " + radius;
    }
}
