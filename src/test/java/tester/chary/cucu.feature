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
@tag
Feature: Life of Tester
in order to get good salary
As a IT guy
I want to keep my boss happy
 
  @tag1
  Scenario Outline: I am a tester
   Given I am a <tester_type> tester
   When I go to work
   Then I <Work_Output> it
   And My boss <Boss_Action>me
   But the developer <Developer_action>me
   
  Examples: 
      | tester_type  | Work_Output | Boss_Action  |Developer_action|
      | good         |     complete| salutes      |hates           |
      | bad          |     mess    | Fires        |         loves  |
      |    avg       |    satisfies|congratulates |respects        |