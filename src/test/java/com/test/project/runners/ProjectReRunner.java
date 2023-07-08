package com.test.project.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="@target/uiFailedTests.txt",
        //right click chooses copy path  on uiFailedTests.txt  then chooses content root and  provide @
        glue="com/test/sauce/stepdefinitions",
        //right click chooses copy path  on stepdefinitions package then choose source root
        tags="regression",
        plugin = {"pretty","html:target/uiReport.html","rerun:target/uiFailedTests.txt"}

)
public class ProjectReRunner {
}
