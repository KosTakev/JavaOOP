package aquarium.entities.decorations;

public class Plant extends BaseDecoration{
    private static final int PLANT_COMFORT = 5;
    private static final double PLANT_PRICE = 10;

    protected Plant() {
        super(PLANT_COMFORT, PLANT_PRICE);
    }
}
