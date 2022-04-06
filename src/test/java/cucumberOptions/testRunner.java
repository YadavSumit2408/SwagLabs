package cucumberOptions;
//same
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


//@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue="stepDef")
public class testRunner extends AbstractTestNGCucumberTests{
}
