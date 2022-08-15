Feature: Login
Scenario: scenario description
    Given open chrome browser
    When launch app url and select login option
    Then Enter email "anand1@gmail.com" and password "Anand567@"
    And click the login 
    And Verify the app wheather app logged in or not
    And close the browser

    
    Scenario Outline: scenario description
    	
    Given open chrome browser
    When launch app url and select login option
    Then Enter email <"email"> and password <password>
    And click the login 
    And Verify the app wheather app logged in or not
    And close the browser
    
    
    		Examples:
    		| email | password |
    		| anand1@gmail.com | Anand567@ | 
    		| anand1@gmail.com| Anand567@ |
    		