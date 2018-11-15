package shapes;

import common.Material;

public abstract class Shape {

    private int id;
    private Material material;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    abstract public String Draw();

    @Override
    public String toString() {
        return "Class name: " + getClass().getName() + " whit id: " + id;
    }
}
