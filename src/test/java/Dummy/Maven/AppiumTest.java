package Dummy.Maven;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void appiumTest()
	{
		System.out.println("It's appium test");
		Assert.assertEquals(true, true);
	}

}
