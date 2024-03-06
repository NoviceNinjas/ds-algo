Feature: LinkedList feature
#
Background:
Given The user has already logged in the home page using LinkedList
  |username|password|
  |Pratiksha|Aggarwal|
  
#@LinkedListpage 
#Scenario: Linked List page url
#Given The user is on the LinkedList Page after logged in 
#Then The URL of the page should contain "linked-list"
#
#@LinkedListpage 
#Scenario: Introduction: The user is in the "linked-list" page and click on Introduction
#Given The user clicks Introduction button
#Then The URL of the page should contain "introduction"
#
#@LinkedListpage
#Scenario: Introduction: The user clicks Try Here button 
#Given The user clicks Introduction button
#When The user clicks on Try Here button
#Then The user is on the page having Editor and Run button
#
#@LinkedListpage
#Scenario: Introduction: The user is on the tryEditor page writes Valid python code
#Given The user clicks Introduction button
#And The user is on the tryEditor page of Linked List page
#When The User writes Valid python code for Linked List
#And click run button in Linked List
#Then User is able to see the output in console in Linked List
#
#@LinkedListpage
#Scenario: Introduction: The user is on the tryEditor page writes InValid python code
#Given The user clicks Introduction button
#And The user is on the tryEditor page of Linked List page
#When The User writes InValid python code for Linked List page
#And click run button in Linked List
#Then User is able to see the error msg in pop up window for Linked List
#
#@LinkedListpage
#Scenario: Introduction: The user is on the editor page withAlert  error message and click the ok button in the alert window
#Given The user clicks Introduction button
#   And The user clicks on Try Here button
#   And The User writes InValid python code for Linked List page
#   And The user is on the editor page withAlert  error message for Linked List   
#When The user click the ok button in the alert window for Linked List
#Then The user is on the page having Editor and Run button
#
#
#@LinkedListpage 
#Scenario: Creating Linked List: The user is in the "linked-list" page and click on Creating Linked LIst
#Given The user clicks creating-linked-list button
#Then The URL of the page should contain "creating-linked-list"
#
#@LinkedListpage
#Scenario: Creating Linked List: The user clicks Try Here button 
#Given The user clicks creating-linked-list button
#When The user clicks on Try Here button
#Then The user is on the page having Editor and Run button
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes Valid python code
#Given The user clicks creating-linked-list button
#And The user is on the tryEditor page of Linked List page
#When The User writes Valid python code for Linked List
#And click run button in Linked List
#Then User is able to see the output in console in Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes InValid python code
#Given The user clicks creating-linked-list button
#And The user is on the tryEditor page of Linked List page
#When The User writes InValid python code for Linked List page
#And click run button in Linked List
#Then User is able to see the error msg in pop up window for Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the editor page withAlert  error message and click the ok button in the alert window
#Given The user clicks creating-linked-list button
#   And The user clicks on Try Here button
#   And The User writes InValid python code for Linked List page
#   And The user is on the editor page withAlert  error message for Linked List   
#When The user click the ok button in the alert window for Linked List
#Then The user is on the page having Editor and Run button
#
#
#@LinkedListpage 
#Scenario: Creating Linked List: The user is in the "linked-list" page and click on Types of Linked List
#Given The user clicks <Types of Linked List> button
#Then The URL of the page should contain "types-of-linked-list"
#
#@LinkedListpage
#Scenario: Creating Linked List: The user clicks Try Here button 
#Given The user clicks <Types of Linked List> button
#When The user clicks on Try Here button
#Then The user is on the page having Editor and Run button
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes Valid python code
#Given The user clicks <Types of Linked List> button
#And The user is on the tryEditor page of Linked List page
#When The User writes Valid python code for Linked List
#And click run button in Linked List
#Then User is able to see the output in console in Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes InValid python code
#Given The user clicks <Types of Linked List> button
#And The user is on the tryEditor page of Linked List page
#When The User writes InValid python code for Linked List page
#And click run button in Linked List
#Then User is able to see the error msg in pop up window for Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the editor page withAlert  error message and click the ok button in the alert window
#Given The user clicks <Types of Linked List> button
#   And The user clicks on Try Here button
#   And The User writes InValid python code for Linked List page
#   And The user is on the editor page withAlert  error message for Linked List   
#When The user click the ok button in the alert window for Linked List
#Then The user is on the page having Editor and Run button
#
#
#@LinkedListpage 
#Scenario: Creating Linked List: The user is in the "linked-list" page and click on "Implement Linked List in Python"
#Given The user clicks <Implement Linked List in Python> button
#Then The URL of the page should contain "implement-linked-list-in-python"
#
#@LinkedListpage
#Scenario: Creating Linked List: The user clicks Try Here button 
#Given The user clicks <Implement Linked List in Python> button
#When The user clicks on Try Here button
#Then The user is on the page having Editor and Run button
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes Valid python code
#Given The user clicks <Implement Linked List in Python> button
#And The user is on the tryEditor page of Linked List page
#When The User writes Valid python code for Linked List
#And click run button in Linked List
#Then User is able to see the output in console in Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes InValid python code
#Given The user clicks <Implement Linked List in Python> button
#And The user is on the tryEditor page of Linked List page
#When The User writes InValid python code for Linked List page
#And click run button in Linked List
#Then User is able to see the error msg in pop up window for Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the editor page withAlert  error message and click the ok button in the alert window
#Given The user clicks <Implement Linked List in Python> button
#   And The user clicks on Try Here button
#   And The User writes InValid python code for Linked List page
#   And The user is on the editor page withAlert  error message for Linked List   
#When The user click the ok button in the alert window for Linked List
#Then The user is on the page having Editor and Run button
#
#
#@LinkedListpage 
#Scenario: Creating Linked List: The user is in the "linked-list" page and click on "Traversal"
#Given The user clicks <Traversal> button
#Then The URL of the page should contain "traversal"
#
#@LinkedListpage
#Scenario: Creating Linked List: The user clicks Try Here button 
#Given The user clicks <Traversal> button
#When The user clicks on Try Here button
#Then The user is on the page having Editor and Run button
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes Valid python code
#Given The user clicks <Traversal> button
#And The user is on the tryEditor page of Linked List page
#When The User writes Valid python code for Linked List
#And click run button in Linked List
#Then User is able to see the output in console in Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes InValid python code
#Given The user clicks <Traversal> button
#And The user is on the tryEditor page of Linked List page
#When The User writes InValid python code for Linked List page
#And click run button in Linked List
#Then User is able to see the error msg in pop up window for Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the editor page withAlert  error message and click the ok button in the alert window
#Given The user clicks <Traversal> button
#   And The user clicks on Try Here button
#   And The User writes InValid python code for Linked List page
#   And The user is on the editor page withAlert  error message for Linked List   
#When The user click the ok button in the alert window for Linked List
#Then The user is on the page having Editor and Run button
#
#@LinkedListpage 
#Scenario: Creating Linked List: The user is in the "linked-list" page and click on "Insertion"
#Given The user clicks <Insertion> button
#Then The URL of the page should contain "insertion-in-linked-list"
#
#@LinkedListpage
#Scenario: Creating Linked List: The user clicks Try Here button 
#Given The user clicks <Insertion> button
#When The user clicks on Try Here button
#Then The user is on the page having Editor and Run button
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes Valid python code
#Given The user clicks <Insertion> button
#And The user is on the tryEditor page of Linked List page
#When The User writes Valid python code for Linked List
#And click run button in Linked List
#Then User is able to see the output in console in Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes InValid python code
#Given The user clicks <Insertion> button
#And The user is on the tryEditor page of Linked List page
#When The User writes InValid python code for Linked List page
#And click run button in Linked List
#Then User is able to see the error msg in pop up window for Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the editor page withAlert  error message and click the ok button in the alert window
#Given The user clicks <Insertion> button
#   And The user clicks on Try Here button
#   And The User writes InValid python code for Linked List page
#   And The user is on the editor page withAlert  error message for Linked List   
#When The user click the ok button in the alert window for Linked List
#Then The user is on the page having Editor and Run button
#
#
#
#
#@LinkedListpage 
#Scenario: Creating Linked List: The user is in the "linked-list" page and click on "Deletion"
#Given The user clicks <Deletion> button
#Then The URL of the page should contain "deletion-in-linked-list"
#
#@LinkedListpage
#Scenario: Creating Linked List: The user clicks Try Here button 
#Given The user clicks <Deletion> button
#When The user clicks on Try Here button
#Then The user is on the page having Editor and Run button
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes Valid python code
#Given The user clicks <Deletion> button
#And The user is on the tryEditor page of Linked List page
#When The User writes Valid python code for Linked List
#And click run button in Linked List
#Then User is able to see the output in console in Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the tryEditor page writes InValid python code
#Given The user clicks <Deletion> button
#And The user is on the tryEditor page of Linked List page
#When The User writes InValid python code for Linked List page
#And click run button in Linked List
#Then User is able to see the error msg in pop up window for Linked List
#
#@LinkedListpage
#Scenario: Creating Linked List: The user is on the editor page withAlert  error message and click the ok button in the alert window
#Given The user clicks <Deletion> button
#   And The user clicks on Try Here button
#   And The User writes InValid python code for Linked List page
#   And The user is on the editor page withAlert  error message for Linked List   
#When The user click the ok button in the alert window for Linked List
#Then The user is on the page having Editor and Run button
#
#
#@LinkedListpage 
#Scenario: Creating Linked List: The user is in the "linked-list" page and click on "Practice Questions"
#Given The user clicks <Deletion> button
#And The user clicks <Practice Questions> button for LL
#Then The URL of the page should contain "practice"