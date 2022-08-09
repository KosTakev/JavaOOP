package aquarium.entities.aquariums;

import aquarium.common.ConstantMessages;
import aquarium.common.ExceptionMessages;
import aquarium.entities.decorations.Decoration;
import aquarium.entities.fish.Fish;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class BaseAquarium implements Aquarium {
    private String name;
    private int capacity;
    private Collection<Aquarium> aquariums;
    private Collection<Decoration> decorations;
    private Collection<Fish> fish;

    public BaseAquarium(String name, int capacity) {
        setName(name);
        this.capacity = capacity;
        this.decorations = new ArrayList<>();
        this.fish = new ArrayList<>();
        this.aquariums = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.
                    AQUARIUM_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int calculateComfort() {
       return decorations.stream().
                mapToInt(Decoration::getComfort).sum();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void addFish(Fish fish) {
        if(this.capacity > this.fish.size()) {
            throw new IllegalStateException(ConstantMessages.
                    NOT_ENOUGH_CAPACITY);
        }
        this.fish.add(fish);
    }

    @Override
    public void removeFish(Fish fish) {
        this.fish.remove(fish);
    }

    @Override
    public void addDecoration(Decoration decoration) {
        this.decorations.add(decoration);
    }

    @Override
    public void feed() {
        for (Fish fish1 : this.fish) {
            fish1.eat();
        }
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();
        info.append(String.join(getName() + " (" +
                Aquarium.class.getSimpleName() + "):"));
        info.append(System.lineSeparator());
        if (this.fish.size() == 0) {
            info.append("Fish: none");
        } else {
            info.append("Fish: " + String.join(", ", )
        }

        return null;
    }

    @Override
    public Collection<Fish> getFish() {
        return this.fish;
    }

    @Override
    public Collection<Decoration> getDecorations() {
        return this.decorations;
    }
}
