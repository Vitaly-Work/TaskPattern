package shapes;

public class BlackTriangle extends Triangle {


    private static String colour = "BLACK";
    private int id;
    private double perimeter;

    public BlackTriangle() {
        this.id = (int) (Math.random()*1000);
        this.perimeter =  Math.random()*10;
    }

    @Override
    public String Draw() {
        return colour + " Triangle with id - " + id + " and radius " + perimeter;
    }
}
