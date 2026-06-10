# Setup Instructions

## JDK Version Used

```text
java 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
```

---

## Hello World Program Execution

To verify that Java was installed and configured correctly, a simple "Hello World" program was created, compiled, and executed.

### Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Compilation

The program was compiled using the Java compiler:

```bash
javac HelloWorld.java
```

This command generated a `HelloWorld.class` file containing Java bytecode.

### Execution

The program was executed using:

```bash
java HelloWorld
```

### Output

```text
Hello, World!
```

### Explanation

The `main()` method serves as the entry point of the Java application. When the program is executed, the JVM loads the compiled bytecode from the `.class` file and executes the instructions within the `main()` method.

The statement:

```java
System.out.println("Hello, World!");
```

prints the text **"Hello, World!"** to the console. The successful execution of this program confirms that the Java Development Kit (JDK), Java Runtime Environment (JRE), and JVM have been installed and configured correctly.
