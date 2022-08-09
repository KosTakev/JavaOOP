package restaurant.repositories;

import restaurant.entities.healthyFoods.interfaces.HealthyFood;
import restaurant.repositories.interfaces.HealthFoodRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HealthFoodRepositoryImpl implements HealthFoodRepository<HealthyFood> {
    private Map<String, HealthyFood> foodMap;

    public HealthFoodRepositoryImpl() {
        this.foodMap = new LinkedHashMap<>();
    }

    @Override
    public HealthyFood foodByName(String name) {
        return foodMap.get(name);
    }

    @Override
    public Collection<HealthyFood> getAllEntities() {
        return foodMap.values();
    }

    @Override
    public void add(HealthyFood entity) {
        foodMap.put(entity.getName(), entity);
    }
}
