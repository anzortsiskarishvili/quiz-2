# List Mapping Program

A Java program that transforms indices from one list to another using the `2n-1` formula.

## 📖 Description

This program demonstrates how to:
1. Map values from a numeric list (`List1`) to indices in a string list (`List2`)
2. Apply the transformation formula `index = 2n - 1` 
3. Generate the corresponding output sequence

## 🧮 Transformation Logic

For each integer `n` in `List1`:
```
Output = List2[2n - 1]
```

### Example:
| List1 Value | Calculation | List2 Index | Output |
|-------------|-------------|-------------|--------|
| 6           | 2*6 - 1 = 11 | 11          | "N1w"  |
| 4           | 2*4 - 1 = 7  | 7           | "lNU"  |

## 🛠️ Technical Implementation

```java
// Key components:
List<Integer> list1 = Arrays.asList(6, 4, 5,...);
List<String> list2 = Arrays.asList("Q7Zm", "D7PP",...);

// Transformation logic:
String result = list2.get(2 * n - 1);
```

## 🚀 How to Run

### Requirements:
- Java JDK 8+
- Maven (optional)

### Command Line:
```bash
javac Main.java
java Main
```

### Expected Output:
```
N1w
lNU
x6r8N
...
qBEL
```

## 📝 File Structure

```
project/
├── src/
│   └── Main.java       # Main program
├── README.md           # This documentation
└── pom.xml             # Maven config (if applicable)
```

## 📜 License
MIT License - Free for educational and commercial use

## ⁉️ FAQ

**Q: Why use `2n-1` for indexing?**  
A: This was the specified transformation rule in the original problem to map `List1` values to `List2` indices.

**Q: How to modify for different lists?**  
A: Simply change the `list1` and `list2` initialization values while maintaining the same index calculation logic.
