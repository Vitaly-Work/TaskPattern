package factories;

import shapes.*;

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
}
