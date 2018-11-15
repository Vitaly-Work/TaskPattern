package factories;

import common.Color;

/**
 * Creates factories of given specialization and name
 * by {@code static} method
 */
public class AbstractFactory {
    public static BaseFactory getFactory(Color color, String fabName) {
        if (color != null) {
            BaseFactory f;
            switch (color) {
                case WHITE:
                    f = new WhiteFactory();
                    f.setName(fabName.toUpperCase());
                    return f;
                case BLACK:
                    f = new BlackFactory();
                    f.setName(fabName.toUpperCase());
                    return f;
                default:
                    throw new IllegalArgumentException("This color is not supported now!");
            }
        }
        throw new IllegalArgumentException("Color cannot be null!");
    }
}
