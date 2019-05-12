Feature: Logiin features 

	# Below scenario for validate login page title
Scenario: Verify Login page title 
	Given user is on the login page 
	Then login page title should be as per requirement 
	
	# Below scenario to pass user name and password from method arguments - data driven without examples keyword
Scenario: Login with valid credentials 
	Given user is on the login page 
	When user enters user name as "souni0419" and password as "Password1" 
	And user clicks on login button 
	Then user successfully lands on home page 
	
	# below example is data driven with examples keyword	
Scenario Outline: Login with valid credentials 
	Given user is on the login page 
	When user enters user name as "<user name>" and password as "<password>" 
	And user clicks on login button 
	Then user successfully lands on home page 
	Examples: 
		|user name | password  |
		|souni0419 | Password1 |	
		
	# below example is data driven with data table implementation 
Scenario: Login with valid credentials
	Given user is on the login page
	And user enters credentials in login page
		|souni0419 | Password1 |
	Then user successfully lands on home page
	
	# below example is data driven testing using data table and Map implementation