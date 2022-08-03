package catHouse.entities.cat;

public class ShorthairCat extends BaseCat {

    private static int kilograms = 7;

    public ShorthairCat(String name, String breed, double price) {

        super(name, breed, price);
    }

    @Override
    public void eating() {

        kilograms += 1;
    }
}
