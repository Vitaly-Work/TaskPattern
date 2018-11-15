package shapes;

public class WhiteTriangle extends Triangle{


    private static String colour = "WHITE";
    private int id;
    private double perimeter;

    public WhiteTriangle() {
        this.id = (int) (Math.random()*1000);
        this.perimeter = Math.random()*10;
    }

    @Override
    public String Draw() {
        return colour + " Triangle with id - " + id + " and radius " + perimeter;
    }

}
