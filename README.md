# Code Smell Analysis Using PMD

## Project Overview

This repository contains an analysis of the source code using **PMD Source Code Analyzer**. PMD is an extensible static code analysis tool that helps identify programming flaws, code smells, and anti-patterns in Java (and other languages) codebases. The tool parses source code into Abstract Syntax Trees (ASTs) and applies over 400 built-in rules to detect issues such as unused variables, inefficient loops, dead code, and much more.

### **Purpose**
The primary goal of this project is to identify and categorize common **code smells** and **anti-patterns** within the source code, providing insights into how these issues can be resolved to improve code quality, maintainability, and scalability.

### **Identified Anti-Patterns**
The analysis identified several recurring code smells and anti-patterns, including:

- **Comments** (Incomplete or unnecessary comments)
- **Long Method** (Overly complex methods with high cyclomatic complexity)
- **Dead Code** (Unused variables and methods)
- **Lazy Class** (Classes with minimal functionality)
- **Alternative Classes with Different Interfaces** (Over-reliance on implementation-specific types instead of interfaces)
- **Shotgun Surgery** (Modifications requiring changes across multiple classes)
- **Do More Than They Say** (Methods doing more than what their names suggest)
- **Do Less Than They Say** (Empty or unimplemented methods)
- **Bloaters** (Redundant imports, inefficient loops)
- **Dispensable Elements** (Unused fields, redundant statements)

### **Tools Used**

- **PMD Source Code Analyzer**: A static code analysis tool that helps detect code smells, anti-patterns, and violations of coding standards.
- **CPD (Copy-Paste Detector)**: Identifies duplicated code across different files in the codebase.

###**Run PMD to analyze the code:**
-**pmd.bat check -d c:\src -R rulesets/java/quickstart.xml -f text
