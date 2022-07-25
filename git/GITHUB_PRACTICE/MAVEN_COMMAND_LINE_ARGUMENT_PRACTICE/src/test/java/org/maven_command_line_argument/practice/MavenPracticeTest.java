package org.maven_command_line_argument.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenPracticeTest {

@Test
public void mavenPracticeTest() {
	
	
	System.out.println("making changes");
	System.out.println("in MAVEN_PRACTICE_TEST_CLASS");
	//changing as master
	
	Reporter.log("add");
	Reporter.log("add");
	Reporter.log("practice ====> MavenPracticeTest",true);
}

@Test
public void mavenPracticeTest1() {
	Reporter.log("practice1 ====> MavenPracticeTest",true);
}

@Test
public void mavenPracticeTest2() {
	Reporter.log("practice2 ====> MavenPracticeTest",true);
}
	
}
