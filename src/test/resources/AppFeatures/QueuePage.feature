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
And The count of the links should be 4  

