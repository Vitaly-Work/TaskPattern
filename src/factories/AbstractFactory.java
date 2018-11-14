package factories;

import common.Color;

/**
 * Creates factories of given specialization
 * by {@code static} method
 */
public class AbstractFactory {
    public static BaseFactory getFactory(Color color, String name) {
        if (color != null) {
            switch (color) {
                case WHITE:
                    return new WhiteFactory(name);
                case BLACK:
                    return new BlackFactory(name);
            }
        }
        throw new IllegalArgumentException("Color cannot be null!");
    }
}
