Feature: Array page features

Background:
Given the user has already logged in the home page using for Array
  |username|password|
  |Pratiksha|Aggarwal|
 
 
@arraypage 
Scenario: Array page url
Given The user is on the Array Page after logged in 
Then The URL of the page should contain "array"

 
@arraypage 
Scenario: Arrays in Python Link
Given The user is on the Array Page after logged in 
When The user clicks a "Arrays in Python" link
Then The user should be redirected to "arrays-in-python" Page



@arraypage 
Scenario: Try Here button of Array in Python Page
Given The user is on the "array/applications-of-array/" Page 
When The user clicks Try Here button of "Array in Python" Page
Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page
And The Page should have Python Editor

@arraypage 
Scenario: Arrays Using List link from Array in Python Page
Given The user is on the "array/arrays-in-python/" Page 
When The user clicks a "Arrays Using List" link
Then The user should be redirected to "arrays-using-list" Page

@arraypage 
Scenario: Try Here button of Array Using List Page
Given 	The user is on the "array/arrays-using-list" Page
When The user clicks Try Here button of "Array Using List" Page
Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page
And The Page should have Python Editor

@arraypage 
Scenario: Basic Operations in Lists Page from Array Using List Page
Given 	The user is on the "array/arrays-using-list" Page
When The user clicks a "Basic Operations in Lists" link
Then The user should be redirected to "basic-operations-in-lists" Page

@arraypage 
Scenario: Try Here button of Basic Operations in Lists Page
Given 	The user is on the "array/basic-operations-in-lists" Page
When The user clicks Try Here button of "Basic Operations in Lists" Page
Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page
And The Page should have Python Editor

@arraypage 
Scenario: Applications of Array Page from Basic Operations in Lists Page
Given 	The user is on the "array/basic-operations-in-lists" Page
When The user clicks a "Applications of Array" link
Then The user should be redirected to "applications-of-array" Page


@arraypage 
Scenario: Practice question page with links
Given 	The user is on the "array/applications-of-array/" Page
When The user clicks a "Practice Questions" link
Then The user should be redirected to "array/practice" Page
And user gets the following links to explore Practice page
   |Search the array|
   |Max Consecutive Ones|
   |Find Numbers with Even Number of Digits|
   |Squares of a Sorted Array|
And The count of the practice links should be 4  

@arraypage 
Scenario: Elements on Practice Page
Given 	The user is on the "array/practice" Page
When The user clicks a "Search the array" link  
Then The Page should have following elements
   |question|
   |pythonEditor|
   |run|
   |submit|

@arraypage 
Scenario: Elements on Practice Page
Given 	The user is on the "array/practice" Page
When The user clicks a "Max Consecutive Ones" link  
Then The Page should have following elements
   |question|
   |pythonEditor|
   |run|
   |submit|

@arraypage 
Scenario: Elements on Practice Page
Given 	The user is on the "array/practice" Page
When The user clicks a "Find Numbers with Even Number of Digits" link  
Then The Page should have following elements
   |question|
   |pythonEditor|
   |run|
   |submit|
   
@arraypage 
Scenario: Elements on Practice Page
Given 	The user is on the "array/practice" Page
When The user clicks a "Squares of a Sorted Array" link  
Then The Page should have following elements
   |question|
   |pythonEditor|
   |run|
   |submit|        
 

#Python Editor Test Array In Python
@arraypage 
Scenario: The user clicks Run on Python Editor of Array In Python Page without entering code
Given The user is on the "array/arrays-in-python/" Page
And The user clicks Try Here button of "Arrays In Python" Page
And The user is on the "tryEditor" Page
When The user clicks "run" with code "false"
Then Ouput Displayed "false" 
And  Error message "false"

@arraypage 
Scenario: The user clicks Run on Python Editor of Array In Python Page by enterering invalid code
Given The user is on the "array/arrays-in-python/" Page
And The user clicks Try Here button of "Arrays In Python" Page
And The user is on the "tryEditor" Page
When The user writes "invalid" code for "1"
And The user clicks "run" with code "true"
Then Error message "true"

