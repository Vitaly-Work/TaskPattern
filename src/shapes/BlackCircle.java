package shapes;

public class BlackCircle extends Circle {

    private static String colour = "BLACK";

    private int id;
    private double radius;

    public BlackCircle() {
        this.id = (int) (Math.random()*1000);
        this.radius = Math.random()*10;
    }

    @Override
    public String Draw() {
        return colour + " Circle with id - " + id + " and radius " + radius;
    }

    @Override
    public String toString() {
        return super.toString() + " BlackCircle";
    }
}
