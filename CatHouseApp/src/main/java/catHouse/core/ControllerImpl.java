package catHouse.core;

import catHouse.entities.houses.BaseHouse;
import catHouse.entities.houses.House;
import catHouse.entities.houses.LongHouse;
import catHouse.entities.houses.ShortHouse;
import catHouse.entities.toys.Ball;
import catHouse.entities.toys.Toy;
import catHouse.repositories.ToyRepository;

import java.util.ArrayList;
import java.util.Collection;

import static catHouse.common.ConstantMessages.SUCCESSFULLY_ADDED_CAT_IN_HOUSE;
import static catHouse.common.ConstantMessages.SUCCESSFULLY_ADDED_HOUSE_TYPE;
import static catHouse.common.ExceptionMessages.*;

public class ControllerImpl implements Controller {
    private ToyRepository toys;
    private Collection<House> houses;

    public ControllerImpl() {
        toys = new ToyRepository();
        houses = new ArrayList<>();
    }

    @Override
    public String addHouse(String type, String name) {
        if (type.equals("ShortHouse")) {
            House NewHouse = new ShortHouse(name);
            houses.add(NewHouse);
        } else if (type.equals("LongHouse")) {
            House NewHouse = new LongHouse(name);
            houses.add(NewHouse);
        } else {
            throw new NullPointerException(INVALID_HOUSE_TYPE);
        }
        return String.format(SUCCESSFULLY_ADDED_HOUSE_TYPE, type);
    }

    @Override
    public String buyToy(String type) {
        if (!type.equals("Ball") || !type.equals("Mouse")) {
            throw new IllegalArgumentException(INVALID_TOY_TYPE);
        }
        return null;
    }

    @Override
    public String toyForHouse(String houseName, String toyType) {
        if (toys.)
        return null;
    }

    @Override
    public String addCat(String houseName, String catType,
                         String catName, String catBreed, double price) {
        if (!catType.equals("ShorthairCat") || !catType.equals("LonghairCat")) {
            throw new IllegalArgumentException(INVALID_CAT_TYPE);
        }
        if (catType.equals("ShorthairCat")) {

        }

        return null;
    }

    @Override
    public String feedingCat(String houseName) {
        return null;
    }

    @Override
    public String sumOfAll(String houseName) {
        return null;
    }

    @Override
    public String getStatistics() {
        return null;
    }
}
