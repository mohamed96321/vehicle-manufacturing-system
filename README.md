# Vehicle Manufacturing System

**System Road:**
```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── company
│   │   │   │   │   ├── vehicles
│   │   │   │   │   │   ├── Vehicle.java
│   │   │   │   │   │   ├── Car.java
│   │   │   │   │   │   ├── Truck.java
│   │   │   │   │   ├── factories
│   │   │   │   │   │   ├── VehicleFactory.java
│   │   │   │   │   │   ├── CarFactory.java
│   │   │   │   │   │   ├── TruckFactory.java
│   │   │   │   │   ├── observers
│   │   │   │   │   │   ├── VehicleObserver.java
│   │   │   │   │   │   ├── AssemblyLineObserver.java
│   │   │   │   │   ├── strategies
│   │   │   │   │   │   ├── TestingStrategy.java
│   │   │   │   │   │   ├── CrashTestStrategy.java
│   │   │   │   │   │   ├── EmissionTestStrategy.java
│   │   │   │   │   ├── QualityControlManager.java
│   │   │   │   │   ├── Main.java
│
├── test
│   ├── java
│   │   ├── com
│   │   │   ├── company
│   │   │   │   ├── vehicles
│   │   │   │   │   ├── Car.java
│   │   │   │   │   ├── Truck.java
│   │   │   │   │   ├── Vehicle.java
│   │   │   │   ├── factories
│   │   │   │   │   ├── TruckFactory.java
│   │   │   │   │   ├── CarFactory.java
│   │   │   │   │   ├── VehicleFactory.java
│   │   │   │   ├── strategies
│   │   │   │   │   ├── CrashTestStrategy.java
│   │   │   │   │   ├── TestingStrategy.java
│   │   │   │   │   ├── EmissionTestStrategy.java
│   │   │   │   ├── QualityControlManager.java
│   │   │   │   ├── QualityControlManagerTest.java
│
├── out
│
├── lib
    ├── hamcrest-core-1.3.jar
    ├── junit-4.13.2.jar
```

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