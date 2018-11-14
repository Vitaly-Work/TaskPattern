import static common.Color.*;

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

        //demonstrate shapes to user

    }
}
