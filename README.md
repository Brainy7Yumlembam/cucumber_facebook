# Cucumber_facebook
# Overview
This project aims to automate the login process for Facebook using Selenium WebDriver and Cucumber. It demonstrates how to use BDD (Behavior-Driven Development) to create a clear and concise specification of the login functionality, ensuring the login works as expected.

# Technology Stack
Java: The programming language used for writing the step definitions.
Selenium WebDriver: A web automation tool used for automating web application testing.
Cucumber: A tool that supports BDD, allowing us to define application behavior in plain text.
Firefox Driver: Selenium WebDriver implementation for Mozilla Firefox.
WebDriverManager: A library that automates the management of browser drivers.
# Features
BDD Approach: Using Cucumber for defining the steps in Gherkin language, which makes the tests readable and understandable by non-developers.
Web Automation: Automating the navigation to Facebook's homepage, entering login credentials, and verifying successful login.
Cross-Browser Support: Although this example uses Firefox, WebDriverManager can be easily configured to support other browsers.
# Step Definitions
The project contains the following Cucumber step definitions:

@Given("user is on homepage")

Sets up the Firefox WebDriver.
Navigates to Facebook's login page.
Maximizes the browser window and waits for the page to load.
@When("user enter username, password and login")

Enters the username and password into the respective fields.
Clicks the login button and waits for the login process to complete.
@Then("user should login successfully")

Verifies that the user has logged in successfully by checking for the presence of a specific element (the user's name).
Clicks on the user's name to confirm successful login.
How to Run
Setup: Ensure Java, Maven, and Firefox are installed on your system.
Dependencies: Add the required dependencies for Selenium, Cucumber, and WebDriverManager in your pom.xml if using Maven.
Execution: Run the Cucumber tests using your preferred IDE or through the command line with Maven.
