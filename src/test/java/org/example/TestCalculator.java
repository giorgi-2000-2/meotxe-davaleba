package org.example;

import net.datafaker.Faker;

public class TestCalculator {


    public int multiply(int a, int b) {
        return a * b;
    }


    public double multiply(double a, double b) {
        return a * b;
    }
}


public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();
        TestCalculator calculator = new TestCalculator();

        int int1 = faker.number().numberBetween(1, 10);
        int int2 = faker.number().numberBetween(1, 10);

        double double1 = faker.number().randomDouble(2, 1, 10);
        double double2 = faker.number().randomDouble(2, 1, 10);

        System.out.println("Int multiply: " + calculator.multiply(int1, int2));
        System.out.println("Double multiply: " + calculator.multiply(double1, double2));
    }
}
