# Prime Number Checker

A simple Java program to check if a given number is prime or not.

## Description

This program prompts the user to enter a number and then determines whether the number is prime or not. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

## How It Works

The program uses a simple algorithm to check for primality:
1. If the number is less than or equal to 1, it is not prime.
2. For numbers greater than 1, it checks divisibility from 2 up to the square root of the number.
3. If any divisor is found, the number is not prime.
4. If no divisors are found, the number is prime.

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed on your machine.

### Compilation
Open a terminal in the `src` directory and compile the program:
```bash
javac Main.java
```

### Execution
Run the compiled program:
```bash
java Main
```

### Example
```
Enter number for checking prime : 17
Entered number: 17 is a prime number
```

```
Enter number for checking prime : 15
Entered number: 15 is not a prime number
```

## File Structure
```
PrimeNumberCheck/
├── README.md
└── src/
    └── Main.java
```

Contributed By [Sm Satheesh](https://github.com/smsatheesh)