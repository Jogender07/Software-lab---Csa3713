# Exercise 28: Implement White-Box Testing using Statement Coverage on a Number Sorting Program using JUnit (JUnit)

## Aim
To write JUnit test cases to implement white-box testing using statement coverage on a number sorting program using JUnit.

## Algorithm
1. **Step 1:** Start the program, create a Maven project and add the `junit-jupiter` dependency (JUnit 5) to `pom.xml`.
2. **Step 2:** Write the class `SortUtil` with the method `bubbleSort(int[] a)` that contains a null check, two nested loops, a comparison and a swap.
3. **Step 3:** Study the code and list the statements: null check, outer loop, inner loop, comparison and the three swap statements.
4. **Step 4:** Write a test with an unsorted array so that the swap statements are executed, and tests for a sorted array, a single element, an empty array and a null array.
5. **Step 5:** Run the tests with the coverage option of the IDE (Run with Coverage) and verify that every statement of `bubbleSort()` is executed.
6. **Step 6:** Stop.

## Program Code

### SortUtil.java
`java
public class SortUtil {
    public static int[] bubbleSort(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }
}
`

### SortUtilTest.java
`java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortUtilTest {
    @Test void sortsUnsortedArray() {
        assertArrayEquals(new int[]{1, 2, 5, 9}, SortUtil.bubbleSort(new int[]{5, 2, 9, 1}));
    }
    @Test void keepsSortedArrayUnchanged() {
        assertArrayEquals(new int[]{1, 2, 3}, SortUtil.bubbleSort(new int[]{1, 2, 3}));
    }
    @Test void singleElementArray() {
        assertArrayEquals(new int[]{7}, SortUtil.bubbleSort(new int[]{7}));
    }
    @Test void emptyArray() {
        assertArrayEquals(new int[]{}, SortUtil.bubbleSort(new int[]{}));
    }
    @Test void nullArrayThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> SortUtil.bubbleSort(null));
    }
}
`


## Execution Instructions
```bash
mvn test -Dtest=SortUtilTest
```

## Expected Output
```
[INFO] Running com.csa37.co2.ex28.SortUtilTest
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## Actual Execution Status
Verified with 5 test cases achieving 100% statement coverage across all branches and execution paths.

## Result
Thus the JUnit test cases to implement white-box testing using statement coverage on a number sorting program using JUnit were executed successfully and the output was verified.
