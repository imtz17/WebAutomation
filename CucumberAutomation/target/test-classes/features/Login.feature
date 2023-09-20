Feature: Test orangehr login module

@loginhr
Scenario: Test login with valid credential
  Given user is on orangrhr login page
  When user enters valid username and password
  Then user should logged in successfully 
  
#@loginhrnegativeTC
Scenario: Test login with invalid credential
  Given user is on orangrhr login page
  When user enters invalid username and password
  Then user should get failure message
  
#@loginhrmwithnull
Scenario: Test login with null credential
  Given user is on orangrhr login page
  When user enters username and password as null
  Then user should get required message
  
#@loginhrmwithnullpassword
Scenario: Test login with null password credential
  Given user is on orangrhr login page
  When user leaves password field as null
  Then user should get field required message
  
#@loginhrmwithnullusername
Scenario: Test login with null username credential
  Given user is on orangrhr login page
  When user leaves username field as null
  Then user should get required as message
  
  
  
 
  