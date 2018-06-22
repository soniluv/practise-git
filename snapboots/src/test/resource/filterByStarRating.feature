Feature: FilterByStarRating
  As an end user
  I want to filter the product by star ratings
  So that I can view filtered product

  @kumarsoni
  Scenario Outline: Filter By Price
    Given when I am on the home page of Boots
    When I search for a product
    And I select a filter by "<rating>"
    Then I should see results filtered star ratings


    Examples:
      |rating  |
      |5 stars      |