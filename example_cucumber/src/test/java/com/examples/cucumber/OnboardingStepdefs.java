package com.examples.cucumber;

import io.cucumber.datatable.DataTable;
import io.cucumber.java8.En;

import java.util.List;
import java.util.Map;

public class OnboardingStepdefs implements En {
    public OnboardingStepdefs() {

        Given("user login successfully", () -> {
            System.out.println("\nuser input correct email");
            System.out.println("user input correct password");
            System.out.println("user input correct 2FA");
        });

        And("^user has not onboarding yet$", () -> {
            System.out.println("kyc_status: \"PENDING\"");
        });

        Given("^user want to complete onboarding$", () -> {
            System.out.println("Okay cool, let's onboarding");
        });

        When("^Individual user complete all onboarding steps successfully$", (DataTable dataTable) -> {
            List<Map<String, String>> onboardingSteps = dataTable.asMaps();
            for (Map<String, String> currentScreen : onboardingSteps) {
                System.out.println("Step " + currentScreen.get("index") + " " + currentScreen.get("name") + " DONE");
            }
        });

        Then("^user should be able to submit onboarding application$", () -> {
            System.out.println("Submit onboarding application successfully !");
            System.out.println("\n-------------------------------------------------");
        });

        When("^Institution user complete all onboarding steps successfully$", (DataTable dataTable) -> {
            List<Map<String, String>> onboardingSteps = dataTable.asMaps();
            for (Map<String, String> currentScreen : onboardingSteps) {
                System.out.println("Step " + currentScreen.get("index") + " " + currentScreen.get("name") + " DONE");
            }
        });

        When("^Authorized Person user complete all onboarding steps successfully$", (DataTable dataTable) -> {
            List<Map<String, String>> onboardingSteps = dataTable.asMaps();
            for (Map<String, String> currentScreen : onboardingSteps) {
                System.out.println("Step " + currentScreen.get("index") + " " + currentScreen.get("name") + " DONE");
            }
        });


    }
}
