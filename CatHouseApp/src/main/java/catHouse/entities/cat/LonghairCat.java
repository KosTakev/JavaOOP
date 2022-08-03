package catHouse.entities.cat;

public class LonghairCat extends BaseCat{

    private static int kilograms;

    public LonghairCat(String name, String breed, double price) {
        super(name, breed, price);
        kilograms = 9;
    }

    @Override
    public void eating() {
       kilograms += 3;
    }
}
