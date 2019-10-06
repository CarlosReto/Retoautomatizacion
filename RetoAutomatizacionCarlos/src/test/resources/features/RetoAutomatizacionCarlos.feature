#Author: maurrest@bancolombia.com.co
Feature: Buy article in linio.com.pe
  He wants to buy an item on the linio.com.pe page

  @tag1
  Scenario: Buy article in linio.com.pe
    Given that Carlos wants to buy an product on linio.com.pe
    When he selects a product
    Then he validates the purchase of the producto
