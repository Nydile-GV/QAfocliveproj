package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:FeatureFiles/Register.feature"},
//if you want to execute login, change it to login feature file "login.feature"
glue = {"classpath: com.tutorialsninja.automation.stepdef"},
plugin = {"html:target/cucumber_report"},
tags = {"@Register","One","Two","Three","Four"})
//for login, change register to @login
public class Runner {

}
