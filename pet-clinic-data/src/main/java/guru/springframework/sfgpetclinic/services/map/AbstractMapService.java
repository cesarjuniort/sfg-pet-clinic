package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.BaseEntity;

import java.util.*;

/**
 * The Base for Map Based Repositories to feed data (In Memory Data) - Not having a H2 DB Maven dependency.
 * Useful for Mocks and UnitTesting Data Providers.
 * Created By:   Cesar Toribio
 * Created Date: 8/8/2018 - 10:46 PM
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {
    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null){
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(),object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry->entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet())+1;
        } catch (NoSuchElementException e){
            nextId = 1L;
        }
        return nextId;
    }

}
