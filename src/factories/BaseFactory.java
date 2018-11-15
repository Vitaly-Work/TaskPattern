package factories;

import shapes.*;

public abstract class BaseFactory {
	private String name;
	
	abstract Circle createCircle();
	abstract Triangle createTriangle();
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "BaseFactory [name=" + name + "]";
	}
}
