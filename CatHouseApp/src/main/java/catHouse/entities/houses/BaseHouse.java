package catHouse.entities.houses;

import catHouse.entities.cat.Cat;
import catHouse.entities.toys.Toy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

import static catHouse.common.ConstantMessages.NOT_ENOUGH_CAPACITY_FOR_CAT;
import static catHouse.common.ExceptionMessages.HOUSE_NAME_CANNOT_BE_NULL_OR_EMPTY;

public abstract class BaseHouse implements House {

    private String name;
    private int capacity;
    private Collection<Toy> toys;
    private Collection<Cat> cats;


    protected BaseHouse(String name, int capacity) {
        setName(name);
        this.capacity = capacity;
        this.toys = new ArrayList<>();
        this.cats = new ArrayList<>();

    }

    @Override
    public int sumSoftness() {

        int sumSoftness = toys.stream().mapToInt(Toy::getSoftness).sum();
        return sumSoftness;
    }

    @Override
    public void addCat(Cat cat) {
        if (cats.size() < capacity) {
            cats.add(cat);
        } else {
            throw new IllegalStateException(NOT_ENOUGH_CAPACITY_FOR_CAT);
        }
    }

    @Override
    public void removeCat(Cat cat) {
        if (!cats.isEmpty()) {
            cats.remove(cat);
        }
    }

    @Override
    public void buyToy(Toy toy) {
        toys.add(toy);
    }

    @Override
    public void feeding() {
        for (Cat cat : cats) {
            cat.eating();
        }
    }

    @Override
    public String getStatistics() {
//        String statistic = "";
//        if (cats.isEmpty()) {
//            statistic = "none";
//        } else {
//            statistic = String.join(getName() + setName(this.name) + ":\n" +
//                    "Cats: {catName1} {catName2} {catName3} ... / Cats: none\n" +
//                    "Toys: {toysCount} Softness: {sumSoftness}",
//                    , setName(this.name);)
//        }
        return null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(HOUSE_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<Cat> getCats() {
        return null;
    }

    @Override
    public Collection<Toy> getToys() {
        return null;
    }
}