@arraypage 
Scenario: The user clicks Run on Python Editor of Array In Python Page and entering valid code
Given The user is on the "array/arrays-in-python/" Page
And The user clicks Try Here button of "Arrays In Python" Page
And The user is on the "tryEditor" Page
When The user writes "valid" code for "1"
And The user clicks "run" with code "true"
Then Ouput Displayed "true" 

#Python Editor Test Arrays Using List
@arraypage 
Scenario: The user clicks Run on Python Editor of Arrays Using List Page without entering code
Given The user is on the "array/arrays-using-list/" Page
And The user clicks Try Here button of "Arrays Using List" Page
And The user is on the "tryEditor" Page
When The user clicks "run" with code "false"
Then Ouput Displayed "false" 
And  Error message "false"

@arraypage 
Scenario: The user clicks Run on Python Editor of Arrays Using List Page by enterering invalid code
Given The user is on the "array/arrays-using-list/" Page
And The user clicks Try Here button of "Arrays Using List" Page
And The user is on the "tryEditor" Page
When The user writes "invalid" code for "1"
And The user clicks "run" with code "true"
Then Error message "true"

@arraypage 
Scenario: The user clicks Run on Python Editor of Arrays Using List Page and entering valid code
Given The user is on the "array/arrays-using-list/" Page
And The user clicks Try Here button of "Arrays Using List" Page
And The user is on the "tryEditor" Page
When The user writes "valid" code for "1"
And The user clicks "run" with code "true"
Then Ouput Displayed "true" 

#Python Editor Test Applications of Array
@arraypage 
Scenario: The user clicks Run on Python Editor of Applications of Array Page without entering code
Given The user is on the "array/applications-of-array/" Page
And The user clicks Try Here button of "Applications of Array" Page
And The user is on the "tryEditor" Page
When The user clicks "run" with code "false"
Then Ouput Displayed "false" 
And  Error message "false"

@arraypage 
Scenario: The user clicks Run on Python Editor of Applications of Array Page by enterering invalid code
Given The user is on the "array/applications-of-array/" Page
And The user clicks Try Here button of "Applications of Array" Page
And The user is on the "tryEditor" Page
When The user writes "invalid" code for "1"
And The user clicks "run" with code "true"
Then Error message "true"

@arraypage 
Scenario: The user clicks Run on Python Editor of Applications of Array Page and entering valid code
Given The user is on the "array/applications-of-array/" Page
And The user clicks Try Here button of "Applications of Array" Page
And The user is on the "tryEditor" Page
When The user writes "valid" code for "1"
And The user clicks "run" with code "true"
Then Ouput Displayed "true" 

#Python Editor Test Basic Operations in Lists
@arraypage 
Scenario: The user clicks Run on Python Editor of Basic Operations in Lists Page without entering code
Given The user is on the "array/basic-operations-in-lists/" Page
And The user clicks Try Here button of "Basic Operations in Lists" Page
And The user is on the "tryEditor" Page
When The user clicks "run" with code "fales"
Then Ouput Displayed "false" 
And  Error message "false"

@arraypage 
Scenario: The user clicks Run on Python Editor of Basic Operations in Lists Page by enterering invalid code
Given The user is on the "array/basic-operations-in-lists/" Page
And The user clicks Try Here button of "Basic Operations in Lists" Page
And The user is on the "tryEditor" Page
When The user writes "invalid" code for "1"
And The user clicks "run" with code "true"
Then Error message "true"

@arraypage 
Scenario: The user clicks Run on Python Editor of Basic Operations in Lists Page and entering valid code
Given The user is on the "array/basic-operations-in-lists/" Page
And The user clicks Try Here button of "Basic Operations in Lists" Page
And The user is on the "tryEditor" Page
When The user writes "valid" code for "1"
And The user clicks "run" with code "true"
Then Ouput Displayed "true" 

#Python Editor Test Search the Array Practice Page

@arraypage 
Scenario: The user clicks Run on Python Editor of Search the Array Practice Page without entering code
Given 	The user is on the "question/1" Page
When The user clicks "run" with code "false"
Then Error message "false"
And Ouput Displayed "false" 

@arraypage 
Scenario: The user clicks Run on Python Editor of Search the Array Practice Page by enterering invalid code
Given The user is on the "question/1" Page
When The user writes "invalid" code for "1"
And The user clicks "run" with code "true"
Then Error message "true"

