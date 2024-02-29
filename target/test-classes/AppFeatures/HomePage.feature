Feature: Home Page Features

@homepage 
Scenario: The user clicks get started button on DS Algo Portal
Given The user opens DS Algo portal link
When The user clicks the Get Started button
Then The URL of the page should contain "home"
And The user should see 6 panes with different data structires
And Register Link is displayed
And Sign In Link is displayed

@homepage 
Scenario: The user clicks Get Started without loggin in
Given The user opens Home Page without loggin in
When The user clicks any of the Get Started buttons below the data structures 
Then It should alert the user with a message You are not logged in
    
@homepage 
Scenario: The user selects any data structures item from the drop down without loggin in
Given The user opens Home Page without loggin in
When The user selects any data structures item from the drop down menu 
Then It should alert the user with a message You are not logged in


@homepage 
Scenario: The user clicks sign in button
Given The user opens Home Page without loggin in
When The user clicks Sign in
Then The user should be redirected to Sign in page
And The URL of the page should contain "login"