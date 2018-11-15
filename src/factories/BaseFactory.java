package factories;

import common.Material;
import shapes.Circle;
import shapes.Triangle;

import java.util.NoSuchElementException;
import java.util.Random;

public abstract class BaseFactory {
    private String name;

    protected Material getNewMaterial() {
        Material[] m = Material.values();
        if (m.length > 0) {
            return m[new Random().nextInt(m.length)];
        }
        throw new NoSuchElementException();
    }

    abstract public Circle createCircle();

    abstract public Triangle createTriangle();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " named \"" + name.toUpperCase() + "\"";
    }
}
