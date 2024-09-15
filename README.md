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
