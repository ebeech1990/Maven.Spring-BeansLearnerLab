package com.example.demo.models;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class People<PersonType extends Person> {

    private List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public People(PersonType... peeps){
        personList = Arrays.asList(peeps);
    }

    public void add(PersonType p){
        personList.add(p);
    }

    public void remove(PersonType p){
        personList.remove(p);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> list){
        personList.addAll((Collection<? extends PersonType>) list);
    }

    public PersonType findById(long id){
        return personList.stream()
                .filter(p -> p.getID()==id)
                .findAny()
                .orElse(null);
    }

    public List<PersonType> findAll(){
        return personList;
    }
}
