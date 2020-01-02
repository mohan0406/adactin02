Feature: Adactin details validation

  @Sanity
  Scenario Outline: validating the invalid login credentials
    Given user is on adaction home page
    When user enter the "<username>", "<password>" and click the login button
    And user is on home page select"<location>","<hotels>","<roomtype>","<no of rooms>","<check in>","<check out>","<no adult>","<no children>" hit the search button
    And select the hotel and click the continue button
    And user enter the "<firstname>","<lastname>","<address>","<credit card no>","<credit card type>","<expired date>","<expired year>","<cvv no>" click the book now button
    Then verify the url.

    Examples: 
      | username | password  | location  | hotels      | roomtype | no of rooms | check in   | check out  | no adult | no children | firstname | lastname  | address            | credit card no   | credit card type | expired date | expired year | cvv no |
      | userName | 978788077 | Melbourne | Hotel Creek | Deluxe   | 2 - Two     | 20/12/2019 | 22/12/2019 | 2 - Two  | 2 - Two       | mohanraj  | angamuthu | ertyuiodfghjkcvbnm | 9876543212345677 | VISA             | June         |         2022 |    943 |
