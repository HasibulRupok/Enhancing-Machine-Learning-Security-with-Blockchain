# Enhancing Machine Learning Security with Blockchain
## Machine Learning Parameters on Blockchain

### Summary:
This project demonstrates a simplified implementation of blockchain technology to store the parameters of a simplified machine learning model. It comprises classes for blocks in the blockchain, cryptographic hashing, blockchain validation, and a simulation in Java. The parameters (x1, x2, and c) of a linear equation y = a * x1 + b * x2 + c are represented in the blocks, forming a chain with references to previous blocks' hashes.

### Objective:
The objective is to explore blockchain as a secure means to store machine learning model parameters.

### Components:
- `block.java`: Defines the structure of a block in the blockchain containing data, hashes, and a timestamp.
- `crypto.java`: Implements SHA-256 hashing for data encryption.
- `isValid.java`: Validates the integrity of the blockchain by checking block hashes and references.
- `Main.java`: Initializes the blockchain and simulates storing parameters (`x1`, `x2`, and `c`) of a linear equation.

### How to Use:
1. Clone the repository.
2. Compile the Java files.
3. Run `Main.java` to simulate storing machine learning parameters on the blockchain.
4. View the output displaying the stored data and blockchain validation status.

### Key Points:
- Demonstrates a basic blockchain structure in Java.
- Simulates a linear equation (`y = a * x1 + b * x2 + c`) and stores its parameters in the blockchain.
- Validates the integrity of the blockchain using hashing and reference checks.

Feel free to explore and modify the code to understand blockchain concepts applied to machine learning parameters.
