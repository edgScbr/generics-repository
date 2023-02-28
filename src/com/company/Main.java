package com.company;


public class Main {

    public static void main(String[] args) {

        Product product1 = new Product("USB Cable", 15);
        Product product2 = new Product("Keyboard", 15);
        Product product3 = new Product("Monitor", 23);

        Country country1 = new Country("United States", "US");
        Country country2 = new Country("El Salvador", "SV");
        Country country3 = new Country("Canada", "CA");

        User user1 = new User("Juan", "jp001", "Perez");
        User user2 = new User("Pablo", "pe002", "Escobar");
        User user3 = new User("Pedro", "ps003", "Sanchez");

        Repository<Product> productsRepository = new Repository<>("Repository of Products");
        productsRepository.addElement(product1);
        productsRepository.addElement(product2);
        productsRepository.addElement(product3);

        System.out.println(productsRepository.countElements());
        System.out.println(productsRepository.findElement(3));
        System.out.println(productsRepository.findElement(1));

        Repository<Country> countriesRepository = new Repository<>("Repository of Countries");
        countriesRepository.addElement(country1);
        countriesRepository.addElement(country1);
        countriesRepository.addElement(country2);
        System.out.println(countriesRepository.countElements());
        System.out.println(countriesRepository.findElement(1));

        Repository<User> usersRepository = new Repository<>("Repository of Users");
        usersRepository.addElement(user1);
        System.out.println(usersRepository.countElements());
        System.out.println(usersRepository.findElement(0));

    }
}
