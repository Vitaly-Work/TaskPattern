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

    @Override
    public String toString() {
        return getClass().getSimpleName() + " of " + material;
    }
}
