Feature: Login

  Scenario: Login with Correct credentails
    Given Navigate to "https://profile.w3schools.com/log-in"
    When Enter "rtoor204@gmail.com" and "Abc@1234" and click on Login button
    Then user should land on HomePage
