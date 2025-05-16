package singleton;

import factory.IceCream;

public class IceCreamShop {
    private static IceCreamShop instance;

    private IceCreamShop() {}

    public static IceCreamShop getInstance() {
        if (instance == null) {
            instance = new IceCreamShop();
        }
        return instance;
    }

    public void serveIceCream(IceCream iceCream) {
        System.out.println("Serving: " + iceCream.getDescription());
    }
}
