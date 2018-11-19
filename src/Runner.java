import static common.Color.*;

import shapes.Circle;
import shapes.Triangle;
import factories.AbstractFactory;
import factories.BaseFactory;

public class Runner {
    public static void main(String[] args) {
        BaseFactory wf = AbstractFactory.getFactory(WHITE, "Kyiv sweets");
        System.out.println("Built: " + wf);
        BaseFactory bf = AbstractFactory.getFactory(BLACK, "Lviv chocolate");
        System.out.println("Built: " + bf);

        System.out.println("\nCreating circles on " + wf);
        for (int i = 0; i < 3; i++) {
            Circle c = wf.createCircle();
            System.out.println("   " + c);
        }
        System.out.println("\nCreating circles on " + bf);
        for (int i = 0; i < 3; i++) {
            Circle c = bf.createCircle();
            System.out.println("   " + c);
        }
        System.out.println("\nCreating triangles on " + wf);
        for (int i = 0; i < 3; i++) {
            Triangle t = wf.createTriangle();
            System.out.println("   " + t);
        }
        System.out.println("\nCreating triangles on " + bf);
        for (int i = 0; i < 3; i++) {
            Triangle t = bf.createTriangle();
            System.out.println("   " + t);
        }
    }
}
