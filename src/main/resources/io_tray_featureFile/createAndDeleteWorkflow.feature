Feature: As a QA I want to see that I am able to create and delete Workflow

Scenario: User can navigate to the site, create and delete Workflow

Given I am on Tray.io Home page

@WorkflowTesting
Scenario Outline: As a QA I test workflow creation and deletion functionality

When I click on Login button
Then I should be on login page

When I enter username "<username>" and password "<password>"
And I click on login button
Then I should be on dashboard page

When I select option CREATE NEW WORKFLOW
And I enter "<name>" and click on create
Then I should be on a trigger page

When I click on close button
Then I should be on dashboard page

When I click on delete button
Then the workflow should be deleted

When I click on logout button in header
Then I should be on login page
And I close the browser

Examples:
| username | password | name |
| soni_rushika@yahoo.com | Wembley78 | test |