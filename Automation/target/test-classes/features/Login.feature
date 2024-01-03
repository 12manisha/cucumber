Feature: Application Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login application with "Riya" and "1214"
Then Home page is populated
And Cards displayed are "true"

Scenario: Home page default login
Given User is on NetBanking landing page
When User login application with "Manisha" and "1212"
Then Home page is populated
And Cards displayed are "false"
