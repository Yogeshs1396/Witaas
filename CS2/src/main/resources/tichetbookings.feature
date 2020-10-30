Feature: Review Goibibo ticket booking
  In order to access application
  book a cheap ticket
  as a tester


  Scenario: Search the flights in Goibibo website
    Given Select a ticket with valid details
    When Select Date
    And Search Matching Flights
    Then Select Cheapest price