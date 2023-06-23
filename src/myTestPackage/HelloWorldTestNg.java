package myTestPackage;

import org.testng.annotations.Test;

public class HelloWorldTestNg {
	@Test
	public void sampleTest() {
		System.out.print("Hello World Test NG!");
	}
	 @Test // add annotation every time
	 public void sampleTest2() {
	  System.out.print(5/0);
	  
	 }
	  


}