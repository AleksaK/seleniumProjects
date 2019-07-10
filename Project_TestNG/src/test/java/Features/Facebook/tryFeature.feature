Feature: Verify login functionality


  Scenario: Login with valid credentials
    Given User is on Facebook login page
    When User enters a@gmail.com in email
    And User enteres 123456 in password
    And User clicks on login button
    When User enters abc@gmail.com in email again
    Then User lands on homepage



    Scenario Outline: Login with multiple valid credentials
      Given User is on Facebook login page
      When User enters <emailAddr> in email
      And User enteres <pwd> in password

      Examples:
      |emailAddr|pwd|
      |a@gmail.com|abs|
      |b@gmail.com|akur83rrhm|
