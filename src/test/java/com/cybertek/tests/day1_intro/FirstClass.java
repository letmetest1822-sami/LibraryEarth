package com;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
        System.out.println(faker.harryPotter().character());
        System.out.println(faker.finance().creditCard(CreditCardType.AMERICAN_EXPRESS));
        System.out.println(faker.animal().name());
        System.out.println("hi to everyone");
        System.out.println("Try this");
        System.out.println(faker.overwatch().hero());
    }
}
