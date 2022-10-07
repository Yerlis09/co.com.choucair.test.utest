# languge: en
  #Author: Yerlys Castellar
@stories
Feature: Utest
  As a user, I want to create an account on the utest page
  @scenario1
  Scenario: Create an account
    Given than Yerlys wants to sign up at the uTest page
    When fill in the form for registration
      | strFirstName | strLastName | strEmailAddress             | strMount | strDay | strYear | strLanguages | strCity             | strPostalCode | strCountry | strComputer | strVersion | strLanguage | strMovilDevice | strModel      | strOperatingSystem | strPassword   | strConfirmPassword |
      | Yerlys       | Castellar   | castellaryerlis18@gmail.com | April    | 9      | 1999    | Spanish      | Cartagena de Indias | 130001        | Colombia   | Windows     | 10         | Spanish     | Xiaomi         | Redmi Note 9S | Android 10         | Castellary18. | Castellary18.      |
    Then see the welcome page to the uTest portal
      | strTextToWelcome                                                         |
      | Welcome to the world's largest community of freelance software testers! |
