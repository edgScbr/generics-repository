package com.company;

import java.util.*;

public class Repository<E extends RepositoryElement> implements RepositoryActions<E> {
    private String name;
    private List<E> listOfElements = new ArrayList<>();

    public Repository(String name) {
        this.name = name;
    }


    @Override
    public boolean addElement(E repositoryElement) {
        if (validate(repositoryElement)) {
            this.listOfElements.add(repositoryElement);
            System.out.println(repositoryElement.getName() + " successfully added to the list");
            return true;
        }
        return false;
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

    @Override
    public List<E> getAllSortedBy(String field) {
        field = field.toLowerCase();
        if (!listOfElements.isEmpty()) {
            Comparator comparator = (Comparator<? super E>) this.listOfElements.get(0).getComparatorByField(field);
            if (comparator != null) {
                this.listOfElements.sort(comparator);
                return this.listOfElements;
            } else {
                System.out.println("field not valid");
                return null;
            }
        }
        return null;
    }

    @Override
    public Set<String> getDomains() {
        Set<String> domains = new HashSet<>();
        if (this.listOfElements.get(0) instanceof User) {
            List<User> list = (List<User>) this.listOfElements;
            for (User user : list) {
                String[] split = user.getEmail().split("@");
                domains.add(split[1]);
            }
        }
        return domains;
    }

    private boolean validate(E repositoryElement) {
        if (repositoryElement instanceof Country) {
            Country newElement = (Country) repositoryElement;
            Iterator<E> iterator = this.listOfElements.iterator();
            while (iterator.hasNext()) {
                Country current = (Country) iterator.next();
                if (newElement.getIsoCode().equals(current.getIsoCode())) {
                    System.out.println("Country isoCode already on the list");
                    return false;
                }
            }
        } else if (repositoryElement instanceof User) {
            User newElement = (User) repositoryElement;
            Iterator<E> iterator = this.listOfElements.iterator();
            while (iterator.hasNext()) {
                User current = (User) iterator.next();
                if (newElement.getEmail().equals(current.getEmail())) {
                    System.out.println("User email already on the list");
                    return false;
                }
            }
        } else {
            Product newElement = (Product) repositoryElement;
            Iterator<E> iterator = this.listOfElements.iterator();
            while (iterator.hasNext()) {
                Product current = (Product) iterator.next();
                if (newElement.getName().equalsIgnoreCase(current.getName())) { // Also tried .toLowercase method
                    current.setStock(current.getStock() + newElement.getStock());
                    System.out.println("Product name already on the list, stock updated");
                    return false;
                }
            }
        }
        return true;
    }


}
