Feature: Get number of id

  Scenario: User calls web service to get number of id
    Given I request detail from the service
    When a user retrieves detail by id
    Then the status code is 200


  Scenario: Post
    Given I am a new user
    When  I register my details
    Then I should get confirmation




