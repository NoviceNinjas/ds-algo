Feature: Sign In Page Features
 
Background:
Given The User has clicked on the sign in button from the home page
    

@signinpage 
Scenario: Logging in with correct credentials
Given The user is in the Sign In page
When User eneters the username "Pratiksha"
And The user eneters the password as "Aggarwal"
And user clicks on login button
And The user is alerted with message that "You are logged in"
And Sign Out link is displayed
And The URL of the page should contain "home"