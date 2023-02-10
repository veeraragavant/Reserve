package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

@RunWith(cucumber.api.junit.Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ragav\\OneDrive\\Desktop\\Eclipse Workspace\\Reservation\\src\\test\\java\\com\\Feature", glue = "com.Steps", tags = "@TC-120", dryRun = false, monochrome = true, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target\\Extents Report.html"})

public class Runner {

}


//, plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target\\Extents Report.html"}