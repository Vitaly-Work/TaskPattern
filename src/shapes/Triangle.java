package shapes;

public abstract class Triangle extends Shape{


    private int id;
    private double perimetr;

    @Override
    public abstract String Draw();
/*    private int perimetr;

    public void setPerimetr( int newPerimetr) {
        perimetr = newPerimetr;
    }

    public int getPerimetr() {
        return perimetr;
    }*/
}
