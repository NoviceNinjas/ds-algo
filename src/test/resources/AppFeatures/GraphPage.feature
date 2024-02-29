Feature: Graph page features

Background:
Given the user has already logged in the home page using for Graph
  |username|password|
  |Pratiksha|Aggarwal|
 
 
@graphpage 
Scenario: Graph page url
Given The user is on the Graph Page after logged in 
Then The URL of the page should contain "graph"


@graphpage 
Scenario: Graph Link
Given The user is on the Graph Page after logged in 
When The user clicks a "Graph" link in graph
Then The user should be redirected to "graph/graph" Page in graph

@graphpage 
Scenario: Graph Link
Given The user is on the Graph Page after logged in 
When The user clicks a "Graph Representations" link in graph
Then The user should be redirected to "graph/graph-representations" Page in graph


#Python Editor Test Graph
@graphpage 
Scenario: The user clicks Run on Graph Page without entering code
Given The user is on the "graph/graph/" Page in graph
And The user clicks Try Here button of "Graph" Page in graph
And The user is on the "tryEditor" Page in graph
When The user clicks "run" with code "false" in graph
Then Ouput Displayed "false" in graph
And  Error message "false" in graph

@graphpage 
Scenario: The user clicks Run on Python Editor of Graph by enterering invalid code
Given The user is on the "graph/graph/" Page in graph
And The user clicks Try Here button of "Graph" Page in graph
And The user is on the "tryEditor" Page in graph
When The user writes "invalid" code for "1" in graph
And The user clicks "run" with code "true" in graph
Then Error message "true" in graph

@graphpage 
Scenario: The user clicks Run on Python Editor of Graph and entering valid code
Given The user is on the "graph/graph/" Page in graph
And The user clicks Try Here button of "Graph" Page in graph
And The user is on the "tryEditor" Page in graph
When The user writes "valid" code for "1" in graph
And The user clicks "run" with code "true" in graph
Then Ouput Displayed "true" in graph

@graphpage 
Scenario: Try Here button of Graph in Python Page
Given The user is on the "graph/graph/" Page in graph 
When The user clicks Try Here button of "Graph" Page in graph
Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in graph
And The Page should have Python Editor in graph

#Python Editor Test Graph Representations
@graphpage 
Scenario: The user clicks Run on Graph Representations Page without entering code
Given The user is on the "graph/graph-representations/" Page in graph
And The user clicks Try Here button of "Graph Representations" Page in graph
And The user is on the "tryEditor" Page in graph
When The user clicks "run" with code "false" in graph
Then Ouput Displayed "false" in graph
And  Error message "false" in graph

@graphpage 
Scenario: The user clicks Run on Python Editor of Graph Representations Page by enterering invalid code
Given The user is on the "graph/graph-representations/" Page in graph
And The user clicks Try Here button of "Graph Representations" Page in graph
And The user is on the "tryEditor" Page in graph
When The user writes "invalid" code for "1" in graph
And The user clicks "run" with code "true" in graph
Then Error message "true" in graph

@graphpage 
Scenario: The user clicks Run on Python Editor of Graph Representations Page and entering valid code
Given The user is on the "graph/graph-representations/" Page in graph
And The user clicks Try Here button of "Graph Representations" Page in graph
And The user is on the "tryEditor" Page in graph
When The user writes "valid" code for "1" in graph
And The user clicks "run" with code "true" in graph
Then Ouput Displayed "true" in graph

@graphpage 
Scenario: Try Here button of Graph Representations in Python Page
Given The user is on the "graph/graph-representations/" Page in graph 
When The user clicks Try Here button of "Graph Representations" Page in graph
Then The user should be redirected to "https://dsportalapp.herokuapp.com/tryEditor" Page in graph
And The Page should have Python Editor in graph

#Practice Questions
@graphpage 
Scenario: Practice question page with links
Given 	The user is on the "graph/graph/" Page in graph
When The user clicks a "Practice Questions" link in graph
Then The user should be redirected to "graph/practice" Page in graph

@graphpage 
Scenario: Alert of Graph Page by enterering invalid code
Given The user is on the "graph/graph/" Page in graph
And The user clicks Try Here button of "Graph" Page in graph
And The user is on the "tryEditor" Page in graph
When The user writes "invalid" code for "1" in graph
And The user clicks "run" with code "true" in graph
And Error message "true" in graph
And The user clicks ok on alert
Then The user is on the "graph/graph/" Page in graph
And The user clicks Try Here button of "Graph" Page in graph
And The user is on the "tryEditor" Page in graph
And No change in code

@graphpage 
Scenario: Alert of Graph Representations Page by enterering invalid code
Given The user is on the "graph/graph-representations/" Page in graph
And The user clicks Try Here button of "Graph Representations" Page in graph
And The user is on the "tryEditor" Page in graph
When The user writes "invalid" code for "1" in graph
And The user clicks "run" with code "true" in graph
And Error message "true" in graph
And The user clicks ok on alert
Then The user is on the "graph/graph-representations/" Page in graph
And The user clicks Try Here button of "Graph Representations" Page in graph
And The user is on the "tryEditor" Page in graph
And No change in code