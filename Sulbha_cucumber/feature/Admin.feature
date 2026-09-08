
Feature: User validate Admin feature
@sanity
Scenario: User validate Admin Module
    Given user click on Admin module
    And user enter system username as "sulabha"
    Then user select user role as "Admin"
    And user enter emp name as "test"
    Then user select status as "Enabled"
    And user click on Search button
