package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/cucumber-report.html",

        // To get the path of definitions
        // Right click step_definitions, Copy Path/Reference, select Path from source root, paste
        glue = "com/cydeo/step_definitions",

        // To get the path of feature files
        // Right click features, Copy Path/Reference, select Path from content root, paste
        features = "src/test/resources/features",

        // true to get unimplemented snippets
        // false to run the methods
        dryRun = true,

        // Work in progress scenario
        tags = "@wip"
)

public class CukesRunner {
}
