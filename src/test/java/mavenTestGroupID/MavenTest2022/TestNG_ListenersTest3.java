package mavenTestGroupID.MavenTest2022;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

 
public class TestNG_ListenersTest3 {
	
  
  @BeforeClass
  public void setUp() {
	  System.out.println("TestNG_ListenersTest3 Code in Before Class");
	  
  }

  @AfterClass
  public void cleanUp() {
	  System.out.println("TestNG_ListenersTest3 Code in After Class");
  }
  
  @Test
  public void testMethod1() {
	  System.out.println("TestNG_ListenersTest3 Code in testMethod1");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("TestNG_ListenersTest3 Code in testMethod2");
	  Assert.assertTrue(true);
  }
  
   

}
