package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="./Featurefiles//Login2.feature",glue="stepdefinition",
                    dryRun=false,
                    monochrome=true,
                    plugin= {"pretty","html:test-output"}
                    		)
public class Runnerclass {

}
