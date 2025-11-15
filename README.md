# DemoWebShop_Testing_Assignment

## Automation Testing Internship – Ziegler Aerospace

This project is an automated testing suite for the **Demo Web Shop** (https://demowebshop.tricentis.com) using **Selenium WebDriver + Java + TestNG**. It demonstrates scalable, maintainable automation practices following **Page Object Model (POM)**, dynamic waits, validations, reporting, and reusable utilities.

---

## Project Structure

DemoWebShop_Testing_Assignment/
├── src/
│ ├── pages/ # Page Object Model classes
│ ├── tests/ # Test classes using TestNG
│ └── utils/ # Reusable utilities (BaseTest, WaitUtils, ReportManager)
├── testdata.csv # Registration data for tests
├── screenshots/ # Captured failure screenshots
├── report.txt # Test execution summary and logs
├── README.md # This file
├── pom.xml # Maven dependencies
└── testng.xml # TestNG suite configuration

---

## Assignment Tasks

### 1. Homepage & Category Validation
- Navigate to the homepage.
- Dynamically detect all main categories.
- Randomly click any category.
- Validate:
  - Category page loads.
  - At least 4 products are displayed.
  - Page title contains category name.
- Logs:
  - All category names.
  - Selected category.
  - Product count.

### 2. Product Selection & Add-to-Cart
- Randomly select 2 different products.
- Capture product name, price, and URL.
- Add products to the cart.
- Validate cart count, product details, and price.
- Logs skipped actions if Add to Cart is not available.

### 3. Shopping Cart & Checkout Workflow
- Open Shopping Cart.
- Validate both selected items:
  - Quantity = 1
  - Prices match captured values
  - Total price calculation
- Proceed to checkout and fill registration data from `testdata.csv`.
- Do not place the order (stop at payment page).

### 4. Negative Test – Registration Validation
- Navigate to registration page.
- Leave one required field empty (e.g., First Name, Last Name, or Password).
- Click Register and validate:
  - Error message appears.
  - Correct error message text is captured.
- Screenshot saved in `screenshots/`.

---

## Reporting
- `report.txt` is generated after each test execution.
- Logs include:
  - Categories detected
  - Selected category
  - Product details
  - Items added to cart
  - Validation errors
  - Total cart cost
  - Overall test summary (Passed/Failed)

---

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/Avadhut21/DemoWebShop_Testing_Assignment.git
2.Open in Eclipse or any IDE.

3.Ensure Maven dependencies are installed:

mvn clean install


4.Run the TestNG suite:

mvn test


or using testng.xml directly from Eclipse.

Known Issues

Some dynamic products may not be available, which could skip Add-to-Cart steps.

Email duplication errors during registration are handled by generating unique emails dynamically.

Tools & Frameworks

Language: Java

Test Framework: TestNG

Automation: Selenium WebDriver

Build Tool: Maven

Logging & Reporting: ExtentReports / custom report.txt

Browser Driver Management: WebDriverManager

Author

Name: Avadhut Patil

Role: Automation Testing Intern

Assignment: Demo Web Shop Automation Workflow
