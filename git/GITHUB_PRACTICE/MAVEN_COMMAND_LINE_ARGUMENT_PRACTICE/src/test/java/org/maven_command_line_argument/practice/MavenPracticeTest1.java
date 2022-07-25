package org.maven_command_line_argument.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenPracticeTest1 {
	@Test
	public void mavenPracticeTest1() {
		Reporter.log("practice1 ====> MavenPracticeTest1",true);
	}

	@Test
	public void mavenPracticeTest2() {

		Reporter.log("practice2 ====> MavenPracticeTest0001",true);
		Reporter.log("practice2 ====> MavenPracticeTest1",true);
	}

	@Test
	public void mavenPracticeTest3() {
		Reporter.log("practice3 ====> MavenPracticeTest1",true);
	}
}
