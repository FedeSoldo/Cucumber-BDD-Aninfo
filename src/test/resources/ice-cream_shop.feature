Feature: Ice-cream shop operations
  Scenario: Ice cream shop successfully sells an ice cream
    Given Ice cream shop with an initial amount of 200
    When Client buys an ice cream with the price of 200
    Then Ice cream shop final amount is 400

  Scenario: Ice cream shop successfully pays a service
    Given Ice cream shop with an initial amount of 200
    When Trying to pay a service for 160
    Then Ice cream shop final amount is 40

  Scenario: Ice cream shop cant pay a service
    Given Ice cream shop with an initial amount of 200
    When Trying to pay a service for 260
    Then Ice cream shop final amount is 200
    And Ice cream final debt amount is 260