Feature: Registration Functionlity

  @Register
  Scenario: 
    Given User Creates an Acccount on the Portal with mandatory Fields
    And User Navigated to Registraion Page
    When User enters the required details in the Below Field1
      | patient_name   | Baskarbrito   |
      | Phone_Number   |    9363085095 |
      | patient_age    |            26 |
      | Email_Address  | DBa@emids.com |
      | password       | Welcome@123   |
      | Select_Country |India|
    And User clicks on Submit
    Then User should be able to registered Successfully
