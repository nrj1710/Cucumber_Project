#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: 
login page

Scenario:
To check the login functionality with valid credentials
Given Open the chrome Browser
And enter The Url
When User enter the valid username and password
And click on login button
Then user should be redirect to the logout page
Then close the chrome Browser

Scenario:
To check the login functionality with invalid credentials
Given Open the chrome Browser
And enter The Url "https://practice.expandtesting.com/login"
When User enter the valid username"xxx" and password "xxx65554"
And click on login button
Then user should be redirect to the login page"Test Automation Practice: Working with Login form"
Then close the chrome Browser

