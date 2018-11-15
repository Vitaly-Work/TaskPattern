import static common.Color.*;
import shapes.*;

import factories.AbstractFactory;
import factories.BaseFactory;

public class Runner {
    public static void main(String[] args) {
        //create factories
        BaseFactory wf = AbstractFactory.getFactory(WHITE, "Kyiv sweets");
        System.out.println("Built: " + wf);
        BaseFactory bf = AbstractFactory.getFactory(BLACK, "Lviv chocolate");
        System.out.println("Built: " + bf);

        //create shapes on factories
        System.out.println("Create circles on " + wf);
        for (int i=0; i<3; i++){
            Shape sh = wf.createCircle();
            System.out.println(  sh);
        }

        System.out.println("Create circles on " + wf);
        for (int i=0; i<3; i++){
            Shape sh = bf.createCircle();
            System.out.println("   " +sh);
        }

        System.out.println("Create triangle on " + wf);
        for (int i=0; i<3; i++){
            Shape sh = wf.createTriangle();
            System.out.println("   " +sh);
        }
        System.out.println("Create triangle on " + wf);
        for (int i=0; i<3; i++){
            Shape sh = bf.createTriangle();
            System.out.println("   " +sh);
        }



        //demonstrate shapes to user



    }
}
