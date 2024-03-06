Feature: Tree page features

Background:
Given the user has already logged in the home page using for tree
  |username|password|
  |Pratiksha|Aggarwal|
 
 
#@treepage 
#Scenario: Tree page url
#Given The user is on the tree Page after logged in
#Then The URL of the page should contain "tree"
#
#
#@treepage 
#Scenario: Overview of Trees link
#Given The user is on the tree Page after logged in
#When The user clicks a "Overview of Trees" link in tree
#Then The user should be redirected to "tree/overview-of-trees" Page in tree
#
#@treepage 
#Scenario: Terminologies Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Terminologies" link in tree
#Then The user should be redirected to "tree/terminologies" Page in tree
#
#@treepage 
#Scenario: Types of Trees Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Types of Trees" link in tree
#Then The user should be redirected to "tree/types-of-trees" Page in tree
#
#@treepage 
#Scenario: Tree Traversals Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Tree Traversals" link in tree
#Then The user should be redirected to "tree/tree-traversals" Page in tree
#
#@treepage 
#Scenario: Traversals-Illustration Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Traversals-Illustration" link in tree
#Then The user should be redirected to "tree/traversals-illustration" Page in tree
#
#@treepage 
#Scenario: Binary Trees Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Binary Trees" link in tree
#Then The user should be redirected to "tree/binary-trees" Page in tree
#
#@treepage 
#Scenario: Types of Binary Trees Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Types of Binary Trees" link in tree
#Then The user should be redirected to "tree/types-of-binary-trees" Page in tree
#
#@treepage 
#Scenario: Implementation in Python Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Implementation in Python" link in tree
#Then The user should be redirected to "tree/implementation-in-python" Page in tree
#
#@treepage 
#Scenario: Binary Tree Traversals Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Binary Tree Traversals" link in tree
#Then The user should be redirected to "tree/binary-tree-traversals" Page in tree
#
#@treepage 
#Scenario: Implementation of Binary Trees Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Implementation of Binary Trees" link in tree
#Then The user should be redirected to "tree/implementation-of-binary-trees" Page in tree
#
#@treepage 
#Scenario: Applications of Binary trees Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Applications of Binary trees" link in tree
#Then The user should be redirected to "tree/applications-of-binary-trees" Page in tree
#
#@treepage 
#Scenario: Binary Search Trees Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Binary Search Trees" link in tree
#Then The user should be redirected to "tree/binary-search-trees" Page in tree
#
#@treepage 
#Scenario: Implementation Of BST Link
#Given The user is on the tree Page after logged in
#When The user clicks a "Implementation Of BST" link in tree
#Then The user should be redirected to "tree/implementation-of-bst" Page in tree
#
#
#
##Python Editor Test Overview of Trees
#@treepage 
#Scenario: The user clicks Run on Overview of Trees Page without entering code
#Given The user is on the "tree/overview-of-trees/" Page in tree
#And The user clicks Try Here button of "Overview of Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Overview of Trees Page by enterering invalid code
#Given The user is on the "tree/overview-of-trees/" Page in tree
#And The user clicks Try Here button of "Overview of Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Overview of Trees Page and entering valid code
#Given The user is on the "tree/overview-of-trees/" Page in tree
#And The user clicks Try Here button of "Overview of Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Overview of Trees in Python Page
#Given The user is on the "tree/overview-of-trees/" Page in tree 
#When The user clicks Try Here button of "Overview of Trees" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
##Python Editor Test Terminologies
#@treepage 
#Scenario: The user clicks Run on Terminologies Page without entering code
#Given The user is on the "tree/terminologies/" Page in tree
#And The user clicks Try Here button of "Terminologies" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Terminologies Page by enterering invalid code
#Given The user is on the "tree/terminologies/" Page in tree
#And The user clicks Try Here button of "Terminologies" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Terminologies Page and entering valid code
#Given The user is on the "tree/terminologies/" Page in tree
#And The user clicks Try Here button of "Terminologies" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Terminologies in Python Page
#Given The user is on the "tree/terminologies/" Page in tree 
#When The user clicks Try Here button of "Terminologies" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
#
##Python Editor Types of Trees
#@treepage 
#Scenario: The user clicks Run on types-of-trees Page without entering code
#Given The user is on the "tree/types-of-trees/" Page in tree
#And The user clicks Try Here button of "types-of-trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Types of Trees Page by enterering invalid code
#Given The user is on the "tree/types-of-trees/" Page in tree
#And The user clicks Try Here button of "types-of-trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Types of Trees Page and entering valid code
#Given The user is on the "tree/types-of-trees/" Page in tree
#And The user clicks Try Here button of "types-of-trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Types of Trees in Python Page
#Given The user is on the "tree/types-of-trees/" Page in tree 
#When The user clicks Try Here button of "types-of-trees" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
##Python Editor Tree Traversals
#@treepage 
#Scenario: The user clicks Run on tree-traversals Page without entering code
#Given The user is on the "tree/tree-traversals/" Page in tree
#And The user clicks Try Here button of "tree-traversals" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Tree Traversals Page by enterering invalid code
#Given The user is on the "tree/tree-traversals/" Page in tree
#And The user clicks Try Here button of "tree-traversals" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Tree Traversals Page and entering valid code
#Given The user is on the "tree/tree-traversals/" Page in tree
#And The user clicks Try Here button of "tree-traversals" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Tree Traversals in Python Page
#Given The user is on the "tree/tree-traversals/" Page in tree 
#When The user clicks Try Here button of "tree-traversals" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
#
##Python Editor Traversals-Illustration
#@treepage 
#Scenario: The user clicks Run on traversals-illustration Page without entering code
#Given The user is on the "tree/traversals-illustration/" Page in tree
#And The user clicks Try Here button of "traversals-illustration" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Traversals-Illustration Page by enterering invalid code
#Given The user is on the "tree/traversals-illustration/" Page in tree
#And The user clicks Try Here button of "traversals-illustration" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Traversals-Illustration Page and entering valid code
#Given The user is on the "tree/traversals-illustration/" Page in tree
#And The user clicks Try Here button of "traversals-illustration" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Traversals-Illustration in Python Page
#Given The user is on the "tree/traversals-illustration/" Page in tree 
#When The user clicks Try Here button of "traversals-illustration" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
##Python Editor Binary Trees
#@treepage 
#Scenario: The user clicks Run on Binary Trees Page without entering code
#Given The user is on the "tree/binary-trees/" Page in tree
#And The user clicks Try Here button of "Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Binary Trees Page by enterering invalid code
#Given The user is on the "tree/binary-trees/" Page in tree
#And The user clicks Try Here button of "Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Binary Trees Page and entering valid code
#Given The user is on the "tree/binary-trees/" Page in tree
#And The user clicks Try Here button of "Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Binary Trees in Python Page
#Given The user is on the "tree/binary-trees/" Page in tree 
#When The user clicks Try Here button of "Binary Trees" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
##Python Editor Types of Binary Trees
#@treepage 
#Scenario: The user clicks Run on Types of Binary Trees Page without entering code
#Given The user is on the "tree/types-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Types of Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Types of Binary Trees Page by enterering invalid code
#Given The user is on the "tree/types-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Types of Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Types of Binary Trees Page and entering valid code
#Given The user is on the "tree/types-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Types of Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Types of Binary Trees in Python Page
#Given The user is on the "tree/types-of-binary-trees/" Page in tree 
#When The user clicks Try Here button of "Types of Binary Trees" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
#
##Python Editor Implementation in Python
#@treepage 
#Scenario: The user clicks Run on Implementation in Python Page without entering code
#Given The user is on the "tree/implementation-in-python/" Page in tree
#And The user clicks Try Here button of "Implementation in Python" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Implementation in Python Page by enterering invalid code
#Given The user is on the "tree/implementation-in-python/" Page in tree
#And The user clicks Try Here button of "Implementation in Python" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Implementation in Python Page and entering valid code
#Given The user is on the "tree/implementation-in-python/" Page in tree
#And The user clicks Try Here button of "Implementation in Python" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Implementation in Python in Python Page
#Given The user is on the "tree/implementation-in-python/" Page in tree 
#When The user clicks Try Here button of "Implementation in Python" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
##Python Editor Binary Tree Traversals
#@treepage 
#Scenario: The user clicks Run on Binary Tree Traversals Page without entering code
#Given The user is on the "tree/binary-tree-traversals/" Page in tree
#And The user clicks Try Here button of "Binary Tree Traversals" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Binary Tree Traversals Page by enterering invalid code
#Given The user is on the "tree/binary-tree-traversals/" Page in tree
#And The user clicks Try Here button of "Binary Tree Traversals" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Binary Tree Traversals Page and entering valid code
#Given The user is on the "tree/binary-tree-traversals/" Page in tree
#And The user clicks Try Here button of "Binary Tree Traversals" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Binary Tree Traversals in Python Page
#Given The user is on the "tree/binary-tree-traversals/" Page in tree 
#When The user clicks Try Here button of "Binary Tree Traversals" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
##Python Editor Applications of Binary trees
#@treepage 
#Scenario: The user clicks Run on Applications of Binary trees Page without entering code
#Given The user is on the "tree/applications-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Applications of Binary trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Applications of Binary trees Page by enterering invalid code
#Given The user is on the "tree/applications-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Applications of Binary trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Applications of Binary trees Page and entering valid code
#Given The user is on the "tree/applications-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Applications of Binary trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Applications of Binary trees in Python Page
#Given The user is on the "tree/applications-of-binary-trees/" Page in tree 
#When The user clicks Try Here button of "Applications of Binary trees" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
#
##Python Editor Implementation of Binary Trees
#@treepage 
#Scenario: The user clicks Run on Implementation of Binary Trees Page without entering code
#Given The user is on the "tree/implementation-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Implementation of Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Implementation of Binary Trees Page by enterering invalid code
#Given The user is on the "tree/implementation-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Implementation of Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Implementation of Binary Trees Page and entering valid code
#Given The user is on the "tree/implementation-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Implementation of Binary Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Implementation of Binary Trees in Python Page
#Given The user is on the "tree/implementation-of-binary-trees/" Page in tree 
#When The user clicks Try Here button of "Implementation of Binary Trees" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
##Python Editor Binary Search Trees
#@treepage 
#Scenario: The user clicks Run on Binary Search Trees Page without entering code
#Given The user is on the "tree/binary-search-trees/" Page in tree
#And The user clicks Try Here button of "Binary Search Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Binary Search Trees Page by enterering invalid code
#Given The user is on the "tree/binary-search-trees/" Page in tree
#And The user clicks Try Here button of "Binary Search Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Binary Search Trees Page and entering valid code
#Given The user is on the "tree/binary-search-trees/" Page in tree
#And The user clicks Try Here button of "Binary Search Trees" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Binary Search Trees in Python Page
#Given The user is on the "tree/binary-search-trees/" Page in tree 
#When The user clicks Try Here button of "Binary Search Trees" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
##Python Editor Implementation Of BST
#@treepage 
#Scenario: The user clicks Run on Implementation Of BST Page without entering code
#Given The user is on the "tree/implementation-of-bst/" Page in tree
#And The user clicks Try Here button of "Implementation Of BST" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user clicks "run" with code "false" in tree
#Then Ouput Displayed "false" in tree
#And  Error message "false" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Implementation Of BST Page by enterering invalid code
#Given The user is on the "tree/implementation-of-bst/" Page in tree
#And The user clicks Try Here button of "Implementation Of BST" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Error message "true" in tree
#
#@treepage 
#Scenario: The user clicks Run on Python Editor of Implementation Of BST Page and entering valid code
#Given The user is on the "tree/implementation-of-bst/" Page in tree
#And The user clicks Try Here button of "Implementation Of BST" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "valid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#Then Ouput Displayed "true" in tree
#
#@treepage 
#Scenario: Try Here button of Implementation Of BST in Python Page
#Given The user is on the "tree/implementation-of-bst/" Page in tree 
#When The user clicks Try Here button of "Implementation Of BST" Page in tree
#Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in tree
#And The Page should have Python Editor in tree
#
#
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/overview-of-trees/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/overview-of-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/overview-of-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/terminologies/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/terminologies/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/terminologies/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/types-of-trees/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/types-of-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/types-of-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/tree-traversals/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/tree-traversals/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/tree-traversals/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/traversals-illustration/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/traversals-illustration/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/traversals-illustration/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/binary-trees/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/binary-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/binary-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/types-of-binary-trees/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/types-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/types-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/implementation-in-python/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/implementation-in-python/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/implementation-in-python/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/binary-tree-traversals/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/binary-tree-traversals/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/binary-tree-traversals/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/implementation-of-binary-trees/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/implementation-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/implementation-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/applications-of-binary-trees/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/applications-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/applications-of-binary-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/binary-search-trees/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/binary-search-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/binary-search-trees/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#
##Practice Questions
#@treepage 
#Scenario: Practice question page with links
#Given 	The user is on the "tree/implementation-of-bst/" Page in tree
#When The user clicks a "Practice Questions" link in tree
#Then The user should be redirected to "tree/practice" Page in tree
#
#@treepage 
#Scenario: Alert of tree Page by enterering invalid code
#Given The user is on the "tree/implementation-of-bst/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#When The user writes "invalid" code for "1" in tree
#And The user clicks "run" with code "true" in tree
#And Error message "true" in tree
#And The user clicks ok on alert in tree
#Then The user is on the "tree/implementation-of-bst/" Page in tree
#And The user clicks Try Here button of "Tree" Page in tree
#And The user is on the "tryEditor" Page in tree
#And No change in code in tree
#