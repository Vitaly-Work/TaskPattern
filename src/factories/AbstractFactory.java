package factories;

import common.Color;

/**
 * Creates factories of given specialization
 * by {@code static} method
 */
public class AbstractFactory {
    public static BaseFactory getFactory(Color color, String fabName) {
        BaseFactory f = null;
        if (color != null) {
            switch (color) {
                case WHITE:
                    f = new WhiteFactory();
                    f.setName(fabName);
                    return f;
                case BLACK:
                    f = new BlackFactory();
                    f.setName(fabName);
                    return f;
                default:
                    throw new IllegalArgumentException("This color is not supported now!");
            }
        }
        throw new IllegalArgumentException("Color cannot be null!");
    }
}
