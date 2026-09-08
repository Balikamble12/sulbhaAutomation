@smoke
Feature: User validate login feature

@smoke
Scenario: User validate login functionality
    Given user browse the application
    And user enters username
    Then user enters password
    And user click on submit

@sanity
Scenario Outline: User invalid validate login functionality
    Given user browse the application
    And user enters username "<username>"
    Then user enters password "<password>"
    And user click on submit

Examples:
    |username|password|
    |Admin   |Qedge123!@#|
    | abc    | 12345|
    | xyz    | 67890|
