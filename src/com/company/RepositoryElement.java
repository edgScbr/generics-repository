package com.company;


import java.util.Comparator;

public abstract class RepositoryElement{

    private String name;


    public RepositoryElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    static final Comparator<RepositoryElement> NAME;

    static {
        NAME = new Comparator<RepositoryElement>() {
            @Override
            public int compare(RepositoryElement e1, RepositoryElement e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
    }

    public Comparator<? extends RepositoryElement> getComparatorByField(String field) {
        if (field.equals("name")) {
            return NAME;
        } else {
            return null;
        }
    }

}

