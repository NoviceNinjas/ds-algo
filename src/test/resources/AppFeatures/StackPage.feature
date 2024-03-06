Feature: Stack page features

Background:
Given The user has already logged in the home page using stack
  |username|password|
  |Pratiksha|Aggarwal|
  
@stackpage 
Scenario: Stack page url
Given The user is on the Stack Page after logged in 
Then The URL of the page should contain "stack"

@stackpage
Scenario:The user is in the "Operations in Stack" page 
Given The user clicks Operations in Stack button
Then The URL of the page should contain "operations-in-stack"

@stackpage
Scenario: Operation in Stack: The user clicks Try Here button 
Given The user is in the Operations in Stack page
When The user clicks Try Here button
Then The user should be redirected to a page having an tryEditor with a Run button to test

@stackpage
Scenario: Operation in Stack: The user is on the tryEditor page writes Valid python code
Given The user is on the tryEditor page of Operations in Stack page
When The User writes Valid python code
And click run button
Then User is able to see the output in console

@stackpage
Scenario: Operation in Stack: The user is on the tryEditor page writes InValid python code
Given The user is on the tryEditor page of Operations in Stack page
When The User writes InValid python code
And click run button
Then User is able to see the error msg in pop up window

@stackpage
Scenario: Operation in Stack: The user is on the editor page withAlert  error message and click the ok button in the alert window
Given The user is on the editor page withAlert  error message
When The user click the ok button in the alert window
Then The user is on the same page having Editor and Run button

@stackpage
Scenario: Implementation: The user is in the "Implementaion" page 
Given The user is on the Stack Page after logged in
When The user clicks <Implementation> button
Then The URL of the page should contain "implementation"

@stackpage
Scenario: Implementation: The clicks user try here button in the Implementation page 
Given The user is in the Implementation page 
When The user clicks Try Here button
Then The user is on the same page having Editor and Run button

@stackpage
Scenario: Implementation:User writes Valid python code in tryEditor of Implementation page 
Given The user is on the tryEditor screen of Implementation page  
When The User writes Valid python code in Implementation page
And click run button
Then User is able to see the output in console

@stackpage
Scenario: Implementation:User writes InValid python code in tryEditor of Implementation page 
Given The user is on the tryEditor screen of Implementation page  
When The User writes InValid python code in Implementation page
And click run button
Then User is able to see the error msg in pop up window

@stackpage
Scenario: Implementation: The user is on the editor page withAlert  error message and click the ok button in the alert window
Given The user is on the editor page of Implementation with Alert  error message
When The user click the ok button in the alert window
Then The user is on the same page having Editor and Run button

@stackpage
Scenario: Applications: The user is in the "Applications" page 
Given The user is on the Stack Page after logged in
When The user clicks <Applications> button
Then The URL of the page should contain "stack-applications"

@stackpage
Scenario: Applications: The clicks user try here button in the Applications page 
Given The user is in the Applications page 
When The user clicks Try Here button
Then The user is on the same page having Editor and Run button

@stackpage
Scenario: Applications: User writes Valid python code in tryEditor of Implementation page 
Given The user is on the tryEditor screen of Applications page  
When The User writes Valid python code in Applications page
And click run button
Then User is able to see the output in console

@stackpage
Scenario: Applications:User writes InValid python code in tryEditor of Applications page 
Given The user is on the tryEditor screen of Applications page  
When The User writes InValid python code in Applications page
And click run button
Then User is able to see the error msg in pop up window

@stackpage
Scenario: Applications: The user is on the editor page withAlert  error message and click the ok button in the alert window
Given The user is on the editor page of Application with Alert  error message
When The user click the ok button in the alert window
Then The user is on the same page having Editor and Run button

@stackpage
Scenario: Practice Questions: The user is in the "Practice Questions" page 
Given The user is on the Stack Page after logged in
When The user clicks <Practice Questions> button
Then The URL of the page should contain "practice"