package com.company;


import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("USB Cable", 15);
        Product product2 = new Product("Keyboard", 50);
        Product product3 = new Product("Monitor", 23);
        Product product4 = new Product("keyBOARD", 50);

        Country country1 = new Country("United States", "US");
        Country country2 = new Country("El Salvador", "SV");
        Country country3 = new Country("Canada", "CA");
        Country country4 = new Country("Brazil", "BR");
        Country country5 = new Country("Argentina", "BR");

        User user1 = new User("Juan", "jp001", "Perez", "jp001@gmail.com");
        User user2 = new User("Carlos", "pe002", "Escobar", "pe002@outlook.com");
        User user3 = new User("Pedro", "ps003", "Sanchez", "ps003@yahoo.com");
        User user4 = new User("Samuel", "SH004", "Hernandez", "sh004@gmail.com");
        User user5 = new User("Jorge", "jc005", "Campos", "pe002@outlook.com");

        Repository<Product> productsRepository = new Repository<>("Repository of Products");
        productsRepository.addElement(product1);
        productsRepository.addElement(product2);
        productsRepository.addElement(product3);


        System.out.println(productsRepository.countElements());
        System.out.println(productsRepository.findElement(3));


        Repository<Country> countriesRepository = new Repository<>("Repository of Countries");
        countriesRepository.addElement(country1);
        countriesRepository.addElement(country1);
        countriesRepository.addElement(country2);
        countriesRepository.addElement(country3);
        countriesRepository.addElement(country4);
        System.out.println(countriesRepository.countElements());
        System.out.println(countriesRepository.findElement(1));

        Repository<User> usersRepository = new Repository<>("Repository of Users");
        usersRepository.addElement(user1);
        usersRepository.addElement(user2);
        usersRepository.addElement(user3);
        usersRepository.addElement(user4);
        System.out.println(usersRepository.countElements());
        System.out.println(usersRepository.findElement(0));

        System.out.println();
        System.out.println("************************************************* WEEK TWO ******************************");
        System.out.println();
        //getAllSortedBy
        System.out.println(productsRepository.getAllSortedBy("stock"));
        System.out.println(countriesRepository.getAllSortedBy("isocode"));
        System.out.println(usersRepository.getAllSortedBy("username"));
        //getDomains
        System.out.println(usersRepository.getDomains());
        //validations
        countriesRepository.addElement(country5);
        System.out.println(countriesRepository.countElements());
        usersRepository.addElement(user5);
        System.out.println(usersRepository.countElements());
        productsRepository.addElement(product4);
        System.out.println(productsRepository.findElement(2));


    }

}


