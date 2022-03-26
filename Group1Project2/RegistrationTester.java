package com.syntax.Group1Project2;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration registration = new Registration();
        registration.setEmail("john@wp.pl");
        registration.setEmail("john@yahoo.com");

        registration.setUserName("john");
        registration.setUserName("john12345678");

        registration.setPassword("");
        registration.setPassword("asd");
        registration.setPassword("john12345678");
        registration.setPassword("1234567891011");

    }
}

