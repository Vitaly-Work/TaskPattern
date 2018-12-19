package factories;

import shapes.Circle;
import shapes.Triangle;
import shapes.BlackCircle;
import shapes.BlackTriangle;

public class BlackFactory extends BaseFactory {

    public Circle createCircle() {
        Circle item = new BlackCircle();
        item.setMaterial(getNewMaterial());
        return item;
    }

    public Triangle createTriangle() {
        Triangle item = new BlackTriangle();
        item.setMaterial(getNewMaterial());
        return item;
    }

    @Override
    public String toString() {
        return "Black Factory named " + getName();
    }
}
