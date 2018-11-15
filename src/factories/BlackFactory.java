package factories;

import shapes.*;

public class BlackFactory extends BaseFactory {
	
	public Circle createCircle() {
		return new BlackCircle();
	}
	
	public Triangle createTriangle() {
		return new BlackTriangle();
	}
}
