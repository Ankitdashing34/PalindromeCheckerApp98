# PalindromeCheckerApp98
# Application Entry & Welcome Message

## Project Description

This Java application demonstrates the basic entry point of a Java program.
When the program starts, the Java Virtual Machine (JVM) calls the `main()` method and the application displays a welcome message along with the application name and version.

## Features

* Displays a welcome message when the application starts
* Shows application name
* Shows application version
* Demonstrates Java program execution using the `main()` method

## Technologies Used

* Java
* Java Virtual Machine (JVM)
* Any Java IDE (VS Code / IntelliJ IDEA / Eclipse)

## Project Structure

```
ApplicationEntry/
│
├── src/
│   └── ApplicationEntry.java
│
└── README.md
```

## Java Code

```java
public class ApplicationEntry {

    public static void main(String[] args) {

        String appName = "My Application";
        String appVersion = "Version 1.0";

        System.out.println("Welcome to " + appName);
        System.out.println(appVersion);
        System.out.println("Application started successfully.");
    }
}
```

## How to Run the Project

1. Install Java JDK.
2. Save the file as `ApplicationEntry.java`.
3. Open a terminal in the project folder.
4. Compile the program:

```
javac ApplicationEntry.java
```

5. Run the program:

```
java ApplicationEntry
```

## Example Output

```
Welcome to My Application
Version 1.0
Application started successfully.
```

