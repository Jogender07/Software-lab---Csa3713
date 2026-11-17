import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class TestRunner {
    public static void main(String[] args) {
        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(DiscountTest.class)).build();
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();
        launcher.execute(request, listener);
        TestExecutionSummary summary = listener.getSummary();
        long found = summary.getTestsFoundCount(), passed = summary.getTestsSucceededCount();
        long failed = summary.getTestsFailedCount();
        System.out.println("Tests found      : " + found);
        System.out.println("Tests succeeded  : " + passed);
        System.out.println("Tests failed     : " + failed);
        System.out.printf("Pass percentage  : %.2f%%%n", passed * 100.0 / found);
        summary.getFailures().forEach(f ->
                System.out.println("FAILED TEST      : "
                        + f.getTestIdentifier().getDisplayName()));
    }
}
