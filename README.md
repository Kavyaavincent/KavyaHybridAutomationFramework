# 🚀 Hybrid Automation Framework - Web UI (Selenium/TestNG)



This repository contains a robust **Hybrid Automation Framework** designed for efficient and scalable Web UI testing. It utilizes industry-standard tools and design patterns to separate business logic, test data, and synchronization logic.

## ✨ Key Technology Stack

| Category | Technology / Pattern | Purpose |
| :--- | :--- | :--- |
| **Primary Tool** | **Selenium WebDriver** | Core library for browser interaction and UI testing. |
| **Test Runner** | **TestNG** | Test execution, reporting, grouping, and parallel execution. |
| **Build Tool** | **Maven** | Dependency management and project build lifecycle. |
| **Design Pattern** | **Page Object Model (POM)** | Improves code reusability, readability, and maintainability. |
| **Reporting** | **Extent Reports / TestNG Reports** | Generates detailed, interactive HTML reports for test results. |
| **Logging** | **Log4j** | Captures detailed execution logs for debugging and analysis. |
| **Data Source** | **External Excel/Properties Files** | Data-driven testing capability. |

---

## 🏗️ Framework Structure

The project is organized using a clean, layered structure:

* **`src/main/java`:** Contains core framework logic, utilities, and Page Objects.
* **`src/test/java`:** Contains all the actual **Test Cases** (`@Test` methods) which use the Page Objects.
* **`src/main/resources`:** Stores configuration files (e.g., Log4j properties, browser paths).
* **`src/test/resources`:** Stores test data (e.g., Excel sheets, TestNG XML files).
* **`pom.xml`:** Manages all project dependencies and plugin configurations.

---

## ⚙️ How to Set Up and Run

1.  **Clone the Repository:**
    ```bash
    git clone [Paste your GitHub HTTPS URL here]
    ```
2.  **Import into Eclipse:** Use `File -> Import -> Maven -> Existing Maven Projects`.
3.  **Run Tests:** Execute the tests using the configured **`testng.xml`** file located in the `src/test/resources` directory.
    * *Right-click* on `testng.xml` $\rightarrow$ *Run As* $\rightarrow$ *TestNG Suite*.

## 🤝 Contact

* **Author:** [Your Name]
* **LinkedIn:** [Link to your LinkedIn Profile]
* **Email:** [Your Professional Email Address]
