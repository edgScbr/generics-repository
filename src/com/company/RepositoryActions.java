package com.company;

public interface RepositoryActions<E> {

    public boolean addElement(E repositoryElement);

    public int countElements();

    public RepositoryElement findElement(int index);

}
