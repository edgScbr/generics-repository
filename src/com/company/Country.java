package com.company;

import java.util.Comparator;

public class Country extends RepositoryElement {

    private String isoCode;

    public Country(String name, String isoCode) {
        super(name);
        this.isoCode = isoCode;
    }

    public String getIsoCode() {
        return isoCode;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name=" + getName() +
                " isoCode='" + isoCode + '\'' +
                '}';
    }

    static final Comparator<Country> ISO_CODE;

    static {
        ISO_CODE = new Comparator<Country>() {
            @Override
            public int compare(Country c1, Country c2) {
                return c1.getIsoCode().compareTo(c2.getIsoCode());
            }
        };
    }

    @Override
    public Comparator<Country> getComparatorByField(String field) {
        switch (field) {
            case "isocode":
                return ISO_CODE;
            case "name":
                return (Comparator<Country>) super.getComparatorByField(field);
            default:
                return null;

        }
    }
}
