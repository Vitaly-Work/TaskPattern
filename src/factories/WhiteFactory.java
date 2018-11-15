package factories;

import shapes.Circle;
import shapes.Triangle;

public class WhiteFactory extends BaseFactory {
	
	public Circle createCircle() {
		return new WhiteCircle();
	}
	
	public Triangle createTriangle() {
		return new WhiteTriangle();
	}
}
