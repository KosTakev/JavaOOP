package farmville;

import org.junit.Assert;
import org.junit.Test;

public class FarmvilleTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Farm
    @Test
    public void testConstructorCreateFarm() {
        String name = "Cow farm";
        int capacity = 5;
        Farm farm = new Farm(name, capacity);

        Assert.assertEquals(name, farm.getName());
        Assert.assertEquals(capacity, farm.getCapacity());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorShouldThrowsBecauseNameIsNull() {
        Farm farm = new Farm(null, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorShouldThrowBecauseCapacityIsSmallerThanZero() {
        Farm farm = new Farm("Cow", -1);
    }

    @Test
    public void testIsAnimalRemovedFromTheCollection() {
        Animal cow = new Animal("cow", 20);
        Animal chicken = new Animal("chicken", 10);

    }
}
