package shapes;

import common.Material;

public abstract class Shape {

    Material material;

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    private int id;

    abstract public String Draw();
    /*private int id;
    private int xHeadPoint;
    private int yHeadpoint;

    public void SetId(int newId) {
        id = newId;
    }

    public void setXHeadPoint(int newX) {
        xHeadPoint = newX;
    }

    public void setYHeadPoint(int newY) {
        yHeadpoint = newY;
    }

    public int getId() {
        return id;
    }

    public int getXHeadPoint() {
        return xHeadPoint;
    }

    public int getYHeadpoint() {
        return yHeadpoint;
    }
*/
}
