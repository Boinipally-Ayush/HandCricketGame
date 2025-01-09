# Hand Cricket Game

This is a simple Java-based implementation of the **Hand Cricket Game**, where the player competes against the computer in a simulated cricket match. The game involves a toss, batting, and bowling, with outcomes based on random number generation and user input.

## Features

- **Toss Mechanism**: Choose between "Odd" or "Even" to determine who wins the toss.
- **Bat or Bowl**: Decide whether to bat or bowl after winning the toss.
- **Random Scoring**: Uses random numbers to simulate the computer's actions.
- **Two Innings**: Play two innings (first and second) and chase or defend scores.
- **Result Announcement**: Displays whether you won, lost, or the match was a draw.

## Gameplay

1. The player chooses between "Odd" or "Even" for the toss.
2. Both player and computer input a number between 1-6. The sum determines the toss winner.
3. The toss winner decides to either bat or bowl first.
4. During the innings:
   - Players input numbers between 1-6 for batting or bowling.
   - If the numbers match, the player or computer is "out."
5. The game alternates roles for the second innings.
6. The final result is displayed after both innings.

## Technologies Used

- **Programming Language**: Java
- **Tools**: Random number generation and console-based inputs.

## How to Run

1. Compile the Java file:
   ```bash
   javac HandCricket.java
