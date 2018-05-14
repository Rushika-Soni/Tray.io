package io_tray_runnerFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/Prishasoni/eclipse-workspace/Tray.io_BDD/src/main/resources/io_tray_featureFile"
		,glue = {"io_tray_StepDefinition"}
		,tags = {"@WorkflowTesting"},
				dryRun= false

		)

public class RunnerFile {

}
