package shapes;

public abstract class Triangle extends Shape{


    private int id;
    private double perimetr;

    @Override
    public abstract String Draw();

    @Override
    public String toString() {
        return super.toString() + " whit perimetr: " + perimetr;
    }
}
