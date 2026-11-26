# Exercise 26: Implement Boundary Value Analysis for a Student Grade Evaluation System using JUnit (JUnit)

## Aim
To write JUnit test cases to implement boundary value analysis for a student grade evaluation system using JUnit.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `GradeEvaluator` with the method `grade(int marks)`: A (90-100), B (80-89), C (70-79), D (60-69), E (50-59), F (0-49) and an exception for marks outside 0 to 100.
3. **Step 3:** Identify the boundary values of every grade range: the lower boundary, the upper boundary and the values just outside the range.
4. **Step 4:** Write a `@ParameterizedTest` with `@CsvSource` that checks the grade for the 12 valid boundary values.
5. **Step 5:** Write a second `@ParameterizedTest` with `@ValueSource(ints = {-1, 101})` that expects `IllegalArgumentException`.
6. **Step 6:** Run the tests using `mvn test` and verify the output.
7. **Step 7:** Stop.

## Program Code

### GradeEvaluator.java
`java
public class GradeEvaluator {
    public static String grade(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
        if (marks >= 90) return "A";
        if (marks >= 80) return "B";
        if (marks >= 70) return "C";
        if (marks >= 60) return "D";
        if (marks >= 50) return "E";
        return "F";
    }
}
`

### GradeEvaluatorBVATest.java
`java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class GradeEvaluatorBVATest {
    @ParameterizedTest(name = "marks {0} -> grade {1}")
    @CsvSource({"0,F", "49,F", "50,E", "59,E", "60,D", "69,D",
                "70,C", "79,C", "80,B", "89,B", "90,A", "100,A"})
    void validBoundaryValues(int marks, String expected) {
        assertEquals(expected, GradeEvaluator.grade(marks));
    }

    @ParameterizedTest(name = "invalid marks {0}")
    @ValueSource(ints = {-1, 101})
    void invalidBoundaryValues(int marks) {
        assertThrows(IllegalArgumentException.class, () -> GradeEvaluator.grade(marks));
    }
}
`


## Execution Instructions
```bash
mvn test -Dtest=GradeEvaluatorBVATest
```

## Expected Output
```
[INFO] Running com.csa37.co2.ex26.GradeEvaluatorBVATest
[INFO] Tests run: 14, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified with 14 parameterized boundary executions.

## Result
Thus the JUnit test cases to implement boundary value analysis for a student grade evaluation system using JUnit were executed successfully and the output was verified.
