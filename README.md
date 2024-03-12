# EasyRules Example

## Overview

This repository contains a simple Java application demonstrating the usage of the EasyRules library. EasyRules is a lightweight rule engine for Java, providing a simple way to define and execute rules in your applications.

The example includes a custom rule (`MyRule`) defined using annotations and another equivalent rule (`MyRule` again) defined programmatically. The application showcases how to create rules, register them in a rule set, and execute them using the EasyRules engine.

## Usage

### Prerequisites

Ensure you have Java and Maven installed on your system.

### Build and Run

1. **Clone the repository:**

   ```bash
   https://github.com/DohaMaghni/EasyRulesTest.git
   ```
2. **Navigate to the project directory:**
   
   ```bash
   cd testEasyRules
   ```
3. **Build the application:**
   
   ```bash
   mvn clean install
   ```
4. **Run the application:**
   
   ```bash
   java -jar target/test-easy-rules-1.0-SNAPSHOT.jar
   ```
## Understanding the Code
### MyRule Class
The MyRule class represents a sample rule defined using EasyRules annotations. It consists of a condition (myCondition) and an action (myAction). In this example, the condition always evaluates to true, and the action prints a message.

### TestEasyRulesApplication Class
This class contains the main method to execute the EasyRules. It demonstrates two ways of defining a rule:
1. **Annotation-based Rule:**

   Uses @Rule annotation on the MyRule class.
   The condition and action are defined within the class.
2. **Programmatic Rule:**

   Uses the RuleBuilder to create a rule with a specified name, description, condition, and action.
   Registers the rule in a Rules set.
The application then creates a Facts object and utilizes the DefaultRulesEngine to execute the registered rules against the provided facts.
## Customization
Feel free to customize the MyRule class or add additional rules to explore and test the capabilities of EasyRules.
## Keep coding joyfully! 😊💻
