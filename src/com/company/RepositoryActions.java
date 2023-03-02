package com.company;

public interface RepositoryActions<E> {

    boolean addElement(E repositoryElement);

    int countElements();

    RepositoryElement findElement(int index);

}
