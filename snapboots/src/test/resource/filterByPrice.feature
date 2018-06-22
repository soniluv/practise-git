Feature: FilterByPrice
  As an end user
  I want to filter the product by price
  So that I can view filtered product

  @kumarsoni
  Scenario Outline: Filter By Price
    Given when I am on the home page Boots
    When I search for a specific product
    And I select a filter called by "<priceFilterValue>"
    Then I should see results filtered by price


    Examples:
      | priceFilterValue |
      |less than £2      |

