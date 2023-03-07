package com.company;

import java.util.List;
import java.util.Set;

public interface RepositoryActions<E> {

    boolean addElement(E repositoryElement);

    int countElements();

    RepositoryElement findElement(int index);

    List<E> getAllSortedBy(String field);

    Set<String> getDomains();

}
