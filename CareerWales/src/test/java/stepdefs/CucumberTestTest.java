package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by isaacthomas on 18/09/2018.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"stepdefs"},
        features = {"src/test/resource"})
public class CucumberTestTest {

}