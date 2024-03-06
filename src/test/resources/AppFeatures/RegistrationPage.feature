Feature: Register Page Features
 
Background:
Given The User has clicked on the "register" button from the home page for register


@registrationpage 
Scenario: Alll fields empty. Username Error
Given The user is on the new user registration page
When The user clicks "register"
Then The error "Please fill out this field." appears below "uName"


@registrationpage 
Scenario: Array page url
Given The user is on the new user registration page
When The user fills "uName" with "Hiranmayee"
And The user clicks "register"
Then The error "Please fill out this field." appears below "password"


@registrationpage 
Scenario: Array page url
Given The user is on the new user registration page
When The user fills "uName" with "Hiranmayee"
And The user fills "password" with "Nidugondi"
And The user clicks "register"
Then The error "Please fill out this field." appears below "pwdConfirm"

@registrationpage 
Scenario: Array page url
Given The user is on the new user registration page
When The user fills "uName" with "Hiranmayee   "
And The user clicks "register"
Then The error "invalid data" appears below "uName"

@registrationpage 
Scenario: Array page url
Given The user is on the new user registration page
When The user fills "uName" with "Hiranmayee"
And The user fills "password" with "Nidugondi   "
And The user clicks "register"
Then The error "invalid data" appears below "password"

@registrationpage 
Scenario: Array page url
Given The user is on the new user registration page
When The user fills "uName" with "Hiranmayee"
And The user fills "password" with "Nid"
And The user clicks "register"
Then The error "invalid data" appears below "password"

@registrationpage 
Scenario: Array page url
Given The user is on the new user registration page
When The user fills "uName" with "Hiranmayee"
And The user fills "password" with "Nidugondi"
And The user fills "pwdConfirm" with "Nidugondi123"
And The user clicks "register"
Then The "warning" message "password_mismatch:The two password fields didn’t match." appears


@registrationpage 
Scenario: Array page url
Given The user is on the new user registration page
When The user fills "uName" with "random"
And The user fills "password" with "Nidugondi"
And The user fills "pwdConfirm" with "Nidugondi"
And The user clicks "register"
Then The "signIn" message "New Account Created. You are logged in as" appears
And The URL of the page should contain "home"