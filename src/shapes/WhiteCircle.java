package shapes;

public class WhiteCircle extends Circle {


    private static String colour = "WHITE";
    private int id;
    private double radius;

    public WhiteCircle() {
        this.id = (int) (Math.random()*1000);
        this.radius = Math.random()*10;
    }

    @Override
    public String Draw() {
        return colour + " Circle with id - " + id + " and radius " + radius;
    }
}
