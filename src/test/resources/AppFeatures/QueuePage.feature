Feature: Queue page features

Background:
Given The user has already logged in the home page using
  |username|password|
  |Pratiksha|Aggarwal|
  
@queuepage
Scenario: Queue page url
Given The user is on the Queue Page after logged in 
Then The URL of the page should contain "queue"
    
@queuepage 
Scenario: Queue page check links for topics covered
Given The user is on the Queue Page after logged in
Then user gets the following links to explore Queue page
   |Implementation of Queue in Python|
   |Implementation using collections.deque|
   |Implementation using array|
   |Queue Operations|
And The count of the links should be 4 on Queue Page

@queuepage
Scenario: Queue page check links for topics covered
Given The user is on the Queue Page after logged in
When The user clicks "Implementation of Queue in Python" button on Queue Page
Then The user should be directed to "lists" on Queue Page 

@queuepage
Scenario: Queue page check links for topics covered
Given The user is on the Queue Page after logged in
When The user clicks "Implementation using collections.deque" button on Queue Page
Then The user should be directed to "collections" on Queue Page


@queuepage
Scenario: Queue page check links for topics covered
Given The user is on the Queue Page after logged in
When The user clicks "Implementation using array" button on Queue Page
Then The user should be directed to "array" on Queue Page

@queuepage
Scenario: Queue page check links for topics covered
Given The user is on the Queue Page after logged in
When The user clicks "Queue Operations" button on Queue Page
Then The user should be directed to "QueueOp" on Queue Page 


@queuepage
Scenario: Queue page check for try here and run button is displayed for Queue Operations
Given The user is on the Queue Page after logged in
When The user clicks "Queue Operations" link of Queue Page followed by "Try here" link
Then The user should be redirected to a page having an tryEditor of Queue page 
And the page should have a Run button to test of Queue page

@queuepage
Scenario: Queue page check for try here and run button is displayed for lists
Given The user is on the Queue Page after logged in
When The user clicks "Implementation of Queue in Python" link of Queue Page followed by "Try here" link
Then The user should be redirected to a page having an tryEditor of Queue page 
And the page should have a Run button to test of Queue page

@queuepage
Scenario: Queue page check for try here and run button is displayed for array Operations
Given The user is on the Queue Page after logged in
When The user clicks "Implementation using array" link of Queue Page followed by "Try here" link
Then The user should be redirected to a page having an tryEditor of Queue page 
And the page should have a Run button to test of Queue page

@queuepage
Scenario: Queue page check for try here and run button is displayed for collections Operations
Given The user is on the Queue Page after logged in
When The user clicks "Implementation using collections.deque" link of Queue Page followed by "Try here" link
Then The user should be redirected to a page having an tryEditor of Queue page 
And the page should have a Run button to test of Queue page


@queuepage
Scenario: Validating Try Editor part of Queue Page
Given The user is on the Queue Page after logged in
When The user clicks "Queue Operations" link of Queue Page followed by "Try here" link
And The user writes the invalid python code on Queue Page
And The user clicks the run button on Queue Page
Then The User is able to see the error message in pop up window on Queue Page

@queuepage
Scenario: Validating Try Editor part of Queue Page
Given The user is on the Queue Page after logged in
When The user clicks "Queue Operations" link of Queue Page followed by "Try here" link
And The user writes the invalid python code on Queue Page
And The user clicks the run button on Queue Page
And The user click the ok button in the alert window on Queue Page
Then The user should be redirected to a page having an tryEditor of Queue page 

@queuepage
Scenario: Validating Try Editor part of Queue Page
Given The user is on the Queue Page after logged in
When The user clicks "Queue Operations" link of Queue Page followed by "Try here" link
And The user writes the valid python code on Queue Page
And The user clicks the run button on Queue Page
Then User is able to see the correct output in console on Queue Page


@queuepage
  Scenario Outline: Validating Try Editor part of Queue Page Reading from excel sheet
    Given The user is on the Queue Page after logged in
    When The user clicks "Queue Operations" link of Queue Page followed by "Try here" link
    And The user writes the valid python code on Queue Page from "<SheetName>" and <RowNumber>
    And The user clicks the run button on Queue Page
		Then User is able to see the expected output in console on Queue Page

    Examples: 
      | SheetName  | RowNumber |
      | PythonCode |     0     |
     