@arraypage 
Scenario: The user clicks Run on Python Editor of Search the Array Practice Page and entering valid code
Given 	The user is on the "question/1" Page
When The user writes "valid" code for "1"
And The user clicks "run" with code "true"
Then Error message "false"
Then Ouput Displayed "true" 

@arraypage 
Scenario: The user clicks Submit on Python Editor of Search the Array Practice Page and entering valid code
Given 	The user is on the "question/1" Page
When The user writes "valid" code for "1"
And The user clicks "submit" with code "true"
Then The user see an error message "Error occurred during submission"  

#Python Editor Test Max Consecutive Ones Practice Page

@arraypage 
Scenario: The user clicks Run on Python Editor of Max Consecutive Ones Practice Page without entering code
Given 	The user is on the "question/2" Page
When The user clicks "run" with code "false"
Then Error message "false"
And Ouput Displayed "false" 

@arraypage 
Scenario: The user clicks Run on Python Editor of Max Consecutive Ones Practice Page by enterering invalid code
Given The user is on the "question/2" Page
When The user writes "invalid" code for "2"
And The user clicks "run" with code "true"
Then Error message "true"

@arraypage 
Scenario: The user clicks Run on Python Editor of Max Consecutive Ones Practice Page and entering valid code
Given 	The user is on the "question/2" Page
When The user writes "valid" code for "2"
And The user clicks "run" with code "true"
Then Error message "false"
Then Ouput Displayed "true" 

@arraypage 
Scenario: The user clicks Submit on Python Editor of Max Consecutive Ones Practice Page and entering valid code
Given 	The user is on the "question/2" Page
When The user writes "valid" code for "2"
And The user clicks "submit" with code "true"
Then The user see an error message "Error occurred during submission"  

#Python Editor Test Find Numbers with Even Number of Digits Practice Page

@arraypage 
Scenario: The user clicks Run on Python Editor of Find Numbers with Even Number of Digits Practice Page without entering code
Given 	The user is on the "question/3" Page
When The user clicks "run" with code "false"
Then Error message "false"
And Ouput Displayed "false" 

@arraypage 
Scenario: The user clicks Run on Python Editor of Find Numbers with Even Number of Digits Practice Page by enterering invalid code
Given The user is on the "question/3" Page
When The user writes "invalid" code for "3"
And The user clicks "run" with code "true"
Then Error message "true"

@arraypage 
Scenario: The user clicks Run on Python Editor of Find Numbers with Even Number of Digits Practice Page and entering valid code
Given 	The user is on the "question/3" Page
When The user writes "valid" code for "3"
And The user clicks "run" with code "true"
Then Error message "false"
Then Ouput Displayed "true" 

@arraypage 
Scenario: The user clicks Submit on Python Editor of Find Numbers with Even Number of Digits Practice Page and entering valid code
Given 	The user is on the "question/3" Page
When The user writes "valid" code for "3"
And The user clicks "submit" with code "true"
Then The user see an error message "Error occurred during submission"  

#Python Editor Test Squares of a Sorted Array Practice Page

@arraypage 
Scenario: The user clicks Run on Python Editor of Squares of a Sorted Array Practice Page without entering code
Given 	The user is on the "question/4" Page
When The user clicks "run" with code "false"
Then Error message "false" 
And Ouput Displayed "false" 

@arraypage 
Scenario: The user clicks Run on Python Editor of Squares of a Sorted Array Practice Page by enterering invalid code
Given The user is on the "question/4" Page
When The user writes "invalid" code for "4"
And The user clicks "run" with code "true"
Then Error message "true"

@arraypage 
Scenario: The user clicks Run on Python Editor of Squares of a Sorted Array Practice Page and entering valid code
Given The user is on the "question/4" Page
When The user writes "valid" code for "4"
And The user clicks "run" with code "true"
Then Error message "false"
Then Ouput Displayed "true" 

@arraypage 
Scenario: The user clicks Submit on Python Editor of Squares of a Sorted Array Practice Page and entering valid code
Given 	The user is on the "question/4" Page
When The user writes "valid" code for "4"
And The user clicks "submit" with code "true"
Then The user see an error message "Error occurred during submission"  

