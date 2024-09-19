# SudokuSolver# Sudoku Solver with Docker

This project is an interactive Sudoku solver implemented in Java and packaged with Docker. The solver uses a backtracking algorithm to find solutions to a given Sudoku puzzle.

## Features
- Solve any 9x9 Sudoku puzzle interactively via terminal input.
- Implemented using a simple backtracking algorithm.
- Dockerized for easy portability and usage without Java setup.

## Getting Started

### Prerequisites

- **Docker**: Make sure Docker is installed on your system. You can install it from [Docker's official website](https://www.docker.com/get-started).

### Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/sudoku-solver-docker.git
    cd sudoku-solver-docker
    ```

2. Build the Docker image:

    ```bash
    docker build -t sudoku-solver .
    ```

3. Run the Docker container:

    ```bash
    docker run -it sudoku-solver
    ```

4. Enter the Sudoku puzzle interactively when prompted (use `0` for empty cells).

### Example Input

```plaintext
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9

```

## Expected Features

- **Interactive Input:** The solver allows users to input Sudoku puzzles directly through the terminal, making it simple and easy to use.
- **Backtracking Algorithm:** Efficiently solves any Sudoku puzzle using a recursive backtracking method, ensuring solutions for solvable puzzles.
- **Docker Compatibility:** Bundled with Docker to avoid local Java setup complexities. This makes the application easy to run across different platforms without requiring Java installation.

## Tech Stack Used

- **Java**: Chosen for its robust standard library and familiarity in implementing algorithms. It allows easy setup for basic I/O interactions.
- **Docker**: Used to containerize the application, providing portability across different systems and environments. Docker ensures that all dependencies are bundled, eliminating "works on my machine" problems.

## Problems Faced & Troubleshooting

- **Problem:** Initial issues with Docker configuration, where the application wasn't properly handling input inside the Docker container.
  - **Solution:** The issue was fixed by ensuring that the Docker container was run with `-it` (interactive and TTY) to allow proper terminal interaction inside the container.
  
- **Problem:** Encountered difficulty in identifying where the program failed when the Sudoku puzzle was unsolvable.
  - **Solution:** Added more debug prints to trace backtracking and safe checks in the code to ensure clarity on the cause of the failure. These logs were later removed for cleaner output.

## Future Enhancements

- **GUI Support:** Integrating a simple graphical user interface (GUI) for a more user-friendly experience, allowing users to solve puzzles without terminal input.
- **Performance Improvements:** Optimize the backtracking algorithm to solve more complex puzzles faster.
- **Additional Puzzle Formats:** Expand support for other puzzle formats, such as 16x16 Sudoku grids, and include an option to upload puzzles from a file.
