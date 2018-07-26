#Author: Meera Zala

Feature: ebay search feature

Scenario: Search for 'cars in london'
Given I am on google homepage
When I Search for 'cars in london' and result dislayed
Then validate how many gumtree links available on first page
Then go on first link to confirm the title
Then go on second link to confirm the title

     
