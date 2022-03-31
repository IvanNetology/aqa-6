package ru.netology.card;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {}

    public static class Registration {
        private Registration() {}
        public static RegistrationInfo generateInfo(String locale) {
            Faker faker = new Faker(new Locale(locale));
            return new  RegistrationInfo(faker.address().city(), faker.name().fullName(), faker.phoneNumber().phoneNumber());
        }
    }
}
