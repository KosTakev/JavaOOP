package glacialExpedition.repositories;

import glacialExpedition.models.states.State;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StateRepository implements Repository<State> {
    private Map<String, State> unexploredStates;

    public StateRepository() {
        this.unexploredStates = new LinkedHashMap<>();
    }

    @Override
    public Collection getCollection() {
        return Collections.unmodifiableCollection(this.unexploredStates.values());
    }

    @Override
    public void add(State state) {
        unexploredStates.put(state.getName(), state);
    }

    @Override
    public boolean remove(State state) {
        return unexploredStates.remove(state.getName()) != null;
    }

    @Override
    public State byName(String name) {
        return unexploredStates.get(name);
    }
}
