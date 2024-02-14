# Vehicle Manufacturing System

## Project Overview
This project is a simple vehicle manufacturing system implemented in Java. It includes classes for vehicles, factories, observers, strategies, and a quality control manager.

### How to Compile and Run the Main Application
To compile and run the main application, use the following commands in the terminal:

**Compile files:**
```bash
javac -cp "out;lib/junit-4.13.2.jar" -d out -Xlint:deprecation src/main/java/com/company/*.java src/main/java/com/company/vehicles/*.java src/main/java/com/company/factories/*.java src/main/java/com/company/observers/*.java src/main/java/com/company/strategies/*.java
```

**Run files:**
```bash
java -cp "out;lib/junit-4.13.2.jar" com.company.Main
```

### How to Compile and Run the Test Of Application
To compile and run the test of application, use the following commands in the terminal:

**Compile test files:**
```bash
javac -cp "out;lib/junit-4.13.2.jar" -d out test/java/com/company/*.java test/java/com/company/vehicles/*.java test/java/com/company/factories/*.java test/java/com/company/strategies/*.java
```

**Run test file:**
```bash
java -cp "out;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore com.company.QualityControlManagerTest
```