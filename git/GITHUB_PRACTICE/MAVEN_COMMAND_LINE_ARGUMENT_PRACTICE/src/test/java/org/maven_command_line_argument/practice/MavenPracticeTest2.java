package org.maven_command_line_argument.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenPracticeTest2 {

	@Test
	public void mavenPracticeTest2() {
		Reporter.log("practice1 ====> MavenPracticeTest2",true);

		//System.out.print();
		System.out.println();

	}
	
	@Test
	public void mavenPracticeTest3() {
		Reporter.log("practice2 ====> MavenPracticeTest2",true);
	}
	
	@Test
	public void mavenPracticeTest4() {
		Reporter.log("practice3 ====> MavenPracticeTest2",true);
	}
}
