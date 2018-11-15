package factories;

import shapes.*;


public abstract class BaseFactory {
	
	abstract Circle createCircle();
	abstract Triangle createTriangle();
}
