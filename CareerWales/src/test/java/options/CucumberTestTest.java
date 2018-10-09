package options;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Created by isaacthomas on 18/09/2018.
 */


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"stepdefs"},
        features = {"src/test/features"})
public class CucumberTestTest {

}