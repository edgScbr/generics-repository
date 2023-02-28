package com.company;

public class User extends RepositoryElement {
    private String userName;
    private String lastName;

    public User(String name, String userName, String lastName) {
        super(name);
        this.userName = userName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                "name=" + getName() +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
