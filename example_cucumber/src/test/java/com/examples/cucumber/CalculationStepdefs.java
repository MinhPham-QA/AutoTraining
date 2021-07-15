package com.examples.cucumber;

import io.cucumber.java8.En;
import io.cucumber.java8.PendingException;
import org.junit.Assert;


import java.awt.dnd.InvalidDnDOperationException;
import java.util.concurrent.atomic.AtomicInteger;

public class CalculationStepdefs implements En {
    public CalculationStepdefs() {
//        AtomicInteger actualSum = new AtomicInteger();

        Given("^Minh is at home$", () -> {
            System.out.println("\nDoing Math homework in BDD");
        });

        Given("There are {int} integer numbers", (Integer arg0) -> {
            System.out.println("Let's do Math");
        });

        When("{int} + {int}", (Integer a, Integer b) -> {
            System.out.println(a + " + " + b);
//            actualSum.set(a + b);
        });

        Then("Sum of {int} + {int} should be {int}", (Integer a, Integer b, Integer sum) -> {
            System.out.println("The result should be " + sum);
//            Assert.assertEquals((int) sum, actualSum.intValue());
            Assert.assertEquals((int) sum, a + b);
            System.out.println("\n---------------------------------------");
        });


        When("{int} - {int}", (Integer a, Integer b) -> {
            System.out.println(a + " - " + b);
        });

        Then("Difference between {int} - {int} should be {int}", (Integer a, Integer b, Integer difference) -> {
            System.out.println("The result should be " + difference);
            Assert.assertEquals((int) difference, a - b);
            System.out.println("\n---------------------------------------");
        });

        When("{int} * {int}", (Integer a, Integer b) -> {
            System.out.println(a + " * " + b);
        });

        Then("Product of {int} * {int} should be {int}", (Integer a, Integer b, Integer product) -> {
            System.out.println("The result should be " + product);
            Assert.assertEquals((int) product, a * b);
            System.out.println("\n---------------------------------------");
        });

        When("{int} / {int}", (Integer a, Integer b) -> {
            System.out.println(a + " / " + b);
        });

        Then("Quotient of {int} / {int} should be {int}", (Integer a, Integer b, Integer quotient) -> {
            System.out.println("The result should be " + quotient);
            try {
                Assert.assertEquals((int) quotient, a / b);
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }
            System.out.println("\n-------------------------------\n");
        });

    }
}
