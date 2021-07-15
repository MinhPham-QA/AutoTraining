@all_activities
Feature: Onboarding

  Background:
    Given user login successfully
    And user has not onboarding yet


  @data_table
  Scenario: user should be able to complete onboarding for an Individual account when user submit all valid documents
    Given user want to complete onboarding
    When Individual user complete all onboarding steps successfully
      | index | name            |
      | 1     | Basic Info      |
      | 2     | Detailed Info   |
      | 3     | Verify Identity |
    Then user should be able to submit onboarding application


  @data_table
  Scenario: user should be able to complete onboarding for an Institution account when user submit all valid documents
    Given user want to complete onboarding
    When Institution user complete all onboarding steps successfully
      | index | name                          |
      | 1     | Basic Info                    |
      | 2     | Detailed Info                 |
      | 3     | Business Activity             |
      | 4     | Company Structure Information |
      | 5     | Documents                     |
    Then user should be able to submit onboarding application


  @data_table
  Scenario: user should be able to complete onboarding for an Individual account when user submit all valid documents
    Given user want to complete onboarding
    When Authorized Person user complete all onboarding steps successfully
      | index | name            |
      | 1     | Basic Info      |
      | 2     | Detailed Info   |
      | 3     | Verify Identity |
    Then user should be able to submit onboarding application