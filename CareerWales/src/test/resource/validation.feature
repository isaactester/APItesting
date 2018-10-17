Feature: Get number of id
  Scenario Outline: User calls web service to get number of id
    Given I request detail from the service
    When a user retrieves detail by id
    Then the status code is 200
    Examples:
      | name 		| id					|
      | kind		| books#volumes			|