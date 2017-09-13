Feature: Demonstrate a basic test automation framework
  As an end user I can purchase an item
  As well as update my first name

  Background:
    Given I am on the homepage
    And I log in

    @one
    Scenario: User purchases a tshirt
      When I search for "T-SHIRT"
      And add it to my shopping cart
      And confirm my address
      And choose a shipping option & accept service terms
      And choose a payment method
      And confirm my order
      Then my order is successful
      When I return to my order history page
      Then my ordered item is listed

  @two
  Scenario: User updates their personal information
      And I go to the personal info page
      When I update my first name
      Then my update is successful
      And the first name field is updated





#WebSite: Visit Automationpractice.com with Credentials(frameworkbuild@gmail.com\Framework1!)
#Scenario 1: Order TShirt & Verify item exist in Order History
#Scenario 2:  Update Personal Information(FirstName) in My Account. & Further verify FirstName field appears updated.
