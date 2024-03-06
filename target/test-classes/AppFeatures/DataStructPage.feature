Feature: Data Structures page features
  
Background:
Given The user has already logged in the home page for Data Structure modlule using
  |username|password|
  |Pratiksha|Aggarwal|
  
@datastructures
Scenario: Data Structure page url
Given The user is on the Data Structures Page after logged in 
Then The URL of the page should contain "data-structures"

@datastructures
Scenario: Data Structure page url
Given The user is on the Data Structures Page after logged in 
When The user clicks Time Complexity link on data structure page
Then The user should be redirected to Time Complexity page on data structure page

@datastructures
Scenario: Data Structure page url
Given The user is on Time Complexity link of the Data Structures Page after logged in 
When The user clicks Try Here  button of Time Complexity page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"


@datastructures
Scenario: Data Structure page url
Given The user is on Time Complexity link of the Data Structures Page after logged in 
When The user clicks Practice Questions link of Time Complexity page
Then The user redirected to the "practice Questions" page of Data Structures

@datastructures
Scenario: Data Structure page url
Given The user is on Time Complexity link of the Data Structures Page after logged in 
When The user clicks Practice Questions link of Time Complexity page
Then The user redirected to the "practice Questions" page of Data Structures 
And the practice page of Data structures is blank

@datastructures
Scenario: Data Structure page url
Given The user is on Time Complexity link of the Data Structures Page after logged in 
When The user clicks on try here button at the bottom of Time Complexity page
Then The user should be redirected to a page having an Python Editor with a url "https://dsportalapp.herokuapp.com/tryEditor"

@datastructures
Scenario: Data Structure page url
Given The user is on Time Complexity link of the Data Structures Page after logged in 
And The user clicks on try here button at the bottom of Time Complexity page of Data Structures page
When The The user clicks the Run button without entring any code in the Editor for Data Structures page
Then The user stays on the same page of Data Structures page
