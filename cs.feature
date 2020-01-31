Feature: TestMeApp functionality
Background: user logs in and searches for product
Given  user signin into testmeapp
When  user searches for a particular product

#Scenario: register to testmeapp
#Given user should be on sign up page
#When user enters username "rajinik"
#And user enters firstname "alex"
#And user enters lastname "a"
#And user enters password "123"
#And user  re-enters password "123"
#And user selects gender as Male
#And user enters emailid "alex@gmail.com"
#And user enters mobilenumber "9876543210"
#And user enters DOB "08/24/1997"
#And user enters address "Hyderabad"
#And user selects security question
#And user enters the answer "Blue"
#And user clicks register
#Then user should be on login page

###########
#Scenario Outline: login in TestMeApp

#Given user must be in login page
#When user enters "<username>" and "<password>"
#And performs login
#Then user must be in home page

#Examples:
#|username||password|
#|rajinik||123|
########################

#Scenario: positive search login

#Given user should be in Home page
#And clicks the search tab & enters the first four letters of the product
#And selects product from drop down
#And clicks on find details
#And adds the product to cart
#Then user should be in add to cart page

#####################
@FunctionalTest
Scenario: user proceeds to payment without adding to cart

Given user proceeds for payment without adding to cart
Then TestMeApp doesnt display the cart icon
@smoke
Scenario: user proceeds to payment after adding to cart
Given user proceeds for payment after adding to cart
Then testmeapp displays cart icon

