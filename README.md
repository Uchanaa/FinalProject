# Buggy Cars Rating Automation Project

This project is an automation testing framework for the Buggy Cars Rating website, built using Java, Selenium, TestNG, and ExtentReports.

## Project Structure
The project is organized into the following directories:

- src/main/java/org.buggyjusttestit/api/: Contains utility classes for API testing, such as ApiUtils.
- src/main/java/org.buggyjusttestit/data/: Includes classes for test data (ApiTestData, LoginTestData, MainTestData).
- src/main/java/org.buggyjusttestit/pages/: Contains Page Object classes (LoginPage, MainPage).
- src/main/java/org.buggyjusttestit/utils/: Utility classes and managers:
        - DriverManager: Manages the browser driver.
        - ExtentReportManager: Generates test reports.
        - TestListener: TestNG listeners for custom actions.
        - Utils: General helper methods.
        - BasePage: Base class for common functionality.
- src/test/java/org.buggyjusttestit/tests/: Test classes:
        - ApiTest: Contains API tests.
        - LoginTest: Contains login functionality tests.

## Prerequisites

- Java 8 or later
- Maven (for dependency management)
- IntelliJ IDEA or Eclipse (or any preferred IDE)
- Selenium WebDriver
  
## Reporting
- Test execution reports are generated in the report/ directory using ExtentReports.

