import decorator.ChocolateGlaze;
import decorator.ChocolateSticks;
import factory.IceCream;
import factory.IceCreamFactory;
import singleton.IceCreamShop;

public class IceCreamShopApp {
    public static void main(String[] args) {
        IceCreamShop shop = IceCreamShop.getInstance();

        IceCream vanilla = IceCreamFactory.createIceCream("vanilla");

        IceCream chocolateWithGlaze = new ChocolateGlaze(
                IceCreamFactory.createIceCream("chocolate")
        );
        IceCream strawberryWithSticks = new ChocolateSticks(
                IceCreamFactory.createIceCream("strawberry")
        );

        shop.serveIceCream(vanilla);
        shop.serveIceCream(chocolateWithGlaze);
        shop.serveIceCream(strawberryWithSticks);

    }
}
