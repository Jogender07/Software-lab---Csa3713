import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;

public class ResultLogger implements TestWatcher {
    private void log(String status, ExtensionContext context) {
        try (FileWriter fw = new FileWriter("test-log.txt", true)) {
            String line = LocalDateTime.now() + " | " + status + " | " + context.getDisplayName();
            fw.write(line + System.lineSeparator());
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        log("PASS", context);
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        log("FAIL", context);
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        log("SKIP", context);
    }
}
