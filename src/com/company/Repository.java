package com.company;

import java.util.ArrayList;
import java.util.List;

public class Repository<E extends RepositoryElement> implements RepositoryActions<E>{
    private String name;
    private List<E> listOfElements = new ArrayList<>();

    public Repository(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean addElement(E repositoryElement) {
        if (this.listOfElements.contains(repositoryElement)) {
            System.out.println(repositoryElement.getName() + " already exits on the list," +
                    "duplicated values are not allowed");
            return false;
        }
        this.listOfElements.add(repositoryElement);
        System.out.println(repositoryElement.getName() + " successfully added to the list");
        return true;
    }

    @Override
    public int countElements() {
        return this.listOfElements.size();
    }

    @Override
    public RepositoryElement findElement(int index) {
        if (index > this.listOfElements.size() - 1 || index < 0) {
            //System.out.println("Index provided is out of bounds");
            return null;
        }
        return this.listOfElements.get(index);
    }


    /*public boolean addElement(E repositoryElement) {
        if (this.listOfElements.contains(repositoryElement)) {
            System.out.println(repositoryElement.getName() + " already exits on the list," +
                    "duplicated values are not allowed");
            return false;
        }
        this.listOfElements.add(repositoryElement);
        System.out.println(repositoryElement.getName() + " successfully added to the list");
        return true;
    }

    public int countElements() {
        return this.listOfElements.size();
    }

    public RepositoryElement findElement(int index) {
        if (index > this.listOfElements.size() - 1 || index < 0) {
            //System.out.println("Index provided is out of bounds");
            return null;
        }
        return this.listOfElements.get(index);
    }*/
}
