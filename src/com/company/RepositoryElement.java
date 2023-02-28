package com.company;


public abstract class RepositoryElement {

    private String name;


    public RepositoryElement(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

