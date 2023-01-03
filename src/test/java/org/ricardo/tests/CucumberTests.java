package org.ricardo.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Cucumber.class)
@CucumberOptions(publish = true, features = {"src/test/resources/scenarios"}, glue = {"org.ricardo.scenarios"})
public class CucumberTests {

}
