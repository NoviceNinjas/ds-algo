Feature: Sign In Page Features
 
Background:
Given The User has clicked on the "signin" button from the home page
    

@signinpage 
Scenario: Logging in with correct credentials
Given The user is in the Sign In page
When User eneters the username "Pratiksha"
And The user eneters the password as "Aggarwal"
And user clicks on login button
And The user is alerted with message that "You are logged in"
And Sign Out link is displayed
And The URL of the page should contain "home"

@signinpage 
Scenario: Logging in with blank credentials
Given The user is in the Sign In page
When The user clicks login button after leaving the username textbox and password textbox blank
Then The error message "Please fill out this field." appears below Username textbox



@signinpage 
Scenario: Logging in with incorrect credentials
Given The user is in the Sign In page
When User eneters the username "Incorrect"
And The user eneters the password as "Wrong"
And user clicks on login button
And The user is alerted with message that "Invalid Username and Password"

@signinpage 
Scenario: Logging in with blank password
Given The user is in the Sign In page
When The user clicks login button after entring the username "Pratiksha" and leaving password textbox blank
Then The error message "Please fill out this field." appears below Password textbox   
  
@signinpage 
Scenario: Logging in with blank username
Given The user is in the Sign In page
When The user clicks login button after entring the username blank and password "Aggarwal"
Then The error message "Please fill out this field." appears below Username textbox 