package com.company;

import java.util.Comparator;


public class User extends RepositoryElement {
    private String userName;
    private String lastName;
    private String email;

    public User(String name, String userName, String lastName, String email) {
        super(name);
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    static final Comparator<User> LAST_NAME;

    static {
        LAST_NAME = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getLastName().compareTo(u2.getLastName());
            }
        };
    }

    static final Comparator<User> USER_NAME;

    static {
        USER_NAME = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getUserName().compareTo(u2.getUserName());
            }
        };
    }

    static final Comparator<User> EMAIL;

    static {
        EMAIL = new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.getEmail().compareTo(u2.getEmail());
            }
        };
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                "name=" + getName() +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public Comparator<User> getComparatorByField(String field) {
        switch (field) {
            case "name":
                return (Comparator<User>) super.getComparatorByField(field);
            case "lastname":
                return LAST_NAME;
            case "username":
                return USER_NAME;
            case "email":
                return EMAIL;
            default:
                return null;
        }
    }


}
