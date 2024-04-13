Feature: OddEvenPrime Game Play

Scenario: Play the OEP to get ODDPRIME
Given Create a OEP Game Play object
When I Play the Game with number 3
Then The result is ODD

Scenario: Play the OEP to Even
Given Create a OEP Game Play object
When I Play the Game with number 4
Then The result is EVEN

Scenario: Play the OEP to ODD
Given Create a OEP Game Play object
When I Play the Game with number 15
Then The result is ODD
