package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    List<PersonType> list = new ArrayList<>();

    public void add(PersonType person){
        list.add(person);
    }

    public PersonType findByID(Long id){
        for(PersonType person : list){
            if(person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public boolean contains(PersonType person){
        return list.contains(person);
    }

    public void remove(Long id){
        remove(findByID(id));
    }

    public void remove(PersonType person){
        list.remove(person);
    }

    public void removeAll(){
        list.removeAll(list);
    }

    public int count(){
        return list.size();
    }

    abstract public PersonType[] toArray();

    @Override
    public Iterator iterator() {
        return list.iterator();
    }


}
