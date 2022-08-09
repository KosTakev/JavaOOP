package restaurant.repositories;

import restaurant.entities.drinks.interfaces.Beverages;
import restaurant.repositories.interfaces.BeverageRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BeverageRepositoryImpl implements BeverageRepository<Beverages> {
    private Map<String, Beverages> beveragesMap;

    public BeverageRepositoryImpl() {
        this.beveragesMap = new LinkedHashMap<>();
    }

    @Override
    public Beverages beverageByName(String drinkName, String drinkBrand) {

        return beveragesMap.get(drinkName);
    }

    @Override
    public Collection<Beverages> getAllEntities() {

        return beveragesMap.values();
    }

    @Override
    public void add(Beverages entity) {

        beveragesMap.put(entity.getName(), entity);
    }
}
