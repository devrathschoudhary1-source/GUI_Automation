package listeners;



import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners
        implements ITestListener {

    @Override
    public void onTestStart(
            ITestResult result) {

        System.out.println(
                "STARTED : "
                        + result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        System.out.println(
                "PASSED : "
                        + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("FAILED : " + result.getName());

        if(result.getThrowable() != null) {
            result.getThrowable().printStackTrace();
        }
    }

    @Override
    public void onStart(
            ITestContext context) {

        System.out.println(
                "SUITE STARTED");
    }

    @Override
    public void onFinish(
            ITestContext context) {

        System.out.println(
                "SUITE FINISHED");
    }
}
