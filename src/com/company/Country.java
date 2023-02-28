package com.company;

public class Country extends RepositoryElement{

    private String isoCode;

    public Country(String name, String isoCode) {
        super(name);
        this.isoCode = isoCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name=" + getName() +
                " isoCode='" + isoCode + '\'' +
                '}';
    }
}
