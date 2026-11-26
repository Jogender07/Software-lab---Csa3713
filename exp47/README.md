# Experiment 47: Integration Testing for Library Management System

## 1. Aim
To write JUnit test cases to execute integration testing for a library management system.

## 2. Algorithm
1. Create the Maven project with junit-jupiter. Write the classes `Book`, `Member` (borrowing limit = 2) and `Library` that depend on each other.
2. Create the `Library` with real `Book` and `Member` objects in `@BeforeEach` so that the interfaces between the modules are tested together.
3. Write six integration tests: issue a book, issue it twice, exceed the limit, return a book, return a book not borrowed and unknown member.
4. Run the tests using `mvn test`, verify the output and stop.

## 3. Program Code & Test Suite

### Book.java
`java
public class Book {
    private final String isbn, title;
    private boolean available = true;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }
}
`

### Library.java
`java
import java.util.*;

public class Library {
    private final Map<String, Book> books = new HashMap<>();
    private final Map<String, Member> members = new HashMap<>();

    public void addBook(Book b) { books.put(b.getIsbn(), b); }
    public void addMember(Member m) { members.put(m.getId(), m); }

    public boolean issueBook(String memberId, String isbn) {
        Member m = members.get(memberId);
        Book b = books.get(isbn);
        if (m == null || b == null || !b.isAvailable() || !m.canBorrow()) return false;
        b.setAvailable(false);
        m.getBorrowed().add(b);
        return true;
    }

    public boolean returnBook(String memberId, String isbn) {
        Member m = members.get(memberId);
        Book b = books.get(isbn);
        if (m == null || b == null || !m.getBorrowed().remove(b)) return false;
        b.setAvailable(true);
        return true;
    }
}
`

### LibraryIntegrationTest.java
`java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryIntegrationTest {
    private Library library;
    private Book b1, b2, b3;

    @BeforeEach
    void setUp() {
        library = new Library();
        b1 = new Book("111", "Software Testing");
        b2 = new Book("222", "Effective Java");
        b3 = new Book("333", "Exploratory Testing");
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addMember(new Member("M1"));
    }

    @Test
    void issueAvailableBook() {
        assertTrue(library.issueBook("M1", "111"));
        assertFalse(b1.isAvailable());
    }

    @Test
    void sameBookCannotBeIssuedTwice() {
        assertTrue(library.issueBook("M1", "111"));
        assertFalse(library.issueBook("M1", "111"));
    }

    @Test
    void borrowingLimitIsEnforced() {
        assertTrue(library.issueBook("M1", "111"));
        assertTrue(library.issueBook("M1", "222"));
        assertFalse(library.issueBook("M1", "333"));
    }

    @Test
    void returnBookMakesItAvailable() {
        library.issueBook("M1", "111");
        assertTrue(library.returnBook("M1", "111"));
        assertTrue(b1.isAvailable());
    }

    @Test
    void returnBookNotBorrowedFails() {
        assertFalse(library.returnBook("M1", "222"));
    }

    @Test
    void unknownMemberCannotBorrow() {
        assertFalse(library.issueBook("M9", "111"));
    }
}
`

### Member.java
`java
import java.util.*;

public class Member {
    public static final int LIMIT = 2;
    private final String id;
    private final List<Book> borrowed = new ArrayList<>();

    public Member(String id) { this.id = id; }
    public String getId() { return id; }
    public List<Book> getBorrowed() { return borrowed; }
    public boolean canBorrow() { return borrowed.size() < LIMIT; }
}
`


## 4. Execution Instructions
Run via Maven from project root:
```powershell
mvn test -Dtest=com.csa37.co3.ex47.LibraryIntegrationTest
```

## 5. Expected Output
```
[INFO] Running com.csa37.co3.ex47.LibraryIntegrationTest
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

## 6. Actual Execution Status
- Verified with Maven 3.9.6 on JDK 27.
- Status: **PASSED (6 / 6 tests passing)**.

## 7. Result
Thus the JUnit test cases to execute integration testing for a library management system were executed successfully and the output was verified.
