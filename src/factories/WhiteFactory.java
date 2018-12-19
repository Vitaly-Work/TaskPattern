package factories;

import shapes.Circle;
import shapes.Triangle;
import shapes.WhiteCircle;
import shapes.WhiteTriangle;

public class WhiteFactory extends BaseFactory {

    public Circle createCircle() {
        Circle item = new WhiteCircle();
        item.setMaterial(getNewMaterial());
        return item;
    }

    public Triangle createTriangle() {
        Triangle item = new WhiteTriangle();
        item.setMaterial(getNewMaterial());
        return item;
    }

    @Override
    public String toString() {
        return "White Factory named " + getName();
    }
}
